package workshop.tests.excesises;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import service.ParrotServ;

@RunWith(MockitoJUnitRunner.class)
public class ParrotTroubleTest {


    @Mock
    ParrotServ parrotServ;

    @InjectMocks
    ParrotTrouble parrotTrouble;

    @Test
    public void parrotTr() {


        }

    }
}