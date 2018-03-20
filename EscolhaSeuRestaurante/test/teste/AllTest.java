package teste;

import junit.framework.Test;
import junit.framework.TestSuite;
/**
 *
 * @author Juliane Bazilewitz
 */

public class AllTest {

    public static Test suite(){
        TestSuite suite = new TestSuite(AllTest.class.getName());
        suite.addTestSuite(RestauranteTest.class);
        return suite;
    }
}
