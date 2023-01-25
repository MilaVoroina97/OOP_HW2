package HW2;

public abstract class WildAnimal extends Animal{
    protected String habitat;
    protected String findDate;
    protected WildAnimal(int height,int weight, String eyesColor,String habitat,String findDate){
        super(height, weight, eyesColor);
        this.habitat = habitat;
        this.findDate = findDate;
        
    }
}
