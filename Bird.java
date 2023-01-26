package HW2;

import HW2.Interfaces.CanFly;

public abstract class Bird extends Animal implements CanFly{
    public final int heightFly;
    public Bird(int height,int weight, String eyesColor,int heightFly){
        super(heightFly, weight, eyesColor);
        this.heightFly = heightFly;
    }

    @Override
    public void fly(){
        System.out.printf("Я лечу на %d метрах\n", this.heightFly);
    }


}

