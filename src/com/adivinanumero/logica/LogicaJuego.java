package com.adivinanumero.logica;

import com.adivinanumero.diseno.MensajeGameOver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author dainer
 */
public class LogicaJuego  {

    private List<Integer> numeros = new ArrayList<Integer>();
    private int numeroSistema;
    
    public void generarNumeros(int tamaño, int min, int max) {      
        try {
            //No permite numeors repetidos
            Set<Integer> unico = new HashSet<>();
            while (unico.size() < tamaño) {
                int random = (int) (Math.random() * (max - min + 1)) + min;
                unico.add(random);
            }
            
            List<Integer> listaN = unico.stream()
                    .map(num -> Integer.valueOf(num))
                    .collect(Collectors.toList());

            numeros = listaN;
        } catch (Exception e) {
            e.getMessage();
        } 
    }
    
    public void generarNumeroSistema() {
        this.numeroSistema = (int) (Math.random() * (9 - 0 + 1)) + 0;
    }
    
    public List<Integer> OrdenarNumeros() {   
        try { 
            Collections.sort(this.getNumeros());           
        } catch (Exception e) {
            e.getMessage();
        } finally {
            return this.getNumeros();
        }  
    }

    /**
     * @return the numeroSistema
     */
    public int getNumeroSistema() {
        return numeroSistema;
    }

    /**
     * @return the numeros
     */
    public List<Integer> getNumeros() {
        return numeros;
    }
}
