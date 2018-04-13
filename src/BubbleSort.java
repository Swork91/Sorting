
public class BubbleSort {

	public static void bubbleSort(int[] list) {
		boolean sortMore = true;
		for (int k=1; k<list.length && sortMore; k++) {
			sortMore = false;
			for (int i=0; i<list.length-k; i++) {
				if (list[i]>list[i+1]) {
					int temp = list[i];
					list[i]=list[i+1];
					list[i+1]=temp;
					sortMore = true;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] hundredIntArray = {4, 37, 49, 2, 68, 7, 100, 10, 8, 23, 80, 94, 38, 59, 46, 40, 36, 13, 41, 51, 
				6, 29, 70, 75, 52, 3, 22, 26, 45, 53, 69, 14, 87, 56, 98, 21, 65, 84, 9, 50, 85, 31, 
				30, 96, 44, 15, 20, 25, 86, 67, 88, 63, 99, 42, 48, 77, 1, 19, 24, 11, 93, 71, 60, 
				61, 27, 73, 32, 33, 47, 62, 97, 91, 90, 54, 92, 34, 74, 18, 57, 39, 64, 81, 95, 66, 
				5, 89, 79, 12, 17, 35, 16, 82, 83, 72, 78, 55, 28, 43, 76, 58};
		bubbleSort(hundredIntArray);
		
		System.out.print("Sorted array: ");
		for (int i=0; i<hundredIntArray.length; i++) {
			if (i%10==0) {
				System.out.print("\n");
			}
			System.out.print(hundredIntArray[i]+" ");
		}
	}

}
