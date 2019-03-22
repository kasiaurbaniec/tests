package workshop.tests.excesises;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import service.MathService;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MathAppTest {
    @Mock
    MathService mathService;
    @InjectMocks
    MathApp mathApp;

    @Test
    public void multiply() {
        when(mathService.multiply(10, 20)).thenReturn(2);
        assertEquals(2, mathApp.multiply(10, 20));
    }
    @Test
    public void add() {
        when(mathService.add(10, 20)).thenReturn(102);
        assertEquals(102, mathApp.add(10, 20));
    }
    @Test
    public void subs() {
        when(mathService.subs(10, 20)).thenReturn(102);
        assertEquals(102, mathApp.subs(10, 20));
    }
}