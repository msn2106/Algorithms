/** This is a program to implement - Knuth Morris Pratt (KMP) Algorithm 
 */
package stringMatching;

/**
 * @author msn2106
 *
 */
public class KMPAlgorithm {

	public static void main(String[] args) {
		String text = "ababcabcabababd";
		//String text = "ABABDABACDABABCABAB";
		String pattern = "ababd";
		//String pattern = "ABABCABAB";
		char[] t = text.toCharArray();
		char[] p = pattern.toCharArray();
		
		search(t,p);
		
	}

	//function using KMP algo to find the pattern in text
	public static void search(char[] t, char[] p) {
		
		int tl = t.length - 1;
		int pl = p.length - 1;
		int i = 0; //index for text
		int j = 0; //index for pattern
		
		int[] lps = LPSArray(p);		//pre-process the pattern
			
		while( i < tl ) {
			if(p[j] == t[i]) {
				j++;
				i++;
				}
			if(j==pl) {
				System.out.println("Pattern found at index "+(i-j));
				j = lps[j-1];
			}
			//mismatch after j matches
			else {
				// Do not match lps[0..lps[j-1]] characters,they will match anyway
				if(i < tl && p[j] != t[i]) {
					if(j!=0) j = lps[j-1];
					else i++;				//if j == 0
				}
			}
		}
	}

	//function to calculate Longest proper prefix array
	private static int[] LPSArray(char[] p) {
		
		int pl = p.length;
		int[] lps = new int[pl];
		int len = 0;
		lps[0] = 0;
		// the loop calculates lps[i] for i = 1 to pl-1
		for(int i = 1; i < pl; i++) {
			if(p[len] == p[i] ) {
				lps[i]= ++len;
			}
			else {								// (pat[i] != pat[len]) 
				if(len != 0) {
					len = lps[len-1];			// Also, note that we do not increment i here 
				}
				else {							// if (len == 0) 
					lps[i] = len;
				}
			}
		}
		return lps;
	}
}
