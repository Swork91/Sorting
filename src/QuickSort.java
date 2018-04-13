
public class QuickSort {

	public static void main(String[] args) {
		int[] hundredIntArray = {4, 37, 49, 2, 68, 7, 100, 10, 8, 23, 80, 94, 38, 59, 46, 40, 36, 13, 41, 51, 
				6, 29, 70, 75, 52, 3, 22, 26, 45, 53, 69, 14, 87, 56, 98, 21, 65, 84, 9, 50, 85, 31, 
				30, 96, 44, 15, 20, 25, 86, 67, 88, 63, 99, 42, 48, 77, 1, 19, 24, 11, 93, 71, 60, 
				61, 27, 73, 32, 33, 47, 62, 97, 91, 90, 54, 92, 34, 74, 18, 57, 39, 64, 81, 95, 66, 
				5, 89, 79, 12, 17, 35, 16, 82, 83, 72, 78, 55, 28, 43, 76, 58};
		quickSort(hundredIntArray);
		
		System.out.print("Sorted array: ");
		for (int i=0; i<hundredIntArray.length; i++) {
			if (i%10==0) {
				System.out.print("\n");
			}
			System.out.print(hundredIntArray[i]+" ");
		}
	}

	private static void quickSort(int[] list) {
		quickSort(list, 0, list.length - 1);
	}

	private static void quickSort(int[] list, int first, int last) {
		if (first < last) {
			int pivotIndex = partition(list, first, last);
			quickSort(list, first, pivotIndex-1);
			quickSort(list, pivotIndex+1, last);
		}
		
	}

	private static int partition(int[] list, int first, int last) {
		int pivot = list[first];
		int low = first+1;
		int high = last;

		while (high > low) {
			//search forward from left
			while (low <= high && list[low] <= pivot)
				low++;
			
			//search backward from right
			while (low <= high && list[high] > pivot)
				high--;
			
			//swap two elements in list
			if (high > low) {
				int temp = list[high];
				list[high] = list[low];
				list[low] = temp;
			}
		}
		
		while (high > first && list[high] >= pivot)
			high--;
		
		//swap pivot with list[high]
		if (pivot > list[high]) {
			list[first] = list[high];
			list[high] = pivot;
			return high;
		}
		else {
			return first;
		}
	}
}
