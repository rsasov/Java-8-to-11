package eu.deltasource.training.var;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * Created by Vasil Filipov - Delta Source Bulgaria on 11.12.18
 */
public class VarBeforeAfter {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket();

        // Before
        try(InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, UTF_8);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            // Do something with buffered reader here..
        }

        // After
        try(var inputStream = socket.getInputStream();
            var inputStreamReader = new InputStreamReader(inputStream, UTF_8);
            var bufferedReader = new BufferedReader(inputStreamReader)) {
            // Do something with buffered reader here..
        }



        Map<String, Integer> keysWithValues = new HashMap<>();

        // Before
        for (Map.Entry<String, Integer> stringIntegerEntry : keysWithValues.entrySet()) {
            // Do something here
        }

        // After
        for (var stringIntegerEntry : keysWithValues.entrySet()) {
            // Do something here
        }
    }
}
