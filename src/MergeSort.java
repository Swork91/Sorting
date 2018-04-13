
public class MergeSort {
	//(divide)
	public static void mergeSort(int[] list) {
		if (list.length>1) {
			//spit first half
			int[] firstHalf = new int[list.length/2];
			System.arraycopy(list, 0, firstHalf, 0, list.length/2);
			mergeSort(firstHalf);
			
			//split second half
			int secondHalfLength = list.length-list.length/2;
			int[] secondHalf = new int[secondHalfLength];
			System.arraycopy(list, list.length/2, secondHalf, 0, secondHalfLength);
			mergeSort(secondHalf);
			
			//merge the two halves
			int[] temp = merge(firstHalf, secondHalf);
			System.arraycopy(temp, 0, list, 0, temp.length);
		}
	}
	
	//merge and sort lists(conquer)
	private static int[] merge(int[] list1, int[] list2) {
		int[] temp = new int[list1.length+list2.length];
		
		int current1 = 0;
		int current2 = 0;
		int current3 = 0;

		//compare first integer, store in 'temp'
		while (current1 < list1.length && current2 < list2.length) {
			if (list1[current1] < list2[current2]){
				temp[current3++] = list1[current1++];
			}
			else {
				temp[current3++] = list2[current2++];
			}
		}
		
		while (current1 < list1.length)
			temp[current3++] = list1[current1++];
		
		while (current2 < list2.length)
			temp[current3++] = list2[current2++];
		
		return temp;
	}

	public static void main(String[] args) {
		int[] hundredIntArray = {4, 37, 49, 2, 68, 7, 100, 10, 8, 23, 80, 94, 38, 59, 46, 40, 36, 13, 41, 51, 
				6, 29, 70, 75, 52, 3, 22, 26, 45, 53, 69, 14, 87, 56, 98, 21, 65, 84, 9, 50, 85, 31, 
				30, 96, 44, 15, 20, 25, 86, 67, 88, 63, 99, 42, 48, 77, 1, 19, 24, 11, 93, 71, 60, 
				61, 27, 73, 32, 33, 47, 62, 97, 91, 90, 54, 92, 34, 74, 18, 57, 39, 64, 81, 95, 66, 
				5, 89, 79, 12, 17, 35, 16, 82, 83, 72, 78, 55, 28, 43, 76, 58};
		mergeSort(hundredIntArray);
		
		System.out.print("Sorted array: ");
		for (int i=0; i<hundredIntArray.length; i++) {
			if (i%10==0) {
				System.out.print("\n");
			}
			System.out.print(hundredIntArray[i]+" ");
		}
	}

}
