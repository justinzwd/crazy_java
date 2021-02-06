import java.util.HashMap;
import java.util.Map;

public class Test
{

    public int[] mergeSortedArray(int[] A, int[] B) {
        // write your code here

        int lengthA = A.length;
        int lengthB = B.length;

        int[] newArr = new int[lengthA + lengthB];

        int i=0,j=0,k=0;

        while(i < lengthA && j < lengthB)
        {
            if (A[i] <= B[j])
            {
                newArr[k++] = A[i];
                i++;
            }
            else
            {
                newArr[k++] = B[j];
                j++;
            }
        }

        if(i != lengthA)
        {
            for(i = i + 1; i < lengthA; i++)
            {
                newArr[k++] = A[i];
            }
        }

        if(j != lengthB)
        {
            for(j = j + 1; j < lengthB; j++)
            {
                newArr[k++] = B[j];
            }
        }

        return newArr;
    }

    public static void main(String[] args)
    {
        int[] A = {1};
        int[] B = {1};
        int[] C = new Test().mergeSortedArray(A,B);
        System.out.println(C);
    }
}
