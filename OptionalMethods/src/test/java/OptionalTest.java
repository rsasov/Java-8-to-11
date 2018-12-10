import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class OptionalTest {

    @Test
    public void testOptionalOrElseThrow() {
        //given
        Optional<String> emptyOptional = Optional.empty();

        //when
        assertThrows(NoSuchElementException.class, () -> emptyOptional.orElseThrow());
    }
    @Test
    public void testOptionalStreamWithPresent() {
        // given
        Optional<String> value = Optional.of("a");

        // when
        List<String> collect = value.stream().map(String::toUpperCase).collect(Collectors.toList());

        // then
        assertTrue(collect.equals(List.of("A")));
    }
    @Test
    public void testOptionalStreamWithNoPresent() {
        // given
        Optional<String> value = Optional.empty();

        // when
        List<String> collect = value.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // then
        assertTrue(collect.isEmpty());
    }
}

