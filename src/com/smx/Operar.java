package com.smx;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="operar")
@SessionScoped
public class Operar  implements Serializable{
    @PostConstruct // C�digo que se ejecuta tras la creaci�n del Bean. Da igual el nombre del m�todo
    public void inicio() {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>--- Inicializando Operar");
    }
    
    
    public int doblar(int num) {
        return num * 2;
    }
}
