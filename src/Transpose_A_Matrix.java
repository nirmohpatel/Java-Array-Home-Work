public class Transpose_A_Matrix
{
    public static void main(String[] args)
    {

        int arr1 [] [] = {{ 1,2},{ 4,5}};// initialize array
        //By using For nested Loop to
        for (int i= 0; i < arr1.length; i++)
        {
            for (int j = 0; j < arr1.length; j++)
            {
                System.out.print(arr1[j][i] + " ");
            }
            System.out.println(" ");
        }
    }
}
