/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.tp_6;

/**
 *
 * @author dinis
 */
public class Tp_6 {

    public static void main(String[] args) {
        // Formas diferentes de criação de uma referência do tipo D:
        A a = new D();
        B b = new D();
        C c = new D();
        D d = new D();
        System.out.println("1-> " + c.toString());
        System.out.println("2-> " + d.metodoA());
        System.out.println("3-> " + d.metodoB());
        System.out.println("4-> " + d.toString());
        System.out.println("5-> " + a.toString());
        //System.out.println("6-> "+a.metodoB()); //Dá erro. Porquê?
        //System.out.println("7-> "+a.metodoC()); //Dá erro. Porquê?
        System.out.println("8-> " + d.metodoC());
        System.out.println("9-> " + b.toString());
        System.out.println("10-> " + b.metodoB());
        //System.out.println("11-> "+b.metodoC()); //Dá erro. Porquê?
        System.out.println("12-> " + A.x);
    }
}
