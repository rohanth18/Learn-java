public class MainQueue 
{
    public static void main(String[] args) 
    {
        QueueArray queue = new QueueArray(5);

        System.out.println("----------");
        System.out.println("Initially");
        System.out.println("----------");

        queue.display();

        System.out.println();

        System.out.println("----------");
        System.out.println("Is queue empty");
        System.out.println("----------");

        System.out.println(queue.isEmpty());

        System.out.println();

        System.out.println("----------");
        System.out.println("Enqueue operations");
        System.out.println("----------");

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println();

        System.out.println("----------");
        System.out.println("Display Queue");
        System.out.println("----------");

        queue.display();

        System.out.println();

        System.out.println("----------");
        System.out.println("First element");
        System.out.println("----------");
        
        System.out.println(queue.first());

        System.out.println();

        System.out.println("----------");
        System.out.println("Last element");
        System.out.println("----------");

        System.out.println(queue.last());

        System.out.println();

        System.out.println("----------");
        System.out.println("Deque operations");
        System.out.println("----------");

        System.out.println("Deleted : "+queue.dequeue());
        System.out.println("Deleted : "+queue.dequeue());

        System.out.println();

        System.out.println("----------");
        System.out.println("First after Deque");
        System.out.println("----------");

        System.out.println(queue.first());

        System.out.println();

        System.out.println("----------");
        System.out.println("Last after Deque");
        System.out.println("----------");

        System.out.println(queue.last());

        System.out.println();

        System.out.println("----------");
        System.out.println("Delete remaining elements");
        System.out.println("----------");

        System.out.println("Deleted : "+queue.dequeue());
        System.out.println("Deleted : "+queue.dequeue());
        System.out.println("Deleted : "+queue.dequeue());

        System.out.println();

        System.out.println("----------");
        System.out.println("Queue after Delete all elements");
        System.out.println("----------");

        queue.display();

        System.out.println();

        System.out.println("----------");
        System.out.println("Is queue empty");
        System.out.println("----------");

        System.out.println(queue.isEmpty());

        System.out.println();

        System.out.println("----------");
        System.out.println("Trying Dequeue after Delete all elements");
        System.out.println("----------");

        queue.dequeue();

        System.out.println();

        System.out.println("----------");
        System.out.println("Trying first after Delete all elements");
        System.out.println("----------");

        System.out.println(queue.first());

        System.out.println();

        System.out.println("----------");
        System.out.println("Trying last after Delete all elements");
        System.out.println("----------");

        System.out.println(queue.last());
        
    }
    
}
