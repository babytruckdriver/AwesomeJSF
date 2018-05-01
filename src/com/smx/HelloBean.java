package com.smx;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.ProjectStage;
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
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>--- Inicializando HelloBean");
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


    public void operarAction() {
        this.resultado = this.operar.doblar(this.numero);
        System.out.println(">> Ejecutada operación 'operarAction'.");
        
        // Se comprueba el entorno en el que estamos para enviar información extra de debug
        if(ProjectStage.Development == FacesContext.getCurrentInstance().getApplication().getProjectStage()) {
            System.out.println(">> Entorno de ejecución 'Development'. Información extra.");
        }
    }
    
    @Override
    public String toString() {
        return "HelloBean [name=" + name + ", numero=" + numero + ", resultado=" + resultado + ", operar=" + operar
                + "]";
    }

    public String logout() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "/index.xhtml?faces-redirect=true";
    }    
    
    public String navegar() {
        System.out.println("Navegando..");
        return "foo";
    }

    public void setOperar(Operar operar) {
        this.operar = operar;
    }
}
