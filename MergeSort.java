public class MergeSort 
{
    public static void printArray(int[] arr)
    {
        for(int x : arr)
        {
            System.out.print(x+" ");
        }
    }
    //Merge function
    public static void merge(int[] arr, int l, int mid, int h)
    {
        int temp[] = new int[h-l+1];

        int i = l;
        int j = mid+1;
        int k = 0;

        //compare
        while(i <= mid && j <= h)
        {
            if(arr[i] <= arr[j])
            {
                temp[k] = arr[i];
                i++;
            }
            else
            {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        //copy remaining left elements
        while(i <= mid)
        {
            temp[k]=arr[i];
            i++;
            k++;
        }

        //copy remaining right elements
        while(j <= h)
        {
            temp[k]=arr[j];
            j++;
            k++;
        }

        
        //copy back to original array
        for(i = l, k = 0; i <=h; i++,k++)
        {
            arr[i] = temp[k];
        }
    }

    static void mergeSort(int[] arr, int l, int h)
    {
        //Base condition
        if(l >= h)
        {
            return;
        }
        int mid = l+(h-l)/2;

        mergeSort(arr, l, mid);
        
        mergeSort(arr, mid+1, h);
        
        merge(arr, l, mid, h);
    }

    public static void main(String[] args) 
    {
        int[] arr = {10,4,8,5,6,3,7,2,1};
        
        System.out.println("Before sorting");

        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nAfter sorting");

        printArray(arr);
        
    }
    
}
