/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo_atributo;

/**
 *
 * @author Cristiane
 */
public class A {
    float codigoAux;
    int codigoA;
    int nomeA;
    
    public void setCodigoAux(float codigoAux){
        this.codigoAux = codigoAux;
    }

    public int getCodigoA() {
        return this.codigoA;
    }

    public void setCodigoA(int codigoA) {
        this.codigoA = codigoA;
        System.out.println("Codigo");
    }
}
