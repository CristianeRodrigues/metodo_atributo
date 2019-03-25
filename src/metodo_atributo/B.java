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
public class B {

    int codigoB;
    String nomeB;
    float codigoBAux;
    A ClassA;

    public int getCodigoB() {
        return this.codigoB;
    }

    public void teste(){
        ClassA.setCodigoAux(codigoBAux);
    }
    
    public void setCodigoB(int codigoB) {
        this.codigoB = codigoB;
        ClassA.nomeA = "Nome Classe A";
        ClassA.setCodigoA(codigoB);
    }
    
}
