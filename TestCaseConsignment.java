package consignmentDeliveryTracking;

import java.util.List;
import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestCaseConsignment {
	@Parameter(0)
	public Object[] args;
	
	@Parameters
	public static List<Object[][]> data(){
		Object[][][] mydata=new Object[][][] {{{"Saree"}}, {{"Coffee"}}, {{"Apple"}}, {{"Chips"}}, {{"Rice"}}};
		return Arrays.asList(mydata);
	}
	
	@Test
	public void testMain() {
		Consignment.main(args);
	}

}