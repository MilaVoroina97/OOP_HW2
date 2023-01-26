package HW2.Zoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import HW2.AbstractAnimalCreator;
import HW2.AbstractZoo;
import HW2.AbstractZoo2;
import HW2.Animal;

public class Zoopark2 extends AbstractZoo2{

    public Zoopark2(AbstractAnimalCreator animalCreator, AbstractZoo zoopark){
        this.creator = animalCreator;
        this.zoo = zoopark;
        this.reader = new BufferedReader(new InputStreamReader(System.in));

    }

    @Override
    public void makeAllAnimalsNoise() {
        Animal[] animaly = this.zoo.getAllZoo();
        for(int i = 0; i < animaly.length; i++){
            if(animaly[i] != null){
                animaly[i].makeNoises();
                System.out.println();
            }
        }
        
    }

    @Override
    public void makeCry() throws IOException {
        System.out.println("Enter animal index to make him noise : ");
        this.zoo.getAllZoo()[Integer.parseInt(this.reader.readLine())].makeNoises();
        
    }

    @Override
    public void showAllAnimals() {
        Animal[] animaly = this.zoo.getAllZoo();
        for(int i = 0; i < animaly.length; i++){
            if(animaly[i] != null){
                animaly[i].printInfo();
                System.out.println();
            }
        }
        
    }

    @Override
    public void showAnimal() throws IOException{
        this.zoo.getAllZoo()[Integer.parseInt(this.reader.readLine())].printInfo();
        
    }

    @Override
    public int getIndex(String type) throws IOException {
        System.out.printf("Enter %s place in zoo.\n", type);
        boolean isTrue = false;
        int index = 0;
        while(!isTrue){
            index = Integer.parseInt(this.reader.readLine());
            if(index >=0) isTrue = true;
            else System.out.printf("There is not such index, it should be equals or more than 0.Enter %s place in zoo.\n",type);
        }

        return index;

    }

    @Override
    public void addAnimal(String type) throws IOException {
        switch (type){
            case ("Cat") -> this.zoo.addAnimal(getIndex(type), creator.getCat());
            case ("Dog") -> this.zoo.addAnimal(getIndex(type), creator.getDog());
            case ("Chicken") -> this.zoo.addAnimal(getIndex(type), creator.getChicken());
            case ("Stork") -> this.zoo.addAnimal(getIndex(type), creator.getStork());
            case ("Tiger") -> this.zoo.addAnimal(getIndex(type), creator.getTiger());
            case ("Wolf") -> this.zoo.addAnimal(getIndex(type), creator.getWolf());
        }
        
    }

    @Override
    public void delAnimal() throws IOException {
        System.out.println("Enter the animal's index to delete");
        this.zoo.delAnimal(Integer.parseInt(reader.readLine()));
        
    }
    
}
