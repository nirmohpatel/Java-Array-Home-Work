public class Equality_Of_Two_Arrays
{
    public static void main(String[] args)
    {
        int arr1 [] =new int[]{1,2,3,4,5};// initialize array
        int arr2 [] =new int[]{1,2,3,4,5};  // initialize array
        boolean a = false;  // boolean default value id false

            if (arr1.length == arr2.length) // to check Both array length are equality by using if condition
            {
                for (int i = 0; i < arr1.length; i++)   //
                {
                    if (arr1 [i] == arr2 [i])   // to check Both array are equality by using if condition
                    {
                        a = true;

                    }else
                        {
                            a=false;
                        }
                }

            } else
                {
                    a=false;
                }
            if (a==true) // if condition for equality
            {
                System.out.println("Both array are Equal"); // Print statement
            }else
                {
                    System.out.println("Array length is not Equal");    // Print statement
                }
    }
}
