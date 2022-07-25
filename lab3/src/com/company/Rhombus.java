package com.company;

public class Rhombus extends Figure{

    private static double x0;
    private static double y0;

    private static double x1;
    private static double y1;

    private static double x2;
    private static double y2;

    private static double x3;
    private static double y3;

    public Rhombus(double x0,double y0,double x1,double y1,double x2,double y2,double x3,double y3){
        this.x0 = x0;
        this.y0  = x0;
        this.x1 = x1;
        this.y1  = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    private static double diag1() {
        return (Math.sqrt( (x0-x2)*(x0-x2) + (y0-y2)*(y0-y2)));
    }

    private static double diag2() {
        return (Math.sqrt( (x3-x1)*(x3-x1) + (y3-y1)*(y3-y1)));
    }

    @Override
    public double dl_r1(){
        return (Math.sqrt( (x1-x0)*(x1-x0) + (y1-y0)*(y1-y0)));
    }

    @Override
    public double dl_r2(){
        return dl_r1();
    }

    @Override
    public double dl_r3(){
        return dl_r1();
    }

    @Override
    public double dl_r4(){
        return dl_r1();
    }

    @Override
    public double perimetr(){
        return dl_r1() * 4;
    }

    @Override
    public double ploshad(){
        return (diag1()*diag2())/2;
    }

    @Override
    public double h1(){
        return ploshad()/dl_r1();
    }

    @Override
    public double h2(){
        return 0;
    }

    @Override
    public double h3(){
        return 0;
    }

    @Override
    public double h4(){
        return 0;
    }

    @Override
    public double m1(){
        return 0;
    }

    @Override
    public double m2(){
        return 0;
    }

    @Override
    public double m3(){
        return 0;
    }
    @Override
    public double b1(){
        return 0;
    }

    @Override
    public double b2(){
        return 0;
    }

    @Override
    public double b3(){
        return 0;
    }

    @Override
    public void printInf(){
        System.out.print("Это ромб!\n");
        System.out.printf("Длины рёбер:\n");
        System.out.printf("\ta = %.2f;\n", dl_r1());
        System.out.printf("\tb = %.2f;\n", dl_r2());
        System.out.printf("\tc = %.2f.\n", dl_r3());
        System.out.printf("\td = %.2f.\n", dl_r4());

        System.out.printf("Длины диагоналей:\n");
        System.out.printf("\td1 = %.2f.\n", diag1());
        System.out.printf("\td2 = %.2f.\n", diag2());

        System.out.printf("\nПериметр = %.2f;\n", perimetr());
        System.out.printf("Площадь = %.2f;\n", ploshad());



        System.out.printf("\nВысота = %.2f.\n", h1());


    }

    @Override
    public String toString(){
        return "\n\n\n!Ромб! \n\t a = " + dl_r1() + "\n\t b = " + dl_r2() + "\n\t c = " + dl_r3() + "\n\t в = " + dl_r4() +
                "\n\t Длины диагоналей: \n\t\td1 = " + diag1() + "\n\t\td2 = " + diag2() +
                "\n\t Периметр = " + perimetr() + "\n\t Площадь = " + ploshad() + "\n\tВысота = " + h1();
    }
}
