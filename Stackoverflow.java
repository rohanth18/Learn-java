public class Stackoverflow {
    
    static void display() {
        System.out.println("Calling display()");
        display();   // recursive call
    }

    public static void main(String[] args) {
        display();
    }
}

