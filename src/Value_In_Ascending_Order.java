public class Value_In_Ascending_Order {
    public static void main(String[] args) {

        // code for original Array
        int[] arr = new int[]{26,6,20,2,0};
        int a = 0;

        System.out.print("Elements of original array:- ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // code for Ascending Order
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }
        System.out.println();
        System.out.print("Elements of array sorted in ascending order:- ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
}}