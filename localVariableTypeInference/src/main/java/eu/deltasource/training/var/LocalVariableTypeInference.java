package eu.deltasource.training.var;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vasil Filipov - Delta Source Bulgaria on 10.12.18
 */
public class LocalVariableTypeInference {
    public static void main(String[] args) throws IOException {

        // Diamond operator and Generic Methods
        List<String> names = new ArrayList<>();

        List<String> v1 = new ArrayList<>(names);   // List<String>

        var v2 = new ArrayList<>(names);            // ArrayList<String>

        List<String> v3 = new ArrayList<>();        // List<String>

        var v4 = new ArrayList<>();                 // ArrayList<Object>

    }

    // Programming to the interface
    List<String> getNames(List<String> initialNames) {
        List<String> names = new ArrayList<>(initialNames);

        // Some logic regarding names

        return names;
    }
}
