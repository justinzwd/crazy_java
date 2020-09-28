package algorithm.com.man.binarysearchnorecursion;

public class BinarySearchNoRecursion
{

    public static void main(String[] args)
    {
        int[] arr = {1,2,4,7,9};        //确保输入的数组一定要是升序排列

        //int index = binarySearch(arr,2);
        //int index = binarySearch(arr,9);
        int index = binarySearch(arr,-2);
        System.out.println("index = " + index);

    }

    public static int binarySearch(int[] arr, int target)
    {
        int left = 0;
        int right = arr.length - 1;     //left和right都是代表下标

        while(left <= right)
        {
            int mid = (left + right) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] > target)
            {
                right = mid - 1;
            }
            else
            {
                left = mid + 1;
            }
        }

        return -1;      //如果没有找到target，就返回-1

    }
}
