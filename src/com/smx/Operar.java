package com.smx;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="operar")
@SessionScoped
public class Operar  implements Serializable{
    public int doblar(int num) {
        return num * 2;
    }
}
