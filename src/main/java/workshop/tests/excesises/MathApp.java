package workshop.tests.excesises;

import service.MathService;

public class MathApp {
    public void setMathService(MathService mathService) {
        this.mathService = mathService;
    }

    private MathService mathService;
    public int multiply(int a, int b){
        return mathService.multiply(a,b);
    }
    public int add(int a, int b) {
        return mathService.add(a, b);
    }
    public int subs(int a, int b){
        return mathService.subs(a,b);}
}
