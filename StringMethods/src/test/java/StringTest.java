import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringTest {
    @Test
    public void testSame() {
        //given
        String s = "\t abc \n";

        //when
        assertAll(() -> assertEquals("abc", s.trim()),
                  () -> assertEquals("abc", s.strip()));
    }

    @Test
    public void testDifferent() {
        /* U+2000 was added to Unicode in version 1.1 (1993).
        It belongs to the block  General Punctuation in the Basic Multilingual Plane.
        This character is a Space Separator and is commonly used, that is, in no specific script. */

        //given
        Character c = '\u2000';
        String s = c + "abc" + c;

        //when
        assertAll(() -> assertTrue(Character.isWhitespace(c)),
                  () -> assertEquals(s, s.trim()),
                  () -> assertEquals("abc", s.strip()));
    }
}
