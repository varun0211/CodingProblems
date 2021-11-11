// https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1#

import java.util.*;

class SubArraySum {

	public static void main(String[] args) {
		int[] arr = {135, 101, 170, 125, 79, 159, 163, 65, 106, 146, 82, 28, 162, 92, 196, 143, 28, 37, 192, 5, 103, 154, 93, 183, 22, 117, 119, 96, 48, 127, 172, 139, 70, 113, 68, 100, 36, 95, 104, 12, 123, 134};
		int s = 468;
		ArrayList<Integer> output = subarraySum(arr,s);
		printArray(output);
	}

	public static ArrayList<Integer> subarraySum(int[] arr, int s) {
		int start=0, sum=0;
		ArrayList<Integer> list = new ArrayList<>();
		for(int end=0; end<arr.length; end++) {
			sum += arr[end];
			while(sum>s && start<end) {
				sum -= arr[start];
				start++;
			}
			if(sum==s) {
				list.add(++start);
				list.add(++end);
				break;
			}
		}
		if(list.isEmpty())
			list.add(-1);
		return list;
	}

	public static void printArray(ArrayList<Integer> output) {
		for(int i=0; i<output.size(); i++) {
			System.out.print(output.get(i)+" ");
		}
	}
}

