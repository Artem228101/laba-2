package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Imput a number");
        double num = in.nextDouble();
        double argone = Math.cos(num);
        double argtwo = Math.cos(2*num);
        double argthree = Math.cos(6*num);
        double argfour = Math.cos(7*num);
        double z = argone + argtwo + argtwo + argfour;
        System.out.print(z);
        in.close();
    }
}