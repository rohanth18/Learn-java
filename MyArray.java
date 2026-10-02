public class MyArray 
{
    int[] array;//Place to store elements
    int length;//total size of the array
    int rightIndex;//Pointing at empty box

    public MyArray()
    {
        length = 5;
        array = new int[length];//[0][0][0][0][0] -> initial array
        rightIndex = 0;
    }

    //Insert at end
    void insertAtEnd(int value)
    {
        if(rightIndex == length)
        {
            System.out.println("Array is full");
            return;
        }
        array[rightIndex] = value;
        rightIndex++;//after inserting at the end size go increased
    }

    //Insert at start
    public void insertAtStart(int value)
    {
        if(rightIndex == length)
        {
            System.out.println("Full");
            return;
        }
        else
        {
            //shift element 1 position towards the right
            for(int i = rightIndex-1; i >= 0; i--)
            {
                array[i+1] = array[i];
            }
        }
        array[0] = value;
        rightIndex++;
    }

    //Insert at position
    public void insertAtAnyPosition(int position, int value)
    {
        if(rightIndex == length)
        {
            System.out.println("Array is full");
            return;
        }
        if(position < 0 || position > rightIndex)
        {
            System.out.println("Invalid position");
            return;
        }
        //Shift and insert
        for(int i = rightIndex - 1; i >= position; i--)
        {
            array[i+1] = array[i];
        }
        array[position] = value;
        rightIndex++;
    }

    //===========Deletion=============/

    //Delete from end
    public void deleteFromEnd()
    {
        if(rightIndex == 0)
        {
            System.out.println("Array is empty");
            return;
        }
        array[rightIndex - 1] = 0;
        rightIndex--;
    }

    //Delete from start
    public void deleteFromStart()
    {
        if(rightIndex == 0)
        {
            System.out.println("Array is empty");
            return;
        }
        //shift elements from index = 0
        for(int i = 0; i < rightIndex - 1 ; i++)
        {
            array[i] = array[i+1];
        }
        rightIndex--;
        array[rightIndex] = 0;
    }

    //Delete from any position
    public void deleteFromAnyPosition(int position)
    {
        if(rightIndex == 0)
        {
            System.out.println("Array is empty");
            return;
        }
        if(position < 0 || position >= rightIndex)
        {
            System.out.println("Invalid position");
            return;
        }
        for(int i = position; i < rightIndex - 1 ; i++)
        {
            array[i] = array[i+1];
        }
        rightIndex--;
        array[rightIndex] = 0;
    }

    public void printElements()
    {
        System.out.println("index\tvalue");
        for(int i = 0; i < array.length; i++)
        {
            System.out.println(i+"\t"+array[i]);
        }
        System.out.println("Size = "+rightIndex);
        System.out.println();
    }
}
