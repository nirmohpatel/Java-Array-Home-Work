public class Contains_A_Specific_Value
{
    public static void main(String[] args)
    {
        int array []  = {1, 2, 5, 4, 3};    // initialize array
        int specificValue = 6;  // define specific Value
        boolean a = false;  // boolean default value id false

        for (int i = 0; i< array.length; i++)
        {
            if (specificValue == array[i])   // to come per specific value with array value by using if condition
            {
                a = true;
            }else
                {
                    a= false;
                }
        }
        if(a == true) {
            System.out.println("This array is contains :- " + specificValue );   // Print statement
        }else{
            System.out.println("This array is not contains :- " + specificValue );   // Print statement
    }

    }
}
