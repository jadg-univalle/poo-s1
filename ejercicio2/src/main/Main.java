package main;

import models.Operacion;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Operacion operacion = new Operacion();
        int num1, num2, suma;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Dime un numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Dime otro numero"));
        suma = operacion.sumar(num1, num2);
        JOptionPane.showMessageDialog(null, "La suma es "+ suma);
    }
}
