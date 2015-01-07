/**
 * program for output
 */
package in.bandari.java;

/**
 * @author Hareesh
 *
 */
public class NoTypoMistake {
	
    public boolean test(int[] nums){
        int a=-1;
        int b=-1;
    	 for (int i = 0; i < nums.length; i++) {
    	        if (nums[i] ==1) a = i;
    	        if (nums[i] == 2) b = i;
    	    }
        
        return b != -1 && b > a;
    }
    public static void main(String []args){
    	int[] nums={100,1000,10,1010};
        System.out.println("out put :"+new NoTypoMistake().test(nums));
    }
}
