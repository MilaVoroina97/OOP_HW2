package HW2;

import java.io.BufferedReader;

import HW2.Interfaces.ParamsInterface.GetIndex;
import HW2.Interfaces.ZooInterfaces.AAddAnimal;
import HW2.Interfaces.ZooInterfaces.ADelAnimal;
import HW2.Interfaces.ZooInterfaces.MakeAllAnimalsNoises;
import HW2.Interfaces.ZooInterfaces.MakeNoise;
import HW2.Interfaces.ZooInterfaces.ShowAllAnimal;
import HW2.Interfaces.ZooInterfaces.ShowAnimal;

public abstract class AbstractZoo2 implements MakeAllAnimalsNoises,MakeNoise,ShowAllAnimal,ShowAnimal,GetIndex,AAddAnimal,ADelAnimal{

    protected AbstractAnimalCreator creator;
    protected AbstractZoo zoo;
    protected BufferedReader reader;
    
}
