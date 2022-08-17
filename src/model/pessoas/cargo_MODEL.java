/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.model.pessoas;

import semestral.pojo.geral.cargo_POJO;


/**
 *
 * @author guilh
 */
public class cargo_MODEL {
     public void verificar_cargo(cargo_POJO cargo_pojo) throws IllegalArgumentException{
         if ( cargo_pojo.getFuncao().equals("") || (cargo_pojo.getFuncao().equals(null))){
             throw new IllegalArgumentException("Função");
         }
         if ( cargo_pojo.getSalario()== 0 ){
             throw new IllegalArgumentException("Salario");
         }
         if ( cargo_pojo.getHorario().equals("") || (cargo_pojo.getHorario().equals(null))){
             throw new IllegalArgumentException("horario");
         }
     }
}
