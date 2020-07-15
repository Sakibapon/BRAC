
public class Task3 {
	public static void main(String[] args){
		int[] a = {1,3,8,12,14,18,21,26,33,41};
		int key = 18;
		int index = binarySearch(a,key,0,a.length-1);
		System.out.println(key+" is at index "+index);
	}

	private static int binarySearch(int[] a, int key, int start, int end) {
		// TODO Auto-generated method stub
		if (start<end) {
			int mid = (start + end) / 2;
			if (key > a[mid]) {
				 return binarySearch(a, key, mid + 1, end);
			} else if (key < a[mid]) {
				return binarySearch(a, key, start, mid - 1);
			} else if (key == a[mid]) {
				return mid;
			} 
		}
		return -1;
	}

}
