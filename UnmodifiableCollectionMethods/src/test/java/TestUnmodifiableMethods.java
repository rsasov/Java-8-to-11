import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestUnmodifiableMethods {
    @Test
    public void testUnModifiableList() {
        //given
        List<String> values = List.of("delta","source");

        //when
        assertThrows(UnsupportedOperationException.class,()->values.add("eu"));
    }

    @Test
    public void testUnmodifiableListCopy() {
        //given
        List<String> values = new ArrayList<>();
        values.add("delta");
        values.add("source");
        values.add("eu");
        List<String> copyValues = List.copyOf(values);

        //when
        assertThrows(UnsupportedOperationException.class,()->copyValues.add("foo"));
    }

    @Test
    public void testUnModifiableMap() {
        //given
        Map<Integer, String> values = Map.of(1,"delta",2,"source");

        //when
        assertThrows(UnsupportedOperationException.class,()->values.put(4,"eu"));
    }

    @Test
    public void testUnModifiableMapCopy() {
        //given
        Map<Integer, String> values = new HashMap<>();
        values.put(1, "delta");
        values.put(2, "source");
        values.put(3, "eu");
        Map<Integer, String> copyValues = Map.copyOf(values);

        //when
        assertThrows(UnsupportedOperationException.class,()->copyValues.put(4,"eu"));
    }
}
