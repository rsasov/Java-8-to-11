package eu.deltasource.training.httpclient;

import java.net.Authenticator;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * Created by Vasil Filipov - Delta Source Bulgaria on 11.12.18
 */
public class SendRequestAsynchronous {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // Create Request
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://deltasource.eu/"))
                .timeout(Duration.ofMinutes(1))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString("some string"))
                .build();

        // Create Client
        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .followRedirects(HttpClient.Redirect.ALWAYS)
                .authenticator(Authenticator.getDefault())
                .build();

        // Send Request Asynchronous
        CompletableFuture<HttpResponse<String>> future = client.sendAsync(request,
                HttpResponse.BodyHandlers.ofString());

        future.thenApply(HttpResponse::body)            // retrieve body of response
                .thenAccept(System.out::println);       // use body as String
    }
}