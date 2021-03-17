/* Linear Search implementation using String array*/
package searching;

public class searchLinearArrayString {

	public static void main(String[] args) {
		String[] arr = {"mayank","akash","paras","dhiraj","ashish","manish"};
		String item = "gupta";
		int temp = 0;
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i].equals(item))
			{
				System.out.println(item+" is present at index "+i);
				temp = temp+1;
			}
		}
		if(temp==0) System.out.println("item not present in the array.");
	}

}
