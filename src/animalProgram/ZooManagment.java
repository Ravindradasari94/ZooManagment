package animalProgram;
class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("The animal makes a generic sound.");
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Lion extends Animal {
    private int maneLength;

    public Lion(String name, int age, int maneLength) {
        super(name, age);
        this.maneLength = maneLength;
    }

    @Override
    public void makeSound() {
        System.out.println("The lion roars loudly.");
    }

    public void displayManeLength() {
        System.out.println("Mane Length: " + maneLength);
    }
}

class Elephant extends Animal {
    private float tuskLength;

    public Elephant(String name, int age, float tuskLength) {
        super(name, age);
        this.tuskLength = tuskLength;
    }

    @Override
    public void makeSound() {
        System.out.println("The elephant trumpets.");
    }

    public void displayTuskLength() {
        System.out.println("Tusk Length: " + tuskLength);
    }
}

public class ZooManagment {
    public static void main(String[] args) {
        Lion lion = new Lion("Simba", 5, 12);
        Elephant elephant = new Elephant("Dumbo", 10, 2.5f);

        System.out.println("Lion Information:");
        lion.displayInfo();
        lion.displayManeLength();
        lion.makeSound();

        System.out.println("\nElephant Information:");
        elephant.displayInfo();
        elephant.displayTuskLength();
        elephant.makeSound();
    }
}
