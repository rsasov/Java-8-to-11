import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

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
    public void testUnmodifiableCopy() {
        //given
        List<String> values = new ArrayList<>();
        values.add("delta");
        values.add("source");
        values.add("eu");
        List<String> copyValues = List.copyOf(values);

        //when
        assertThrows(UnsupportedOperationException.class,()->copyValues.add("foo"));
    }
}
