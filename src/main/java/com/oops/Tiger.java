package com.oops;

/**
 * Created by Harsha on 2/25/2017.
 */
public class Tiger implements Animal {


    @Override
    public void greeting() {
        System.out.println("Hello World");
    }



    public static void main(String[] args) {
        Tiger tiger=new Tiger();
        tiger.greeting();

    }


}
