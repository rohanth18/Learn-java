public class MyQueue 
{
    private int[] values;
    private int first = 0;
    private int last = 0;
    private int size = 0;
    private int count = 0;
    
    public MyQueue(int size)
    {
        this.size = size;
        this.values = new int[size];
    }
    
    public int enqueue(int value)
    {
        //queue is full
        if(this.count == size)
        {
            return -1;
        }

        //last has reached end, but count is less than the size
        if(this.last == this.size && this.first > 0)
        {
            //loop for count times
            for(int loop = 0; loop < count; loop++)
            {
                this.values[loop] = this.values[this.first + loop];
                this.values[first + loop] = 0;
            }
            this.first = 0;
            this.last = this.count;
        }
        this.values[this.last] = value;
        this.last++;
        this.count++;

        return 0;
    }

    public int dequeue()
    {
        if(this.count == 0)
        {
            return -1;
        }
        int index = this.first;
        this.first++;
        this.count--;
        return this.values[index];
    }

    public boolean isEmpty()
    {
        return (this.count == 0);

    }

    public int getCount()
    {
        return this.count;
    }
}
