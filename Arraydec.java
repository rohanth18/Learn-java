import java.util.Arrays;

public class Arraydec 
{
    public static void main(String[] args) 
    {
        // //int arr[5];-->Wrong
        // int arr[]=new int[5];
        // System.out.println(arr);//Hash value
        // System.out.println(Arrays.toString(arr));//Default value 00000
        int arr1[]={10,20,30};
        System.out.println(arr1);//Hash value
        System.out.println(Arrays.toString(arr1));

        int arr2[]=new int[]{10,20,30};
        System.out.println(arr2);//Hash value
        System.out.println(Arrays.toString(arr2));
    }
}
