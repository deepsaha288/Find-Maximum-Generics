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
}
