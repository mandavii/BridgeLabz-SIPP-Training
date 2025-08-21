package DAY1;

class Pet {
    String name;
    int age;
    String breed;

    public Pet(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Breed: " + this.breed);
    }
}

class Dog extends Pet {
    boolean isTrained;

    public Dog(String name, int age, String breed, boolean isTrained) {
        super(name, age, breed);
        this.isTrained = isTrained;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Is Trained: " + this.isTrained);
    }
}

class Cat extends Pet {
    boolean likesToCuddle;

    public Cat(String name, int age, String breed, boolean likesToCuddle) {
        super(name, age, breed);
        this.likesToCuddle = likesToCuddle;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Likes to Cuddle: " + this.likesToCuddle);
    }
}

class Bird extends Pet {
    boolean canFly;

    public Bird(String name, int age, String breed, boolean canFly) {
        super(name, age, breed);
        this.canFly = canFly;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Can Fly: " + this.canFly);
    }
}


public class PetAdoption {

    public static void main(String[] args) {
        
        Dog myDog = new Dog("Buddy", 3, "Golden Retriever", true);
        System.out.println("--- Dog Details ---");
        myDog.displayDetails();

        System.out.println(); 

        Cat myCat = new Cat("Whiskers", 2, "Siamese", true);
        System.out.println("--- Cat Details ---");
        myCat.displayDetails();

        System.out.println();

       
        Bird myBird = new Bird("Polly", 1, "Parakeet", true);
        System.out.println("--- Bird Details ---");
        myBird.displayDetails();
    }
}