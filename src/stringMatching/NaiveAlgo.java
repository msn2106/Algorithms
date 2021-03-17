/** This is a program to implement Naive String Matching Algorithm
 * 
 */
package stringMatching;

/**
 * @author msn2106
 *
 */
public class NaiveAlgo {
	public static void main(String[] args) {
		//String text = "AABAACAADAABAABA";
		String text = "THIS IS A TEST TEXT";
		//String pattern = "AABA";
		String pattern = "TEST";
		
		search(text,pattern);

	}

	//function to find the occurrences of pattern in text
	public static void search(String txt, String pat) 
    { 
        int M = pat.length(); 
        int N = txt.length(); 
  
        /* A loop to slide pat one by one */
        for (int i = 0; i <= N - M; i++) { 
  
            int j; 
  
            /* For current index i, check for pattern match */
            for (j = 0; j < M; j++) 
                if (txt.charAt(i + j) != pat.charAt(j)) 
                    break; 
  
            if (j == M) // if pat[0...M-1] = txt[i, i+1, ...i+M-1] 
                System.out.println("Pattern found at index " + i); 
            } 
    } 

}
