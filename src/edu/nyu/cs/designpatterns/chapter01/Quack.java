package edu.nyu.cs.designpatterns.chapter01;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

}
