package HW2.AllAnimals;

import HW2.WildAnimal;
import HW2.Interfaces.CanBeLeader;

public class Wolf extends WildAnimal implements CanBeLeader{

    private boolean canBeLeader;

    public Wolf(int height, int weight, String eyesColor, String habitat, String findDate,boolean canBeLeader) {
        super(height, weight, eyesColor, habitat, findDate);
        this.canBeLeader = canBeLeader;
    }

    public Wolf() {
        super(80, 20, "green", "russia", "20.08.2022");
        this.canBeLeader = false;
    }

    public boolean getLeader(){
        return this.canBeLeader;
    }

    @Override
    public void isLeader() {
        if(this.canBeLeader) System.out.println("This wolf is leader");
        else System.out.println("This wolf is not leader");
        
    }

    @Override
    public void makeNoises() {
        System.out.println("Awwwuuu!!!");
        
    }

    @Override
    public void printInfo() {
        System.out.println("\nWolf");
        System.out.printf("Eyes color: %s\n", this.eyesColor);
        System.out.printf("Height: %s\n", this.height);
        System.out.printf("Weight: %d\n", this.weight);
        System.out.printf("Habitat: %s\n", this.habitat);
        System.out.printf("Date of finding: %s\n", this.findDate);
        System.out.printf("Leader: %s\n", this.canBeLeader);
        
    }
    
}
