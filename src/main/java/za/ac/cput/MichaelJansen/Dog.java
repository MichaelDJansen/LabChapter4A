package za.ac.cput.MichaelJansen;

/**
 * Created by student on 2015/02/26.
 */
public class Dog extends Animal implements Trained
{
    public Dog(){super();}
    public Dog(String name,String breed,Boolean healthy, Boolean washed){super(name,breed,healthy, washed);}
	
    public String speak(){return "Woof";}
    public String roll(){return "Dog Rolled";}
    public String fetch(){return "Dog brought ball back";}
    public String skateboard(){return "Dog did a Kickflip";}
}
