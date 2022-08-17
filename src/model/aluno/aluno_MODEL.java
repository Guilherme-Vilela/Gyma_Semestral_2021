/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.model.aluno;

import semestral.pojo.aluno.aluno_POJO;

/**
 *
 * @author guilh
 */
public class aluno_MODEL {
     public void verificar_aluno(aluno_POJO aluno_pojo) throws IllegalArgumentException{
         if ( aluno_pojo.getObjetivo().equals("") || (aluno_pojo.getObjetivo().equals(null))){
         throw new IllegalArgumentException("Objetivo");  
       }
         if ( aluno_pojo.getId_pessoa() == 0){
         throw new IllegalArgumentException("id_pessoa"); 
     }
     }
}
