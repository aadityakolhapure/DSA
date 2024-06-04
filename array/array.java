import java.util.Scanner;
public class array {
    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 5, 10, 15, 20, 25, 30, 35 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element which you have to search: ");
        int key = sc.nextInt();
        // int key = 30;

        int index = linearSearch(arr, key);
        if (index == -1) {
            System.out.println("Element not found");
        } else
            System.out.println("Element found at index : " + index);

    }
}
