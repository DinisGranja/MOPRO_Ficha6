/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_6;

/**
 *
 * @author dinis
 */
public class ParqueNatural extends Parque{
    
    private Veg veg;
    public enum Veg{ARBOREA,ARBUSTIVA,HERBACEA};
    private static final Veg VEG_POR_OMISSAO = Veg.ARBOREA;

    public ParqueNatural(int cod, int areaTotal, String nome, String local, Veg veg) {
        super(cod, areaTotal, nome, local);
        setVeg(veg);
    }

    public ParqueNatural(int cod) {
        super(cod);
        setVeg(VEG_POR_OMISSAO);
    }

    public Veg getVeg() {
        return veg;
    }

    public void setVeg(Veg veg) {
        this.veg = veg;
    }
}
