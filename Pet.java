package HW2;

import HW2.Interfaces.ShowAffection;

public abstract class Pet extends Animal implements ShowAffection{

    protected String name;
    protected String breed;
    protected boolean isVactinated;
    protected String woolColor;
    protected String birthday;

    public Pet(int height,int weight, String eyesColor, String name,String breed,
    boolean isVactinated,String woolColor,String birthday){
        super(height,weight,eyesColor);
        this.name = name;
        this.breed = breed;
        this.isVactinated = isVactinated;
        this.woolColor = woolColor;
        this.birthday = birthday;

    }
    @Override
    public abstract void showAffection();
    
}
