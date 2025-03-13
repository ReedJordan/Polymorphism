package Polymorphism;

public class Snake extends Reptile{
    private int length;

    public Snake(String name, int numEggs, int length){
        super(name, "Snake", numEggs);
        this.length = length;
    }

    public int getLength(){
        return length;
    }

    @Override
    public void move(){
        System.out.println(getName() +" loves to slither around.");
    }

    @Override
    public String toString(){
        return "Name: "+ getName() +"\nType: Snake \nNumber of eggs: "+ getNumEggs() +"\nLength: "+ this.length;
    }

    public boolean equals(Snake s){
        Reptile getThis = (Reptile) s;
        return super.equals(getThis) && this.length == s.getLength();
    }

}
