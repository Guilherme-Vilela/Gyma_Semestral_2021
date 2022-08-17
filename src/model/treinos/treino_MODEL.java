/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.model.treinos;


import semestral.pojo.treinos.treino_POJO;

/**
 *
 * @author guilh
 */
public class treino_MODEL {
     public void verificar_cadastro_treino (treino_POJO  treino_pojo) throws IllegalArgumentException{
           if (treino_pojo.getNome().equals("") || (treino_pojo.getNome().equals(null))){
             throw new IllegalArgumentException("nome_treino");
         }
           if (treino_pojo.getNivel().equals("") || (treino_pojo.getNivel().equals(null))){
             throw new IllegalArgumentException("nivel");
         }
           if (treino_pojo.getId_colaborador()== 0 ){
             throw new IllegalArgumentException("id_colaborador");
         }
         
     }
}
