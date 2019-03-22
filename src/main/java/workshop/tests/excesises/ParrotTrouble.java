package workshop.tests.excesises;

import service.ParrotServ;

public class ParrotTrouble {
    public void setParrotServ(ParrotServ parrotServ) {
        this.parrotServ = parrotServ;
    }

    private ParrotServ parrotServ;
     public boolean parrot(boolean talking, int hour){
         return parrotServ.parrotTr(talking,hour);
     }
}
