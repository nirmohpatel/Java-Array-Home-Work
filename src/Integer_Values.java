public class Integer_Values
{
    public static void main(String[] args) {
        int arr [] = {1,4,3,5,3,4,5}; // initialize array
        int add = 0;// define Sum value is Zero to start with
        for (int i = 0; i < arr.length; i++) //By using For Loop to check value
        {
            for (int j = i+1; j < arr.length; j++)
            {
                if (arr[i] == arr[j])
                {
                    add = add+1;
                }
            }
        }
        System.out.println("Total Duplicated value of integer value :- " + add);
    }
}
