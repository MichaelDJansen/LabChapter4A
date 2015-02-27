package za.ac.cput.MichaelJansen;

/**
 * Created by student on 2015/02/26.
 */
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import junit.framework.TestCase;

public class EncapsulationTest extends TestCase
{
    Animal newDog;

    @Before
    public void setUp() throws Exception
    {
        newDog= new Dog("Kristen","Chow-Chow",true,true);
    }

    @Test
    public void testEncapsulation() throws Exception
    {
        assertEquals("Chow-Chow",newDog.getBreed());
        newDog.setName("Kris");
        assertEquals("Kris",newDog.getName());
    }

    @After
    public void tearDown() throws Exception 
	{
		super.tearDown();
    }
}