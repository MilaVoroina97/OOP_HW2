package HW2.AllAnimals;

import HW2.WildAnimal;

public class Tiger extends WildAnimal{

    public Tiger(int height, int weight, String eyesColor, String habitat, String findDate) {
        super(height, weight, eyesColor, habitat, findDate);
    }

    public Tiger(){
        super(100, 60, "Yellow", "Africa", "05.06.2022");
    }

    @Override
    public void makeNoises() {
        System.out.println("RRRRR!!!!");
    }

    @Override
    public void printInfo() {
        System.out.println("\nTiger");
        System.out.printf("Eyes color: %s\n", this.eyesColor);
        System.out.printf("Height: %s\n", this.height);
        System.out.printf("Weight: %.3f\n", this.weight);
        System.out.printf("Habitat: %s\n", this.habitat);
        System.out.printf("Date of finding: %s\n", this.findDate);
        
    }
    
}
