package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	@Test
	
	public void demo() {
		String s1="hello";
		String s2="hii";
		Assert.assertEquals(s1, s2);
		
		System.out.println(s1);
		System.out.println(s2);
	}
}
