package sorting;

/**
 * Heap sort is a comparison based sorting technique based on
 * Binary Heap data structure. It is similar to selection sort
 * where we first find the minimum element and place the minimum element
 * at the beginning. We repeat the same process for the remaining elements.
 *
 * If Parent is at i in 0 based indexing - left child will be at (2*i)+1 index in array
 * and right child will be at (2*i)+2 index in the array.
 *
 * The time complexity of heapify is O(logn) and buildHeap is O(n) making
 * HeapSort - O(nlogn), originally (n + nlogn)
 *
 * Heap sort is an in-place algorithm.
 * Its typical implementation is not stable, but can be made stable
 */
public class heapsort1 {
    public static void main(String[] args) {
        int[] a = {15,5,20,1,17,10,30};
        heapsort(a);
        for(int i : a) System.out.print(i+" ");
    }

    //main heap sort function
    static void heapsort(int[] a){
        int n = a.length;
        //building max heap
        for(int i= (n/2)-1; i >= 0 ; i--){
            heapify(a,n,i);
        }
        //one by one extract element from top of heap and send it to the end of array.
        for(int i = n-1; i > 0; i--){
            //move current root to the end
            //swap(a[0],a[i]);
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            //calling heapify for the reduced heap
            heapify(a,i,0);
        }
    }

    //function to heapify a subtree rooted at i
    static void heapify(int[] a,int n, int i){
        int largest = i;
        int lchild = (2*i)+1;
        int rchild = (2*i)+2;
        if(lchild < n && a[lchild] > a[largest])largest = lchild;
        if(rchild < n && a[rchild] > a[largest])largest = rchild;
        if(largest != i){
            int temp = a[largest];
            a[largest] = a[i];
            a[i] = temp;
            heapify(a,n,largest);
        }
    }
}
