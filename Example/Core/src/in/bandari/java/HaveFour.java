/**
 * program for the given array have Exactly two 4's,
 * and no 4's are next to each other
 */
package in.bandari.java;

/**
 * @author Sainath
 *
 */
public class HaveFour {
    public static boolean haveFour(int[] nums) {
    	int count=0;
    	int temp=0;
    	for(int i=0; i<nums.length;i++){
    		if(nums[i] == 4 && nums[i] != temp){
    			count ++;
    		}
    		temp = nums[i];
    	}
    	if(count == 2){
    		return true;
    	}
        return false;
    }

    public static void main(String []args){
        System.out.println(haveFour(new int[]{4, 1, 4, 2}));
        System.out.println(haveFour(new int[]{1, 4, 4, 2, 3}));
    }
}