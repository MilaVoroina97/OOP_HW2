package HW2.Zoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import HW2.AbstracrAnimalParams;

public class AnimalParams extends AbstracrAnimalParams{

    private BufferedReader reader;

    public AnimalParams(){
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }


    @Override
    public String getName(String type) throws IOException {
        System.out.printf("Enter %s name.\n", type);
        return reader.readLine();
    }

    @Override
    public String getBreed(String type) throws IOException {
        System.out.printf("Enter %s breed.\n", type);
        return reader.readLine();
    }

    @Override
    public String getBirthday(String type) throws IOException {
        System.out.printf("Enter %s birthday.\n", type);
        return reader.readLine();
    }

    @Override
    public String getEyesColor(String type) throws IOException {
        System.out.printf("Enter %s eyes color.\n", type);
        return reader.readLine();
    }

    @Override
    public boolean getCanBeLeader(String type) throws IOException {
        System.out.printf("The %s is the leader.\n", type);
        boolean isTrue = false;
        String tmp = "";
        boolean result = false;
        while (!isTrue){
            tmp = reader.readLine();
            if(tmp.equals("true") || tmp.equals("false")){
                result = Boolean.parseBoolean(tmp);
                isTrue = true;
            }
            else
                System.out.printf("The leader status must be true or false.\nEnter %s leader status.\n", type);
        }
        return result;
    }

    @Override
    public String getFindDate(String type) throws IOException {
        System.out.printf("Enter %s date of finding.\n", type);
        return reader.readLine();
    }

    @Override
    public boolean getCanBeTrained(String type) throws IOException {
        System.out.printf("The %s is trained?\n", type);
        boolean isTrue = false;
        String temp = "";
        boolean res = false;
        while(!isTrue){
            temp = reader.readLine();
            if(temp.equals("true") || temp.equals("false")){
                res = Boolean.parseBoolean(temp);
                isTrue = true;
            }else  System.out.printf("The trained status must be true or false.\nEnter %s trained status.\n", type);
        }
        return res;
    }

    @Override
    public String getHabitat(String type) throws IOException {
        System.out.printf("Enter %s habitat.\n", type);
        return reader.readLine();
    }

    @Override
    public int getHeight(String type) throws IOException {
        System.out.printf("Enter %s height.\n", type);
        boolean isTrue = false;
        int res= 0;
        while(!isTrue){
            res = Integer.parseInt(reader.readLine());
            if(res > 0) isTrue = true;
            else System.out.printf("The height must be more than zero.\nEnter %s height.\n", type);
        }
        return res;
    }

    @Override
    public int getHeightFly(String type) throws IOException {
        System.out.printf("Enter %s flight's height.\n", type);
        boolean isTrue = false;
        int res= 0;
        while(!isTrue){
            res = Integer.parseInt(reader.readLine());
            if(res > 0) isTrue = true;
            else System.out.printf("The flight's height must be more than zero.\nEnter %s height.\n", type);
        }
        return res;
    }

    @Override
    public boolean getIswool(String type) throws IOException {
        System.out.printf("Enter %s wool presence.\n", type);
        boolean isTrue = false;
        String temp = "";
        boolean res = false;
        while(!isTrue){
            temp = reader.readLine();
            if(temp.equals("true") || temp.equals("false")){
                res = Boolean.parseBoolean(temp);
                isTrue = true;
            }else  System.out.printf("The wool presence status must be true or false.\nEnter %s wool presence status.\n", type);
        }
        return res;
    }

    @Override
    public boolean getVactinated(String type) throws IOException {
        System.out.printf("Enter %s wool presence.\n", type);
        boolean isTrue = false;
        String temp = "";
        boolean res = false;
        while(!isTrue){
            temp = reader.readLine();
            if(temp.equals("true") || temp.equals("false")){
                res = Boolean.parseBoolean(temp);
                isTrue = true;
            }else  System.out.printf("The vactine status must be true or false.\nEnter %s wool presence status.\n", type);
        }
        return res;
    }

    @Override
    public int getWeight(String type) throws IOException {
        System.out.printf("Enter %s weight.\n", type);
        boolean isTrue = false;
        int res= 0;
        while(!isTrue){
            res = Integer.parseInt(reader.readLine());
            if(res > 0) isTrue = true;
            else System.out.printf("The weight must be more than zero.\nEnter %s weight.\n", type);
        }
        return res;
    }

    @Override
    public String getWoolColor(String type) throws IOException {
        System.out.printf("Enter %s wool color.\n", type);
        return reader.readLine();
    }
    
}
