package main;

import models.Persona;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Persona persona = new Persona();
        Scanner leer = new Scanner(System.in);
        String saludo = "Hola, desde la UNIVALLE";
        String nombre;
        int edad;
        System.out.println(saludo);
        System.out.print("Como te llamas?: ");
        nombre = leer.nextLine();
        System.out.print("Cuantos años tienes: ");
        edad = leer.nextInt();
        persona.setNombre(nombre);
        persona.setEdad(edad);
        System.out.println(persona);


    }
}
