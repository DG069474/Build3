import org.junit.Test;

import static org.junit.Assert.*;

public class testUseClass {
	@Test
	public void testUse() {
		useAdds use = new useAdds();
    		use.setNums();
    		int[] nums = use.getNums();
    		int answer = nums[0] + nums[1];
    
		assertEquals(answer, use.use());
	}

}
