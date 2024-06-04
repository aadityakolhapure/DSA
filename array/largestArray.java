public class largestArray {
    public static int getLargest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 5, 16, 8, 10 };

        System.out.println("The largest number is " + getLargest(arr));

    }
}
