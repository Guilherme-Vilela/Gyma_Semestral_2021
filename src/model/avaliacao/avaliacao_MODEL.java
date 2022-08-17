/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.model.avaliacao;


import semestral.pojo.avaliacao.avaliacao_POJO;

/**
 *
 * @author guilh
 */
public class avaliacao_MODEL {

  public void verificar_avalicao(avaliacao_POJO avalicao_pojo) throws IllegalArgumentException{
         if (avalicao_pojo.getId_colaborador() == 0){
         throw new IllegalArgumentException("colaborador"); 
     }
         if (avalicao_pojo.getId_aluno()== 0){
         throw new IllegalArgumentException("aluno"); 
     }
     }
}
