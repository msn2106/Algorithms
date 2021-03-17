package recursion;

import java.util.Scanner;

public class reverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int t = Integer.parseInt(sc.nextLine());
            while(t-- >0){
                //StringBuilder s = new StringBuilder(sc.nextLine());
                //System.out.println(s.reverse());
                String s = sc.nextLine();
                char[] ch = s.toCharArray();
                reverse(ch,0,s.length()-1);
                String rev = new String(ch);
                System.out.println(rev);
            }
        }
        sc.close();
    }

    static void reverse(char[] s, int start, int end){
        if(start < end){
            swap(s,start,end);
            reverse(s,start+1,end-1);
        }
    }

    static void swap(char[] s,int start,int end){
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
    }
}

/*As string is immutable you either have to swap and rewrite in string every time
* The above approch will create new string objects in heap.
* The better approach is convert to char array.
* In later approach O(1) time will be elapsed for swaping.
* */