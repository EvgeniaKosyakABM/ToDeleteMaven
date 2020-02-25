package test.java;

        import main.java.Cat;
        import org.testng.annotations.*;

        import static org.testng.Assert.assertEquals;
        import static org.testng.Assert.assertTrue;

public class TestSimple {
    Cat vasiliy;

    @BeforeClass  // выполняется после выполнения класса
    public void someMethod() {
        System.out.println("Выполняется один раз====================");
    }

    @BeforeMethod // выполняется после выполнения метода
    public void setUp() {
        vasiliy = new Cat("Vasiliy");
    }

  /*  @Test//(description = "Some good description", groups = "AAA", priority = 2, invocationCount = 1, invocationTimeOut = 600)
                                      //description - описание теста
                                      // priority - вначале проходит тот тест, у которого приоритет ниже
                                      //dependsOnGroups - выполняется только после всех тестов группы "ААА"
                                      //invocationCount - количество раз, которое повториться данный тест
                                      //invocationTimeOut - время задержки данного теста
    public void firstTest() throws InterruptedException {
        //Thread.sleep(500);
        vasiliy.setAge(-100);
        int expected = 1;
        int actual = vasiliy.getAge();
        assertTrue(expected == actual, String.format("Expected  %d to be equal %d", expected, actual));
    }*/


    /*@Test //(priority = 1, dependsOnGroups = "AAA") //(enabled = false) //  enabled - тест не используем, как закоментированный
    public void checkAgeSetter2() {
        vasiliy.setAge(15);
        int expected = 15;
        int actual = vasiliy.getAge();
        assertTrue(expected == actual, String.format("Expected  %d to be equal %d", expected, actual));
    }*/

    /*@Test
    public void checkAgeSetter3() {
        vasiliy.setAge(21);
        int expected = 1;
        int actual = vasiliy.getAge();
        assertTrue(expected == actual, String.format("Expected  %d to be equal %d", expected, actual));
    }*/

    @Parameters({"login"})
    @Test()
    public void checkAgeSetter(@Optional("et") String login) {   // ????????
        System.out.println(login);
        vasiliy.setAge(1);
        int actual = vasiliy.getAge();
        assertEquals(1,actual, String.format("Expected  %d to be equal %d", 1, actual));
    }

    @DataProvider(name = "provider")
    public Object[][] provider() {
        return new Object[][]{
                {-15,1, "First"},
                {0,1, "Second"},
                {1,1, "Third"},
                {15,15, "Fourth"},
                {20,20, "5-th"},
                {21,1, "Sixth"}
        } ;
    }

}