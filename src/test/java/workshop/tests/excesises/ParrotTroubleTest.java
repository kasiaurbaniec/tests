package workshop.tests.excesises;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import service.ParrotServ;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ParrotTroubleTest {


    @Mock
    ParrotServ parrotServ;

    @InjectMocks
    ParrotTrouble parrotTrouble;

    @Test
    public void parrot3am() {
when(parrotServ.parrotTr(true,3)).thenReturn(false);
assertEw
        }

    }
