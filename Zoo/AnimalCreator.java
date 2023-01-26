package HW2.Zoo;

import java.io.IOException;

import HW2.AbstracrAnimalParams;
import HW2.AbstractAnimalCreator;
import HW2.AllAnimals.Cat;
import HW2.AllAnimals.Chicken;
import HW2.AllAnimals.Dog;
import HW2.AllAnimals.Stork;
import HW2.AllAnimals.Tiger;
import HW2.AllAnimals.Wolf;

public class AnimalCreator extends AbstractAnimalCreator{

    public AnimalCreator(AbstracrAnimalParams param){
        this.params = param;
    }

    @Override
    public Cat getCat() throws IOException {
        Cat cat = new Cat(this.params.getHeight("cat"),
                this.params.getWeight("cat"),
                this.params.getEyesColor("cat"),
                this.params.getName("cat"),
                this.params.getBreed("cat"),
                this.params.getVactinated("cat"),
                this.params.getWoolColor("cat"),
                this.params.getBirthday("cat"),
                this.params.getIswool("cat"));
        return cat;
    }

    @Override
    public Dog getDog() throws IOException {
        Dog dog = new Dog(this.params.getHeight("dog"),
                this.params.getWeight("dog"),
                this.params.getEyesColor("dog"),
                this.params.getName("dog"),
                this.params.getBreed("dog"),
                this.params.getVactinated("dog"),
                this.params.getWoolColor("dog"),
                this.params.getBirthday("dog"),
                this.params.getCanBeTrained("dog"));
        return dog;
    }

    @Override
    public Chicken getChicken() throws IOException {
        Chicken chicken = new Chicken(this.params.getHeight("chicken"),
                this.params.getWeight("chicken"),
                this.params.getEyesColor("chicken"),
                0);
        return chicken;
    }

    @Override
    public Stork getStork() throws IOException {
        Stork stork = new Stork(this.params.getHeight("stork"),
                this.params.getWeight("stork"),
                this.params.getEyesColor("stork"),
                this.params.getHeightFly("stork"));
        return stork;
    }

    @Override
    public Tiger getTiger() throws IOException {
        Tiger tiger = new Tiger(this.params.getHeight("tiger"),
                this.params.getWeight("tiger"),
                this.params.getEyesColor("tiger"),
                this.params.getHabitat("tiger"),
                this.params.getFindDate("tiger"));
        return tiger;
    }

    @Override
    public Wolf getWolf() throws IOException {
        Wolf wolf = new Wolf(this.params.getHeight("wolf"),
                this.params.getWeight("wolf"),
                this.params.getEyesColor("wolf"),
                this.params.getHabitat("wolf"),
                this.params.getFindDate("wolf"),
                this.params.getCanBeLeader("wolf"));
        return wolf;
    }
    
}
