package testcases;
import org.junit.Assume;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ShopMobilePhoneTest {
	@Test
	public void test_a_searchForMobile() {
		System.out.println("Searching for mobile");
	}
	@Test
	public void test_b_selectMobile() {
		System.out.println("selecting mobile");
	}
	//@Ignore
	@Test
	public void test_c_checkout() {
		Assume.assumeTrue(false);
		System.out.println("Checkout");
	}
}
