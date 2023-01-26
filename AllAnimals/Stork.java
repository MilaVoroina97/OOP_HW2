package HW2.AllAnimals;

import HW2.Bird;

public class Stork extends Bird{

    public Stork(int height, int weight, String eyesColor, int heightFly) {
        super(height, weight, eyesColor, heightFly);
    
    }

    public Stork() {
        super(70, 7, "Yellow", 200);
    }

    @Override
    public void makeNoises() {
        System.out.println("The storks don't make sounds, they bring babies. ");
        
    }

    @Override
    public void printInfo() {
        System.out.println("\nStork");
        System.out.printf("Eyes color: %s\n", this.eyesColor);
        System.out.printf("Height: %s\n", this.height);
        System.out.printf("Weight: %d\n", this.weight);
        System.out.printf("Flight's height: %s\n", this.heightFly);
        fly();
        
    }
    
}
