import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindMaximumTest {

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
