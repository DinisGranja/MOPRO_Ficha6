/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dinis
 */
public class GestoraParques {
    private String nif;
    private List<Parque> listaParques;
    
    private static final String NIF_POR_OMISSAO = "sem NIF";

     public GestoraParques() {
        setNif(NIF_POR_OMISSAO);
        setListaParques(new ArrayList());
    }
     public GestoraParques(String nif) {
        setNif(nif);
        setListaParques(new ArrayList<Parque>());
    }
    public GestoraParques(String nif, List<Parque> listaParques) {
        this.nif = nif;
        this.listaParques = new ArrayList<Parque>(listaParques);
    }

    public String getNif() {
        return nif;
    }

    public List<Parque> getListaParques() {
        return new ArrayList<Parque>(listaParques);
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setListaParques(List listaParques) {
        this.listaParques = new ArrayList(listaParques);
    }

    @Override
    public String toString() {
        String txt="";
        txt+=("GestoraParques{" + "nif= "+nif+"}");
        for(int i=0;i<listaParques.size();i++)
            txt+="\n"+listaParques.get(i).toString();
        return txt;
    }
    public void adicionarParque(Parque parque){
        // Foi escolhida a relação a Agregação. Poderia também ser por composição (listaParques.add(new Parque(parque));)
        listaParques.add(parque);
    }
    public void eliminarParque(Parque parque){
        listaParques.remove(parque);
    }
    public Parque procurarParque(int cod){
        int enc=-1;
        for(int i=0;i<listaParques.size() && enc==-1;i++)
            if (((Parque)listaParques.get(i)).getCod()==cod)
                enc=i;
        if (enc!= -1)
            return (Parque)listaParques.get(enc);
        else
            return null;
    }
    public void adicionarAtracao(int cod,Atracao atracao){
        Parque parque= procurarParque(cod);
        if (parque != null && parque instanceof ParqueDiversoes)
            ((ParqueDiversoes)parque).adicionarAtracao(atracao);
    }
    public double obterPrecoBilhete(int cod,int idade){
        Parque parque= procurarParque(cod);
        double preco = -1;
        if (parque != null && parque instanceof Pagavel)
            preco=((Pagavel)parque).cobrarEntrada(idade);
        return preco;
    }
}
