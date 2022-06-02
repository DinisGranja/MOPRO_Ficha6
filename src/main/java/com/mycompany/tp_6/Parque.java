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
public class Parque {
    private int cod, areaTotal;
    private String nome, local;
    
    private static final int COD_POR_OMISSAO = 0, AREATOTAL_POR_OMISSAO=0;
    private static final String NOME_POR_OMISSAO = "", LOCAL_POR_OMISSAO = "";

    public Parque(int cod, int areaTotal, String nome, String local) {
        setCod(cod);
        setAreaTotal(areaTotal);
        setNome(nome);
        setLocal(local);
    }

    public Parque(int cod) {
        setCod(cod);
        setAreaTotal(AREATOTAL_POR_OMISSAO);
        setNome(NOME_POR_OMISSAO);
        setLocal(LOCAL_POR_OMISSAO);
    }

    public int getCod() {
        return cod;
    }

    public int getAreaTotal() {
        return areaTotal;
    }

    public String getNome() {
        return nome;
    }

    public String getLocal() {
        return local;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setAreaTotal(int areaTotal) {
        this.areaTotal = areaTotal;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "Parque{" + "cod=" + cod + ", areaTotal=" + areaTotal + ", nome=" + nome + ", local=" + local + '}';
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
        final Parque other = (Parque) obj;
        if (this.cod != other.cod) {
            return false;
        }
        if (this.areaTotal != other.areaTotal) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.local, other.local);
    }
    
    
    
    
    
}
