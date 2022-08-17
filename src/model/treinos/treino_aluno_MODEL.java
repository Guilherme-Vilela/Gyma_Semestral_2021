/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.model.treinos;


import semestral.pojo.treinos.treino_aluno_POJO;

/**
 *
 * @author guilh
 */
public class treino_aluno_MODEL {
     public void verificar_cadastro_treino_aluno (treino_aluno_POJO  treino_aluno_pojo) throws IllegalArgumentException{
           if (treino_aluno_pojo.getData_inicio().equals("") || (treino_aluno_pojo.getData_inicio().equals(null))){
             throw new IllegalArgumentException("t_a_data_inicio");
         }
           if (treino_aluno_pojo.getId_aluno()== 0){
             throw new IllegalArgumentException("t_a_aluno");
         }
           if (treino_aluno_pojo.getId_treino()== 0 ){
             throw new IllegalArgumentException("t_a_treino");
         }
         
     }
}
