package com.company;

public class Fraction {
    int a;
    int b;



    public Fraction(int a, int b) {
        this.a = a;
        this.b = b;
    }
    void sum(Fraction f){
        this.a=this.a*f.b+this.b*f.a;
        this.b=this.b*f.b;

    }
    void displey(){
        System.out.println(this.a+"/"+this.b);
    }

}
