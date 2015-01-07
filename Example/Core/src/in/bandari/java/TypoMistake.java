/**
 * Sample Program
 */
package in.bandari.java;

/**
 * @author Hareesh
 *
 */
public class TypoMistake{
    public int[] nums={100,1000,10,1010};
    public int test(){
        int a=nums[0];
        int b=nums[0];
        for(int i=0;i<nums.length;i++){
            if (nums[i] > a) a = nums[i];  
            if (nums[i] <= b) b = nums[i];
        }
        return b-a;
    }
    public static void main(String []args){
        System.out.println("out put :"+new TypoMistake().test());
    }
}