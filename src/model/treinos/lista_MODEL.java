/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.model.treinos;

import semestral.pojo.treinos.lista_POJO;

/**
 *
 * @author guilh
 */
public class lista_MODEL {
    public void verificar_lista (lista_POJO lista_pojo) throws IllegalArgumentException{
           if (lista_pojo.getVelocidade().equals("") || (lista_pojo.getVelocidade().equals(null))){
             throw new IllegalArgumentException("Velocidade");
         }
           if (lista_pojo.getIntervalo().equals("") || (lista_pojo.getIntervalo().equals(null))){
             throw new IllegalArgumentException("Intervalo");
         }
      if (lista_pojo.getDia().equals("") || (lista_pojo.getDia().equals(null))){
             throw new IllegalArgumentException("Dias lista");
         }
       if (lista_pojo.getNome().equals("") || (lista_pojo.getNome().equals(null))){
             throw new IllegalArgumentException("nome lista");
         }
     }
}
