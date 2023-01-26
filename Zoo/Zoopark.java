package HW2.Zoo;

import HW2.AbstractZoo;
import HW2.Animal;

public class Zoopark extends AbstractZoo{

    private Animal[] allAnimals;

    public Zoopark(){

        this.allAnimals = new Animal[10];

    }

    @Override
    public void addAnimal(int index, Animal animal) {
        if(index < 0) index = 0;
        int size = (this.allAnimals.length-1 >= index) ? this.allAnimals.length + 1 : index + 1;
        Animal temp[] = new Animal[size];
        for(int i = 0; i < size; i++){
            if(i < index) temp[i] = this.allAnimals[i];
            else if(i == index) temp[i] = animal;
            else temp[i] = this.allAnimals[i-1];
        }

        this.allAnimals = temp;

        
    }

    @Override
    public void delAnimal(int index) {
        if(index > this.allAnimals.length-1){
            System.out.println("There is not such index");
            return;
        }
        Animal[] temp = new Animal[this.allAnimals.length -1];
        for(int j = 0; j < this.allAnimals.length; j++){
            if(j < index) temp[j] = this.allAnimals[j];
            else if(j > index) temp[j-1] = this.allAnimals[j];

        }   
        
        this.allAnimals = temp;
    }

    @Override
    public Animal[] getAllZoo() {
        return this.allAnimals;
    }
    
}
