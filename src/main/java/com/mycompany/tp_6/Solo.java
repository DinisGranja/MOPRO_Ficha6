/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_6;

/**
 *
 * @author dinis
 */
public class Solo {
    
    private float valor_PH, teorMateriaOrganica;
    
    private static final float VALOR_PH_POR_OMISSAO = 0, TEORMATERIAORGANICA_POR_OMISSAO = 0;

    public Solo(float valor_PH, float teorMateriaOrganica) {
        setValor_PH(valor_PH);
        setTeorMateriaOrganica(teorMateriaOrganica);
    }
    
    public Solo() {
        setValor_PH(VALOR_PH_POR_OMISSAO);
        setTeorMateriaOrganica(TEORMATERIAORGANICA_POR_OMISSAO);
    }
    
    public Solo(Solo s){
        setValor_PH(s.valor_PH);
        setTeorMateriaOrganica(s.teorMateriaOrganica);
    }

    public float getValor_PH() {
        return valor_PH;
    }

    public void setValor_PH(float valor_PH) {
        this.valor_PH = valor_PH;
    }

    public float getTeorMateriaOrganica() {
        return teorMateriaOrganica;
    }

    public void setTeorMateriaOrganica(float teorMateriaOrganica) {
        this.teorMateriaOrganica = teorMateriaOrganica;
    }
    
}
