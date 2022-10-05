import org.junit.Assert;
import org.testng.annotations.Test;

public class RerunAnalyser {@Test
	private void test1() {
    System.out.println("classB test1");
	}
	@Test(retryAnalyzer =RerunFailed.class )
	private void test2() {
		Assert.assertTrue(false);
    System.out.println("classB test2");
	}
	@Test
	private void test3() {
    System.out.println("classB test3");
	}
}
