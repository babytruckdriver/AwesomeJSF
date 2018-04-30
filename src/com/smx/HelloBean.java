package com.smx;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class HelloBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name = "Sira";
    private int numero;
    @ManagedProperty(value = "#{operar}")
    private Operar operar;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getName() {
        return "Samuel";
    }

    /**
     * Este método posibilita el debugeo desde la vista
     */
    @Override
    public String toString() {
        return "HelloBean [name=" + name + "]";
    }

    public void operarAction() {
        this.numero = operar.doblar(this.numero);
    }

    public void setOperar(Operar operar) {
        this.operar = operar;
    }
}
