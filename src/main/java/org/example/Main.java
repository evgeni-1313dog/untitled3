package org.example;


import com.google.gson.Gson;
import org.example.Doman.Person;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Sig", "Den",32);

        Gson gson = new Gson();
        String son = gson.toJson(person);
        System.out.println("Серелизация: " + son);

        Person deserilizeblPerson = gson.fromJson(son, Person.class);
        System.out.println("Десерелизация: " + deserilizeblPerson);

    }
}