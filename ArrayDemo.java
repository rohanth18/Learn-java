public class ArrayDemo 
{
    public static void main(String[] args) 
    {
        MyArray myArray = new MyArray();

        /* System.out.println("Initial array");
        myArray.printElements(); */

        myArray.insertAtEnd(10);
        myArray.insertAtEnd(20);
        myArray.insertAtEnd(30);
        myArray.insertAtEnd(40);
        myArray.insertAtEnd(50);
        System.out.println("After insering");
        myArray.printElements();

       /*  myArray.insertAtStart(5);
        myArray.printElements();


        myArray.insertAtAnyPosition(2,15 );
        System.out.println("After inserting 15 at position 2");
        myArray.printElements();

        System.out.println("insert elements at invalid positions");
        //invalid positions
        myArray.insertAtAnyPosition(-1, 99);
        myArray.insertAtAnyPosition(7, 100);
        

        //Array is full
        myArray.insertAtEnd(30);
        myArray.insertAtStart(1);
        myArray.printElements();
        myArray.insertAtAnyPosition(2, 50);
        

 */
        myArray.deleteFromEnd();
        System.out.println("After deleting from end");
        myArray.printElements();

        myArray.deleteFromStart();
        System.out.println("After deleting from start");
        myArray.printElements();

        myArray.deleteFromAnyPosition(1);
        System.out.println("After deleting from position 1");
        myArray.printElements();
        
    }
    
}
