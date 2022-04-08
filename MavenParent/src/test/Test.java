package test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int low = 0;
        int high = 12;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            //System.out.println(mid);
            low++;
        }
        System.out.println("Bonjour");

	}
	
	private static int findDuplicate(int[] array) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            System.out.println(mid);
            int midVal = array[mid];

            if (midVal == mid)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return high;
    }
}
