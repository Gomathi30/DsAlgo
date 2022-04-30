package listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestNGListeners.class)
public class TestNGListenerDemo {

	@Test
	public void test1()
	{
		System.out.println("Inside test1");
	}
	
	@Test
	public void test2() {
		System.out.println("Inside test2");
		Assert.assertTrue(false);
	}
	
	@Test
	public void test3() {
		System.out.println("Inside test3");
		throw new SkipException("This is skipped");
	}
}
