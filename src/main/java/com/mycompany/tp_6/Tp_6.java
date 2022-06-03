/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.tp_6;

import java.util.ArrayList;

/**
 *
 * @author dinis
 */
public class Tp_6 {

    public static void main(String[] args) {
        /*
        ParqueDiversoes pd1 = new ParqueDiversoes(1, 2500, "Parque Diversao1", "Braga");
        ParqueNatural pn1 = new ParqueNatural(2, 12800, "Parque Natural2", "Leiria",ParqueNatural.Veg.ARBOREA);
        ParqueUrbano pb1 = new ParqueUrbano(3, 2500, "Parque Urbano1", "Porto",2000,500,new Solo(3,6));
    
        ArrayList<Parque> vecParques = new ArrayList<Parque>();
        vecParques.add(pd1);
        vecParques.add(pn1);
        vecParques.add(pb1);
        
        for (int i = 0; i < vecParques.size(); i++) {
            System.out.println(vecParques.get(i).toString());
        }
        
        ParqueDiversoes pd2 = new ParqueDiversoes(4, 32500, "Parque Diversao2", "Faro");
        vecParques.add(pd2);
        
        for (int i = 0; i < vecParques.size(); i++) {
            System.out.println(vecParques.get(i).toString());
        }
        
        System.out.println(pd1.cobrarEntrada(6));
        
        System.out.println(pn1.getVeg());
        */
        
        ParqueDiversoes pd1 = new ParqueDiversoes(1, 2500, "Parque Diversao1", "Braga");
        ParqueNatural pn1 = new ParqueNatural(2, 12800, "Parque Natural2", "Leiria",ParqueNatural.Veg.ARBOREA);
        ParqueUrbano pb1 = new ParqueUrbano(3, 2500, "Parque Urbano1", "Porto",2000,500,new Solo(3,6));
        GestoraParques gp = new GestoraParques("12345678");
        gp.adicionarParque(pd1);
        gp.adicionarParque(pn1);
        gp.adicionarParque(pb1);
         // Listar
        System.out.println("Listagem de todos os parques");
        System.out.println(gp.toString()); 
        // eliminar parque
        gp.eliminarParque(pn1);
        // Listar
        System.out.println("Listagem de todos os parques");
        System.out.println(gp.toString()); 
        int cod=3;
        Parque parque = gp.procurarParque(cod);
        if (parque != null)
            System.out.println("Encontrou: "+parque);
        else
            System.out.println("Não existe nenhum parque com o código "+cod);
        double precoBilhete = gp.obterPrecoBilhete(3,12);
        System.out.println("Preço do bilhete do parque com código "+cod+" = "+precoBilhete);
        Atracao at1 = new Atracao("Montanha-russa");
        gp.adicionarAtracao(1, at1);
        parque = gp.procurarParque(1);
        if (parque != null)
            System.out.println("Adicionou uma atração ao parque "+parque);
        else
            System.out.println("Não existe nenhum parque com o código "+cod);
         
    }
}
