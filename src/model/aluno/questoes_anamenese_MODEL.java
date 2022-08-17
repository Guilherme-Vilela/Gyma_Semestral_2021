/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.model.aluno;


import semestral.pojo.geral.questoes_anamenese_POJO;

/**
 *
 * @author guilh
 */
public class questoes_anamenese_MODEL {
    public void verificar_aluno_anamnese(questoes_anamenese_POJO questoes_pojo) throws IllegalArgumentException{
         if (  questoes_pojo.getTexto_questao().equals("") || ( questoes_pojo.getTexto_questao().equals(null))){
         throw new IllegalArgumentException("texto_questao");  
       }
  
     }
    
    

}
