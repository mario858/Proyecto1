/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto1_200614833;

import java.util.ArrayList;

/**
 *
 * @author Mario
 */
public class Nodo {
    

    public String valor;
    public ArrayList<Nodo> hijos;

    public Nodo(String valor) {
        this.valor = valor;
        hijos = new ArrayList<Nodo>();
    }  
}
