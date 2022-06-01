/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_6;

import java.util.Objects;

/**
 *
 * @author dinis
 */
public class ParqueUrbano extends Parque implements Pagavel{
    private int areaVerde, areaAquatica;
    private static final int idadeReferencia=18;
    private static final double precoBilhete=4.00, descontoIdade=0.5, acrescimo=0.1, relacaoAguaEspacoVerde=0.2;
    private Solo solo;
    
    private static final int AREAVERDE_POR_OMISSAO = 0, AREAQUATICA_POR_OMISSAO = 0;
    private static final Solo SOLO_POR_OMISSAO = new Solo();
    
    public ParqueUrbano(int areaVerde, int areaAquatica, Solo solo, int cod, int areaTotal, String nome, String local) {
        super(cod, areaTotal, nome, local);
        setAreaVerde(areaVerde);
        setAreaAquatica(areaAquatica);
        setSolo(solo);
    }

    public ParqueUrbano(int areaVerde, int areaAquatica, Solo solo, int cod) {
        super(cod);
        setAreaVerde(AREAVERDE_POR_OMISSAO);
        setAreaAquatica(AREAQUATICA_POR_OMISSAO);
        setSolo(SOLO_POR_OMISSAO);
    }

    public int getAreaVerde() {
        return areaVerde;
    }

    public void setAreaVerde(int areaVerde) {
        this.areaVerde = areaVerde;
    }

    public int getAreaAquatica() {
        return areaAquatica;
    }

    public void setAreaAquatica(int areaAquatica) {
        this.areaAquatica = areaAquatica;
    }

    public Solo getSolo() {
        return solo;
    }

    public void setSolo(Solo solo) {
        this.solo = solo;
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
        final ParqueUrbano other = (ParqueUrbano) obj;
        if (this.areaVerde != other.areaVerde) {
            return false;
        }
        if (this.areaAquatica != other.areaAquatica) {
            return false;
        }
        return Objects.equals(this.solo, other.solo);
    }

    @Override
    public String toString() {
        return "ParqueUrbano{" + "areaVerde=" + areaVerde + ", areaAquatica=" + areaAquatica + ", solo=" + solo + '}';
    }
    
    public double cobrarEntrada(int idade){
        double b = 0;
        
        if (idade<idadeReferencia) {
            b = precoBilhete*descontoIdade;
        }
        
        if (areaVerde*areaAquatica>relacaoAguaEspacoVerde) {
            b =+ precoBilhete*descontoIdade;
        }else{
            b =+ precoBilhete;
        }
        
        return b;
    }
}
