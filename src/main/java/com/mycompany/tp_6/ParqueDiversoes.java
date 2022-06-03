/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_6;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author dinis
 */
public class ParqueDiversoes extends Parque implements Pagavel{
    private ArrayList<Atracao> atr= new ArrayList<Atracao>();
    private static final double precoBilhete = 10.00, descontoIdade = 0.2;
    private static final int idadeReferencia = 6;

    public ParqueDiversoes(int cod, int areaTotal, String nome, String local) {
        super(cod, areaTotal, nome, local);
    }

    public ParqueDiversoes(int cod) {
        super(cod);
    }

    public ArrayList<Atracao> getAtr() {
        return atr;
    }

    public void setAtr(ArrayList<Atracao> atr) {
        this.atr = atr;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ParqueDiversoes other = (ParqueDiversoes) obj;
        return Objects.equals(this.atr, other.atr);
    }

    @Override
    public String toString() {
        String txt = super.toString();
        for (int i = 0; i < atr.size(); i++) {
            txt+=atr.get(i).toString()+"\n";
        }
        return "ParqueDiversoes{" + txt +'}';
    }

    
    
    public void adicionarAtracao(Atracao a){
        atr.add(a);
    }
    
    public void eliminarAtracao(Atracao a){
        atr.remove(a);
    }
    
    public double cobrarEntrada(int idade){
        if (idade<idadeReferencia) {
            return precoBilhete*(1-descontoIdade);
        }else{
            return precoBilhete;
        }
    }
}
