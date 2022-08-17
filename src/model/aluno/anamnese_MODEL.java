/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.model.aluno;


import semestral.pojo.aluno.anamenese_POJO;


/**
 *
 * @author guilh
 */
public class anamnese_MODEL {
    public void verificar_anamnese(anamenese_POJO anamnese_pojo) throws IllegalArgumentException{
         if ( anamnese_pojo.getResposta().equals("") || (anamnese_pojo.getResposta().equals(null))){
         throw new IllegalArgumentException("resposta");  
       } 
         if ( anamnese_pojo.getId_aluno() == 0){
         throw new IllegalArgumentException("id_aluno"); 
     }
         if ( anamnese_pojo.getId_questoes() == 0){
         throw new IllegalArgumentException("id_questoes"); 
     }
     }
}

