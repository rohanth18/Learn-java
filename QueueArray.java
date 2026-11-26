public class QueueArray 
{
    int size;
    int front;
    int rear;
    int[] queue;

    QueueArray(int size)
    {
        this.size = size;
        front = -1;
        rear = -1;
        queue = new int[size];
    }

    //enqueue
    void enqueue(int value)
    {
        if(isFull())
        {
            System.out.println("Queue is full");
            return;
        }
        rear++;
        queue[rear] = value;
        System.out.println(value + " inserted");
    }

    //dequeue
    int dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        }

        front++;
        return queue[front];
        
    }

    //isEmpty
    boolean isEmpty()
    {
        return front == rear;
    }

    //isFull
    boolean isFull()
    {
        return rear == size - 1;
    }

    int first()
    {
        if(isEmpty())
        {
            System.out.println("queue is empty");
            return -1;
        }

        
        return queue[front + 1];
    }

    int last()
    {
        if(isEmpty())
        {
            System.out.println("queue is empty");
            return -1;
        }

        return queue[rear];
    }

    void display()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return;
        }

        for(int i = front+1; i <= rear; i++)
        {
            System.out.println(queue[i]);
            System.out.println("-------");
        }
        System.out.println();
    }
    
}
