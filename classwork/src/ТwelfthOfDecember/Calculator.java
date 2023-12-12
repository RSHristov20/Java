package ТwelfthOfDecember;

public class Calculator {
    public void  add (int a, int b){
        System.out.println(a+b);
    }

    public void  add (int a, int b, int c){
        System.out.println(a + b + c);
    }

    public void  add (int a, int b, double c){
        System.out.println(a + b + c);
    }

    public double add (int a, double b, double c){
        return a + b + c;
    }
}