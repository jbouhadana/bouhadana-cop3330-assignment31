/*
 *  UCF COP3330 Summer 2021 Assignment 31 Solution
 *  Copyright 2021 Jeremy Bouhadana
 */
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner jb=new Scanner(System.in);
        System.out.print("How old are you? ");
        int age=jb.nextInt();
        System.out.print("What is your resting heart rate? ");
        int restingHeartRate=jb.nextInt();
        System.out.println("Resting Pulse : "+restingHeartRate+" Age: "+age);
        for(int i=55;i<=95;i+=5)
        {
            int heartRate=(int)Math.round((((220-age)-restingHeartRate)*(i/100.0))+restingHeartRate);
            System.out.println(i+"%\t "+heartRate+"bpm");
        }
    }
}

