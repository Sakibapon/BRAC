
public class Task8 {
	public static void main(String[] args){
		int[] a = {5,3,7,1,4,2,6};
		recursiveBubbleSort(a,0,a.length-1);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

	private static void recursiveBubbleSort(int[] a, int start, int end) {
		if (start<a.length) {
			// TODO Auto-generated method stub
			for (int j = start + 1; j < a.length; j++) {
				if (a[start] > a[j]) {
					int temp = a[start];
					a[start] = a[j];
					a[j] = temp;
				}
			}
			recursiveBubbleSort(a, start + 1, end);
		}
	}

}
