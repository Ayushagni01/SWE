package com.learning.demo.Java.Design.Builder;
import com.learning.demo.Java.Design.Builder.*;
public class BuilderClient {
    public static void main(String[] args) {

               Person person =  new Person.PersonBuilder("Ayush", "Agnihotri")
                .age(10)
                .phone("9807578783")
                .address("Bengaluru")
                .build();

                System.out.println(person);


        Person person1 =  new Person.PersonBuilder("Shivam", "Agni")
                .age(10)
                .address("Bengaluru")
                .build();

        System.out.println(person1);
    }
}
