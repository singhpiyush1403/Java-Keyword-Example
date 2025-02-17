abstract class Animal {
    abstract void sound(); 
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Counter {
    private int count = 0;

    final int MAX_COUNT = 10;

    public synchronized void increment() {
        if (count < MAX_COUNT) {
            count++;
            System.out.println("Count: " + count);
        } else {
            System.out.println("Max count reached!");
        }
    }

    public int getCount() {
        return count;
    }
}

public class KeywordExample {
    static void displayMessage() {
        System.out.println("Static method called");
    }

    public static void main(String[] args) {
        displayMessage();

        Dog dog = new Dog();
        dog.sound();

        Counter counter = new Counter();

        for (int i = 0; i < 12; i++) {
            counter.increment();
        }
    }
}
