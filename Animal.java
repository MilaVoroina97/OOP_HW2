package HW2;

import HW2.Interfaces.CanMakeNoise;
import HW2.Interfaces.PrintAnimalInfo;

public abstract class Animal implements CanMakeNoise,PrintAnimalInfo{
    protected int height;
    protected int weight;
    protected String eyesColor;

    protected Animal(int height,int weight, String eyesColor){
        this.height = height;
        this.weight = weight;
        this.eyesColor = eyesColor;

    }

    protected Animal(){

    }

    @Override
    public abstract void makeNoises();
    @Override
    public abstract void printInfo();
}