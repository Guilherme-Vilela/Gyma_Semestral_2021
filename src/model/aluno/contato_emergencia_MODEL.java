/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.model.aluno;

import semestral.pojo.aluno.contato_emergencia_POJO;

/**
 *
 * @author guilh
 */
public class contato_emergencia_MODEL {
      public void verificar_contato_emergencia(contato_emergencia_POJO contato_pojo) throws IllegalArgumentException{
         if ( contato_pojo.getNome().equals("") || (contato_pojo.getNome().equals(null))){
         throw new IllegalArgumentException("Nome");  
       } 
         if ( contato_pojo.getId_aluno() == 0){
         throw new IllegalArgumentException("id_aluno"); 
     }
           if ( contato_pojo.getTelefone().equals("") || (contato_pojo.getTelefone().equals(null))){
         throw new IllegalArgumentException("Telefone");  
       } 
}
}
