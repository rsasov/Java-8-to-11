package eu.deltasource.training.var;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vasil Filipov - Delta Source Bulgaria on 10.12.18
 */
public class LocalVariableTypeInference {

    private static Integer getSomething() {
        return 5;
    }

    public static void main(String[] args) throws IOException {

        // Looks wrong
        var x = getSomething();

        var socket = new Socket();

        // Looks better
        var inputStream = socket.getInputStream();


        // Diamond operator and Generic Methods
        List<String> names = new ArrayList<>();

        List<String> v1 = new ArrayList<>(names);   // List<String>

        var v2 = new ArrayList<>(names);            // ArrayList<String>

        List<String> v3 = new ArrayList<>();        // List<String>

        var v4 = new ArrayList<>();                 // ArrayList<Object>

        var v5 = new ArrayList<String>();           // ArrayList<String>
    }

    // Programming to the interface
    List<String> getNames(List<String> initialNames) {
        // Change to var
        List<String> names = new ArrayList<>(initialNames);

        // Some logic regarding names

        return names;
    }
}
