package Polymorphism;

public class Lizard extends Reptile{
    private int tailLength;


    public Lizard(String name, int numEggs, int tailLength){
        super(name, "Lizard", numEggs);
        this.tailLength = tailLength;
    }

    public int getTailLength(){
        return tailLength;
    }

    @Override
    public void move(){
        System.out.println(getName() +" loves to crawl around.");
    }

    @Override
    public String toString(){
        return "Name: "+ getName() +"\nType: Lizard\nNumber of eggs: "+ getNumEggs() +"\nTail length: "+ this.tailLength;
    }

    public boolean equals(Lizard l){
        Reptile compare = (Reptile) l;
        return super.equals(compare) && this.tailLength == l.getTailLength();
    }

}
