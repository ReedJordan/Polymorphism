package Polymorphism;

public class Reptile {
    private String name;
    private String type;
    private int numEggs;

    public Reptile(String name, String type, int numEggs){
        this.name = name;
        this.type = type;
        this.numEggs = numEggs;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public int getNumEggs(){
        return numEggs;
    }

    public void move(){
        System.out.println(name +" loves to move around.");
    }

    @Override
    public String toString(){
        return "Name: "+ name +"\nType: "+ type +"\nNumber of eggs: "+ numEggs;
    }

    public boolean equals(Reptile r){
        return r.getName().equals(this.name) && r.getType().equals(this.type) && r.getNumEggs() == this.numEggs;
    }

}
