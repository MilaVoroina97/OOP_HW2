package HW2.AllAnimals;

import HW2.Bird;

public class Chicken extends Bird {

    public Chicken(int height, int weight, String eyesColor, int heightFly) {
        super(height, weight, eyesColor, heightFly);
        
    }

    public Chicken() {
        super(30, 3, "Yellow", 0);
    }


    @Override
    public void makeNoises() {
        System.out.println("Co co co co");
        
    }

    @Override
    public void printInfo() {
        System.out.println("\nHen");
        System.out.printf("Eyes color: %s\n", this.eyesColor);
        System.out.printf("Height: %s\n", this.height);
        System.out.printf("Weight: %.3f\n", this.weight);
        System.out.printf("Flight's height: %s\n", this.heightFly);
        
    }
    
}
