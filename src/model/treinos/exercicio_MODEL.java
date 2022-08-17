/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.model.treinos;


import semestral.pojo.treinos.exercicio_POJO;

/**
 *
 * @author guilh
 */
public class exercicio_MODEL {
     public void verificar_exercicio (exercicio_POJO exercicio_pojo) throws IllegalArgumentException{
           if (exercicio_pojo.getNome_exercicio().equals("") || (exercicio_pojo.getNome_exercicio().equals(null))){
             throw new IllegalArgumentException("nome_exercicio");
         }
           if (exercicio_pojo.getCategoria().equals("") || (exercicio_pojo.getCategoria().equals(null))){
             throw new IllegalArgumentException("cartegoria_exercicio");
         }
     }
}
