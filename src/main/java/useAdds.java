import java.util.Random;

public class useAdds{
  private Random ran = new Random();
  private AddsNum num;
  private int one;
  private int two;
  
  public int use(){
    num = new AddsNum(one,two);
    return num.adds();  
  }
  public void setNums(){
    one = ran.nextInt(10) + 1;
    two = ran.nextInt(10) + 1;
  }
  public int[] getNums(){
    int[] nums = new int [2];
    nums[0] = one;
    nums[1] = two;
    return nums;
  }
}
