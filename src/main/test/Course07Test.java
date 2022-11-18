import com.siit.course.Person;
import com.siit.course.Rectangle;
import org.junit.*;

public class Course07Test {

    @BeforeClass
    public static void BeforeAll() {
        System.out.println("This is run only once before all test in the class");
    }

    @Before
    public void beforeTest() {
        System.out.println("This will run before test!!");
    }

    @Test
    public void computeRectangleAreaTest() {
        Rectangle r = new Rectangle(2, 3);
        Assert.assertEquals("Area is not computed correctly", 6, r.computeArea());
        r.setHeight(0);
        Assert.assertEquals("Aria is not computed correctly", 0, r.computeArea());
    }

    @Test
    public void checkIfPersonIsHungryTest() {
        Person p = new Person(35, 'M', "Alex", 171, 71, false);
        Assert.assertFalse("Person is hungry when it should't", p.isHungry());
        p.eat();
        Assert.assertTrue("Person is still hungry", p.isHungry());
    }

    @After
    public void afterTest() {
        System.out.println("This will execute at the end");
    }

    @AfterClass
    public static void afterTestsPerClass() {
        System.out.println("This will run after the all the test in the class");
    }
}
