package workshop.tests.excesises;

import org.junit.Test;
import service.MathService;

import static org.junit.Assert.*;

public class MathTest {

    @Test
    public void multiply() {
        fail();
    }

    @Test
    public void shouldreturn8whengiven4and2() {
        //Given
        MathService mathService =new MathService();
        int a=2;
        int b=4;
        double returnedvalue =8;
        //When
        double actualoutput= mathService.multiply(a,b);
        //Then
        assertEquals(returnedvalue,actualoutput,2);
    }
}