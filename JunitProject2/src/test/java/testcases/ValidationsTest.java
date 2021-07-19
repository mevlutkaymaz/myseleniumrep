package testcases;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import junit.framework.Assert;

public class ValidationsTest {
	@Rule
	public ErrorCollector errCol =new ErrorCollector();
	
@Test
public void validate() {
	String expectedvalue="A";
	String actaulvalue="A1";
	System.out.println("start");
	try{
	Assert.assertEquals(expectedvalue, actaulvalue);
	} catch(Throwable t) {
		System.out.println("Error:"+t.getMessage());
		errCol.addError(t);
	}
	//Assert.assertEquals(expectedvalue, actaulvalue);
	try{
		Assert.assertTrue("Error Message", 4>12);
		} catch(Throwable t) {
			System.out.println("Error:"+t.getMessage());
			errCol.addError(t);
		}
	System.out.println("end");
	//Assert.assertFalse(message, condition);
	//Assert.fail("Had to be logged in but not");
}

}
