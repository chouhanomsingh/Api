package listener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listener.listnerImplementation.class)
public class TestClass extends Baseclass{
	@Test
	public void demo() {
		System.out.println("@Test");
		Assert.fail();
	}
}