/**
 * program for Return String that remove i and o in b/w hip,hop. Ex: hipXhop --> Returns hpXhp
 */
package in.bandari.java;

/**
 * @author Hareesh
 *
 */
public class HipHop {
    public static String hipHop(String str){
    	String rtnStr="";
    	int flag=0;
    	for(char c : str.toCharArray()){
    		if(flag == 0){
				rtnStr=rtnStr+c;
				if(c == 'h'){
					flag = 1;
				}
			}else if(c == 'p'){
				rtnStr=rtnStr+c;
				flag=0;
			}
    	}
        return rtnStr;
    }

    public static void main(String []args){
        System.out.println( hipHop("hipZhop"));
        System.out.println( hipHop("hophop"));
        System.out.println( hipHop("hihapophop"));
    }
}
