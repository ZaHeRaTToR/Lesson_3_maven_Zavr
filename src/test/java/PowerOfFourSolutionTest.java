import org.junit.Assert;
import org.junit.Test;
import ru.zavrazhin.PowerOfFourSolution;

public class PowerOfFourSolutionTest {
    @Test
    public void example1() {
        PowerOfFourSolution solution = new PowerOfFourSolution();
        boolean result = solution.isPowerOfFour(16);
        Assert.assertTrue(result);
    }

    @Test
    public void example2() {
        PowerOfFourSolution solution = new PowerOfFourSolution();
        boolean result = solution.isPowerOfFour(5);
        Assert.assertFalse(result);
    }

    @Test
    public void example3() {
        PowerOfFourSolution solution = new PowerOfFourSolution();
        boolean result = solution.isPowerOfFour(1);
        Assert.assertTrue(result);
    }
}
