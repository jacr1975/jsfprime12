/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

import javax.faces.bean.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author jacr1
 */
@Named
@RequestScoped
public class SignatureView {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
