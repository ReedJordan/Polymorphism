package Polymorphism;

import java.util.ArrayList;

public class ReptileTest {
    public static void main(String[] args){
        ArrayList<Reptile> terrarium = new ArrayList<>();

        terrarium.add(new Lizard("Larry",3,5));
        terrarium.add(new Snake("Mister Smith",2,22));
        terrarium.add(new Lizard("Larry",3,5));
        terrarium.add(new Reptile("Lord of Eternal Flames", "Dragon", 1));

        for (Reptile r : terrarium){
            System.out.println(r);
            System.out.println("");
            r.move();
            System.out.println("");
        }


        System.out.println("Comparing reptiles: ");
        System.out.println(terrarium.get(0).getName() +" and "+ terrarium.get(1).getName() +": "+ terrarium.get(0).equals(terrarium.get(1)));
        System.out.println(terrarium.get(0).getName() +" and "+ terrarium.get(2).getName() +": "+ terrarium.get(0).equals(terrarium.get(2)));

    }
}
