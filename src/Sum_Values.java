public class Sum_Values
{
    public static void main(String[] args)
    {
        int arr [] =new int[]{1,2,3,4,5};// initialize array
        int sum = 0;// define Sum value is Zero to start with
        //By using For Loop to Calculate sum of elements
        for (int i = 0; i < arr.length; i++)
        {sum = sum + arr[i];} // Store SUM value
        System.out.println("Sum of all the Element of Array :- " + sum);// Print Statement
    }
}
