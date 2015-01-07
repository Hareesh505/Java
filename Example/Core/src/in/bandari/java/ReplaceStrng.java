/**
 * Program for return String add * in between two letter which are same.
 */
package in.bandari.java;


/**
 * @author Hareesh
 *
 */
public class ReplaceStrng {
	 String replaceStr(String str) {
		    if (str.length() < 2) return str;
		    if (str.charAt(0) == str.charAt(1))
		        return str.charAt(0) + "*" + replaceStr(str.substring(1));
		    return str.charAt(0) + replaceStr(str.substring(1));
		}
	 public static void main(String[] args){
		 System.out.println("OUT_PUT :" + new ReplaceStrng().replaceStr("hello"));
	 }
}
