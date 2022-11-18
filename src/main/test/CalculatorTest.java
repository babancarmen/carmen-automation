import org.junit.*;

public class CalculatorTest {

    private Calculator c;

    @BeforeClass
    public static void beforeClass(){

    }
    @Before
    public void before(){
          c = new Calculator();
    }

    @Test
    public void additionTest(){
        Assert.assertEquals(2.0, c.compute(1.0,1.0,"+"),0);
    }

    @Test
    public void multiplicationTest(){
        Assert.assertEquals(15.5, c.compute(2.5, 6.2, "*"), 0);
        Assert.assertEquals(625, c.compute(25, 25, "*"), 0);
    }

    @Test(expected = NullPointerException.class)
    public void divisionExceptionTest(){
        c.compute(5, 0, "/");
    }
   

    @After
    public void after(){

    }

    @AfterClass
    public static void afterClass(){

    }
}
