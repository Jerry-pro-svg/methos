class Increment {
    static int counter = 0;

    private final int id;


    public Increment() {
        counter++;
        this.id = counter;
    }

    public void displayId() {
        System.out.println("Object ID: " + id);

    }

    public static void displayCount() {
        System.out.println("Current count: " + counter);

    }

}

public class Man {
    public static void main(String[] args) {
        Increment obj1 = new Increment();
        Increment obj2 = new Increment();
        Increment obj3 = new Increment();


        obj1.displayId();
        obj2.displayId();
        obj3.displayId();


        Increment.displayCount();

    }
}