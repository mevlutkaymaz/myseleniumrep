package testcases;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class LoginTest {
	String username;
	String password;
	String browser;
	public LoginTest(String username, String password, String browser) {
		this.username=username;
		this.password=password;
		this.browser=browser;
	}
	
	@Test
	public void loginTest() {
		System.out.println(username+"-----"+password+"------"+browser);
		
	}
	@Parameters
	public static Collection<Object[]> getData(){
		Object[][] data=new Object[4][3];
		//first row
		data[0][0]="U1";
		data[0][1]="P1";
		data[0][2]="Mozilla";
		//second row
		data[1][0]="U2";
		data[1][1]="P2";
		data[1][2]="Chrome";
		//Third row
		data[2][0]="U3";
		data[2][1]="P3";
		data[2][2]="IE";
		//Third row
		data[3][0]="U4";
		data[3][1]="P4";
		data[3][2]="Safari";
		return Arrays.asList(data);
	}

}
