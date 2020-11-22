import org.junit.Assert;
import org.junit.Test;
import ru.zavrazhin.PalindromeSolution;

public class PalindromeSolutionTest {

    @Test
    public void testIsPalindrome() {
        boolean result = PalindromeSolution.isPalindrome("12321");
        Assert.assertTrue(result);
    }

    @Test
    public void testIsNotPalindrome() {
        boolean result = PalindromeSolution.isPalindrome("112311");
        Assert.assertFalse(result);
    }

    @Test
    public void testEmptyString() {
        boolean result = PalindromeSolution.isPalindrome("");
        Assert.assertFalse(result);
    }

    @Test
    public void testNull() {
        boolean result = PalindromeSolution.isPalindrome(null);
        Assert.assertFalse(result);
    }
}
