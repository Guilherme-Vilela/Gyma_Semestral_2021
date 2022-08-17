/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.model.aluno;


import semestral.pojo.aluno.horario_POJO;

/**
 *
 * @author guilh
 */
public class horario_MODEL {
      public void verificar_horario(horario_POJO horario_pojo) throws IllegalArgumentException{
         if ( horario_pojo.getDia_semana().equals("") || (horario_pojo.getDia_semana().equals(null))){
         throw new IllegalArgumentException("dia_semana");  
       } 
         if ( horario_pojo.getTurno().equals("") || (horario_pojo.getTurno().equals(null))){
         throw new IllegalArgumentException("turno");  
       } 

         if ( horario_pojo.getHorario().equals("") || (horario_pojo.getHorario().equals(null))){
         throw new IllegalArgumentException("horario");  
       } 

         if (horario_pojo.getId_aluno() == 0){
         throw new IllegalArgumentException("id_aluno"); 
     }
    
}
}
