package HW2.AllAnimals;

import HW2.Pet;
import HW2.Interfaces.Train;

public class Dog extends Pet implements Train{

    private static int dogNameCounter;
    private boolean canBeTraied;

    public Dog(int height, int weight, String eyesColor, String name, String breed, boolean isVactinated,
            String woolColor, String birthday,boolean canBeTraied) {
        super(height, weight, eyesColor, name, breed, isVactinated, woolColor, birthday);
        this.canBeTraied = canBeTraied;
    }

    public Dog() {
        super(70,
                5,
                "black",
                String.format("Dog %d", dogNameCounter++),
                "cur",
                false,
                "brown",
                "no info");
        this.canBeTraied = true;
    }

    public boolean getTrain(){
        return this.canBeTraied;
    }
    @Override
    public void toTrain() {
        if(this.canBeTraied) System.out.printf("This dog %s already is goood in training",this.name);
        else System.out.printf("This dog %s need to learn how to train", this.name);
    }

    @Override
    public void showAffection() {
        System.out.println("I can be your friend. ");
        
    }

    @Override
    public void makeNoises() {
        System.out.println("Whoof whoof!!!");
        
    }

    @Override
    public void printInfo() {
        System.out.println("\nDog");
        System.out.printf("Name: %s\n", this.name);
        System.out.printf("Breed: %s\n", this.breed);
        System.out.printf("Birthday: %s\n", this.birthday);
        System.out.printf("Wool color: %s\n", this.woolColor);
        System.out.printf("Eyes color: %s\n", this.eyesColor);
        System.out.printf("Height: %d\n", this.height);
        System.out.printf("Weight: %d\n", this.weight);
        System.out.printf("Vaccinations: %b\n", this.isVactinated);
        System.out.printf("Training: %b\n", this.canBeTraied);
        
    }
    
}
