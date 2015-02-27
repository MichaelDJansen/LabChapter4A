package za.ac.cput.MichaelJansen;

/**
 * Created by student on 2015/02/26.
 */
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import junit.framework.TestCase;

public class PolymorphismTest extends TestCase
{
    Trained newDog;

    @Before
    public void setUp() throws Exception
    {
        newDog= new Dog("Kristen","Chow-Chow",true,true);
    }

    @Test
    public void testEncapsulation() throws Exception
    {
        assertEquals("Dog Rolled",newDog.roll());
        assertEquals("Dog brought ball back",newDog.fetch());
    }

    @After
    public void tearDown() throws Exception
    {
        super.tearDown();
    }
}