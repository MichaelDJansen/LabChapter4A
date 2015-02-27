package za.ac.cput.MichaelJansen;

/**
 * Created by student on 2015/02/26.
 */
public abstract class Animal
{
    private String name,breed;
    private Boolean healthy,washed;

    public Animal(){}

    public Animal(String name,String breed,Boolean healthy, Boolean washed)
    {
        this.name = name;
        this.breed = breed;
        this.healthy = healthy;
        this.washed = washed;
    }

    public void setName(String name){this.name = name;}
    public void setBreed(String breed){this.breed = breed;}
    public void setWashed(Boolean washed){this.washed = washed; }
    public void setHealthy(Boolean healthy){this.healthy = healthy;}

    public String getName(){ return name;}
    public String getBreed(){return breed;}
    public Boolean getWashed(){return washed;}
    public Boolean getHealthy(){return healthy;}
	
	public abstract String speak();
}
