import org.junit.Assert;
import org.junit.Test;
import ru.zavrazhin.StrobogrammaticNumberSolution;

public class StrobogrammaticNumberSolutionTest {
    @Test
    public void example1() {
        StrobogrammaticNumberSolution solution = new StrobogrammaticNumberSolution();
        boolean result = solution.isStrobogrammatic("69");
        Assert.assertTrue(result);
    }
    @Test
    public void example2() {
        StrobogrammaticNumberSolution solution = new StrobogrammaticNumberSolution();
        boolean result = solution.isStrobogrammatic("88");
        Assert.assertTrue(result);
    }
    @Test
    public void example3() {
        StrobogrammaticNumberSolution solution = new StrobogrammaticNumberSolution();
        boolean result = solution.isStrobogrammatic("962");
        Assert.assertFalse(result);
    }
    @Test
    public void example4() {
        StrobogrammaticNumberSolution solution = new StrobogrammaticNumberSolution();
        boolean result = solution.isStrobogrammatic("1");
        Assert.assertTrue(result);
    }
}
