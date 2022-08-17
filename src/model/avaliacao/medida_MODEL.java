/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.model.avaliacao;

import semestral.pojo.avaliacao.medida_POJO;

/**
 *
 * @author guilh
 */
public class medida_MODEL {
    public void verificar_medida(medida_POJO medida_pojo) throws IllegalArgumentException{
         if (medida_pojo.getCirc_inf()== 0){
         throw new IllegalArgumentException("circuferencia_inf"); 
     }
         if (medida_pojo.getCirc_pescoco()== 0){
         throw new IllegalArgumentException("circuferencia_pescoco"); 
     }
         if (medida_pojo.getCirc_quadril()== 0){
         throw new IllegalArgumentException("circuferencia_quadril"); 
     }
         if (medida_pojo.getCirc_uml()== 0){
         throw new IllegalArgumentException("circuferencia_uml"); 
     }
         if (medida_pojo.getEstatura()== 0){
         throw new IllegalArgumentException("estatura"); 
     }
          if (medida_pojo.getGordura()== 0){
         throw new IllegalArgumentException("gordura"); 
     }
          if (medida_pojo.getPeso_corporal()== 0){
         throw new IllegalArgumentException("peso_corporal"); 
     }
          if (medida_pojo.getId_avalicao()== 0){
         throw new IllegalArgumentException("id_avalicao"); 
     }
     }
}
