/**
 * Program For Given an array of ints, is it possible to divide the ints into two groups, 
 * so that the sum of the two groups is the same
 */
package in.bandari.java;

/**
 * @author Hareesh
 *
 */
public class CanSplit {
    public static boolean canSplit(int[] nums) {
        return new CanSplit().split(0, nums, 0, 0);
    }
    public static void main(String []args){
        System.out.println( canSplit(new int[]{1, 1}));
        System.out.println( canSplit(new int[]{1, 1, 1}));
        System.out.println( canSplit(new int[]{2, 4, 2}));
        System.out.println(canSplit(new int[]{2,4,2,6,2,8,5,3}));

    }
    boolean split(int index, int[] nums, int sum1, int sum2) {
	  if (index >= nums.length) {
	    return sum1 == sum2;
	  }

	  if (split(index + 1, nums, sum1 + nums[index], sum2)) {
	    return true;
	  }
	  if (split(index + 1, nums, sum1, sum2 + nums[index])) {
	    return true;
	  }

	  return false; 
	}

}
