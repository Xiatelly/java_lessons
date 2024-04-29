import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    private final String TEST_STRING0 = "total count of occurrences";

    @Test
    void findSymbolOccurrence0(){
        char chr1 = 't';
        assertEquals(3, StringUtils.findSymbolOccurrence(TEST_STRING0, chr1));
    }
    @Test
    void findSymbolOccurrence1(){
        char chr1 = 'o';
        assertEquals(4, StringUtils.findSymbolOccurrence(TEST_STRING0, chr1));
    }

    @Test
    void findWordPosition0(){
        String target = "of";
        assertEquals(12, StringUtils.findWordPosition(TEST_STRING0, target));
    }

    @Test
    void findWordPosition1(){
        String target = "all";
        assertEquals(-1, StringUtils.findWordPosition(TEST_STRING0, target));
    }

    @Test
    void stringReverse0(){
        assertEquals("secnerrucco fo tnuoc latot", StringUtils.stringReverse(TEST_STRING0));
    }

    @Test
    void isPalindrome0(){
        assertTrue(StringUtils.isPalindrome("alla"));
    }

    @Test
    void isPalindrome1(){
        assertFalse(StringUtils.isPalindrome(TEST_STRING0));
    }
}