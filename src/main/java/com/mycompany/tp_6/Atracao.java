/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_6;

/**
 *
 * @author dinis
 */
public class Atracao {

    private String descr;
    
    private static final int idadeMinima = 1;
    private static final String DESCR_POR_OMISSAO = "";
    
    public Atracao(String descr) {
        setDescr(descr);
    }
    
    public Atracao() {
        setDescr(DESCR_POR_OMISSAO);
    }
    
    public Atracao(Atracao a) {
        setDescr(a.descr);
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }
    
}
