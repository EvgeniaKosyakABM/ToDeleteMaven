package test.java;

import main.java.Cat;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TestSimple2 {
    Cat vasiliy;


    @BeforeMethod // выполняется после выполнения метода
    public void setUp() {
        vasiliy = new Cat("Vasiliy");
    }

    @Test(dataProvider = "provider")
    public void checkAgeSetter(int value, int expected, String str) {
        vasiliy.setAge(value);
        int actual = vasiliy.getAge();
        assertEquals(expected,actual, String.format("Expected  %d to be equal %d", expected, actual));
    }

    @DataProvider(name = "provider")
    public Object[][] provider() {
        return new Object[][]{
                {-15,1, "First"},
                {0,1, "Second"},
                {1,1, "Third"}
        } ;
    }

}