public class reverseArray {

    public static void reverse(int number[]) {
        int first = 0, end = number.length - 1;

        while (first < end) {
            int temp = number[end];
            number[end] = number[first];
            number[first] = temp;
            first++;
            end--;
        }
    }

    public static void main(String args[]) {
        int number[] = { 2, 6, 8, 10, 12 };

        reverse(number);
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+" ");
        }
    }
}
