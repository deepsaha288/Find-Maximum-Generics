
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindMaximumTest {

    @Test
    public void given_num1_greater_should_return_num1() {
        FindMaximum findMax = new FindMaximum();
        int maxNo = findMax.giveMaximum(8,5,6);
        Assertions.assertEquals(8,maxNo);
    }

    @Test
    public void given_num2_greater_should_return_num2() {
        FindMaximum findMax = new FindMaximum();
        int maxNo = findMax.giveMaximum(6,8,5);
        Assertions.assertEquals(8,maxNo);
    }

    @Test
    public void given_num3_greater_should_return_num3() {
        FindMaximum findMax = new FindMaximum();
        int maxNo = findMax.giveMaximum(5,6,8);
        Assertions.assertEquals(8,maxNo);
    }
    @Test
    public void given_num1_should_return_num1() {
        FindMaximum findMax = new FindMaximum();
        Float number1 = (float) 8.5;
        Float number2 = (float) 5.6;
        Float number3 = (float) 6.8;
        Float maxNo = findMax.giveMaximum(number1,number2,number3);
        Assertions.assertEquals(number1,maxNo);
    }

    @Test
    public void given_num2_should_return_num2() {
        FindMaximum findMax = new FindMaximum();
        Float number1 = (float) 6.8;
        Float number2 = (float) 8.5;
        Float number3 = (float) 5.6;
        Float maxNo = findMax.giveMaximum(number1,number2,number3);
        Assertions.assertEquals(number2,maxNo);
    }

    @Test
    public void given_num3_should_return_num3() {
        FindMaximum findMax = new FindMaximum();
        Float number1 = (float) 5.6;
        Float number2 = (float) 6.8;
        Float number3 = (float) 8.5;
        Float maxNo = findMax.giveMaximum(number1,number2,number3);
        Assertions.assertEquals(number3,maxNo);
    }
    @Test
    public void given_num1_greater_should_return_num() {
        FindMaximum findMax = new FindMaximum();
        String maxNo = findMax.giveMaximum("Orange","Apple","Mango");
        Assertions.assertEquals("Orange",maxNo);
    }

    @Test
    public void given_num2_greater_should_return_num() {
        FindMaximum findMax = new FindMaximum();
        String maxNo = findMax.giveMaximum("Apple","Orange","Mango");
        Assertions.assertEquals("Orange",maxNo);
    }

    @Test
    public void given_num3_greater_should_return_num() {
        FindMaximum findMax = new FindMaximum();
        String maxNo = findMax.giveMaximum("Mango","Apple","Orange");
        Assertions.assertEquals("Orange",maxNo);
    }
}
