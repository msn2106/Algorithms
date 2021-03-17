package stringMatching;

import java.util.*;

public class NaiveQuestion1
 {
	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    String[] str = {"R","RY","RYY",
	    "RRY","RYR","RRYY","RYYR",
	    "RYRYY","RYYRY"
	    };
	    int t = sc.nextInt();
	    sc.nextLine();
	    while(t-- >0){
	        String pat = sc.nextLine();
	        check(str,pat);
	    }
	    sc.close();
	 }
	 
	 //function to check whether the pattern can be formed using
	 //any combination of known strings
	 public static void check(String[] str, String pat){
	     boolean found = false;
	     for(int i=0;i<str.length;i++){
	         String text = str[i];
	         int tl = text.length();
	         int pl = pat.length();
	         if(tl != pl) break;
	         else{
	             for(int j=0;j<=tl-pl;j++){
	                 int k;
	                 for(k=0;k<pl;k++){
	                     if(text.charAt(j+k) != pat.charAt(j)) break;
	                 }
	                 if(k==pl) found = true;
	             }
	         }
	         
	         if(found) break;
	     }
	     if(found == true) System.out.println("YES");
	     else System.out.println("NO");
	 }
}
