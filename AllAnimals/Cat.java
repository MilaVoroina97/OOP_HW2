package HW2.AllAnimals;

import HW2.Pet;
import HW2.Interfaces.GetWool;

public class Cat extends Pet implements GetWool{

    private final boolean isWool;
    private static int catNamesCounter;

    public Cat(int height, int weight, String eyesColor, String name, String breed, boolean isVactinated,
            String woolColor, String birthday,boolean isWool) {
        super(height, weight, eyesColor, name, breed, isVactinated, woolColor, birthday);
        this.isWool = isWool;
    }

    public Cat() {
        super(50,
                2,
                "Yellow",
                String.format("Cat %d", catNamesCounter++),
                "Britanskaya",
                true,
                "black",
                "22.03.2021");
        this.isWool = true;
    }

    @Override
    public void showAffection() {
        System.out.println("Мур - мур:)))");
        
    }

    @Override
    public void makeNoises() {
        System.out.println("Мяу - мяу)))");
        
    }

    @Override
    public void printInfo() {
        System.out.println("\nCat");
        System.out.printf("Name: %s\n", this.name);
        System.out.printf("Breed: %s\n", this.breed);
        System.out.printf("Birthday: %s\n", this.birthday);
        System.out.printf("Wool color: %s\n", this.woolColor);
        System.out.printf("Eyes color: %s\n", this.eyesColor);
        System.out.printf("Height: %d\n", this.height);
        System.out.printf("Weight: %d\n", this.weight);
        System.out.printf("Vaccinations: %b\n", this.isVactinated);
        System.out.printf("Wool presence: %b\n", this.isWool);
        
    }

    @Override
    public boolean getWool() {
        return this.isWool;
    }
    
}
