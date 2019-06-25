import org.junit.Test;

import static org.junit.Assert.*;

public class testAdds {
	@Test
	public void testUse() {
		useAdds use = new UseAdds();
    use.setNums();
    int[] nums = use.getNums();
    int answer = nums[0] + nums[1];
    
		assertEquals(answer, use.use());
	}

}
