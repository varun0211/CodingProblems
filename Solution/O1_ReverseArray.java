public class O1_ReverseArray {

	public static void main(String[] args) {
		int[] arr = {4, 5, 1, 2};
		reverseArray(arr);
		printArray(arr);
	}

	public static void reverseArray(int[] arr) {
		int start=0, end=arr.length-1;
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void printArray(int[] arr) {
		for(int i:arr) 
			System.out.print(i+" ");
	}

}