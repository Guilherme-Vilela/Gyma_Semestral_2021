/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.model.pessoas;

import semestral.pojo.pessoas.pessoa_cargo_POJO;


/**
 *
 * @author guilh
 */
public class pessoa_cargo_MODEL {
    public void verificar_pessoa_cargo (pessoa_cargo_POJO pessoa_cargo_pojo) throws IllegalArgumentException{
         
           if (pessoa_cargo_pojo.getId_pessoa() == 0){
             throw new IllegalArgumentException("id_pessoa");
         }
            if (pessoa_cargo_pojo.getId_cargo()== 0){
             throw new IllegalArgumentException("id_cargo");
         }
            
     }
}
