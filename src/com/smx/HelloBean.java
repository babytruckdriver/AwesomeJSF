package com.smx;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class HelloBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name = "Sira";
    private int numero;
    private int resultado;
   

    @ManagedProperty(value = "#{operar}")
    private Operar operar;
    
    @PostConstruct // Código que se ejecuta tras la creación del Bean
    public void init() {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>---Do initialization");
        this.numero = 1;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getName() {
        return "Samuel";
    }
    
    public int getResultado() {
        return resultado;
    }

    /**
     * Este método posibilita el debugeo desde la vista
     */
    @Override
    public String toString() {
        return "HelloBean [name=" + name + "]";
    }

    public void operarAction() {
        this.resultado = this.numero;
        System.out.println(">> Ejecutada operación 'operarAction'.");
    }
    
    public String logout() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "/hello.xhtml?faces-redirect=true";
    }    

    public void setOperar(Operar operar) {
        this.operar = operar;
    }
}
