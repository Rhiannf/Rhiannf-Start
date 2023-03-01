/**
 * Welcome to your first lab! This lab will identify all the different entities that you'll be creating and
 * manipulating in your code. It is purely informational, and you do NOT need to write or change anything in this
 * lab. The test cases for this lab will pass from the start.
 *
 * This file is a CLASS. A CLASS is a blueprint for generating an OBJECT. For now, you can think of a
 * Class as its own program, whose functionality gets executed whenever one of its methods gets used. A method is
 * something that an Object can 'do'. Objects contain states (variables) and behavior (methods).
 */


/**
 * We write test cases so that way a computer can verify that our program works as expected - although it takes
 * time and skilled professionals to write automated tests, it is more efficient than having humans manually
 * test the application in the long-run.
 */
public class GuideTest {
    /**
     * This is a variable. It can be accessed by any of the class's methods (we refer to this as being scoped to
     * the entire class). In Java, We always need to define the kind of data that a variable could be - this
     * variable's datatype is of type 'Guide', which is an Object of type Guide.
     * Writing a class, in a sense, is defining a custom data type (that can also run methods). This Guide must be
     * created so that the tests cases in this class can verify that the Guide object works as expected.
     */
    public Guide g;
    /**
     * This is an annotation: it's a way for Java to apply some special modification to a class, method, or variable.
     * In this case, it's provided to us by junit. The @Before annotation simply defines a method that is run
     * before each test.
     */
    
    public void setUp(){
        /**
         * Here we are instantiating an object using the constructor that we've written in the Guide class.
         * Instantiating the Guide object as such will assign its id to 1, and will allow us to use its methods.
         */
        g = new Guide(1);
    }
    /**
     * Like the above test, This test will use the Guide object that already exists, and verify that it works as
     * expected when running guideMethod("test").
     */
    
    public void basicTest2(){

        String inputMessage = "test";
        String expected = "Success from guide object 1! it says: test";
        String actual = g.guideMethod(inputMessage);
        System.out.println("Expected: "+expected);
        System.out.println("Actual: "+actual);
        

    }

}
/**
 *  , run the tests. It should pass, and your IDE should inform you about the results
 *  of the tests. Your task will be modifying the code in the remainder of the course repo so that their test cases
 *  pass rather than fail.
 */
