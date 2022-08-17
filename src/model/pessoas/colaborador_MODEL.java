/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.model.pessoas;

import semestral.pojo.pessoas.colaborador_POJO;

/**
 *
 * @author guilh
 */
public class colaborador_MODEL {
    public void verificar_colaborador (colaborador_POJO colaborador_pojo) throws IllegalArgumentException{
         if (colaborador_pojo.getPis().equals("") || (colaborador_pojo.getPis().equals(null))){
             throw new IllegalArgumentException("pis");
         }
          if (colaborador_pojo.getCarteira_trabalho().equals("") || (colaborador_pojo.getCarteira_trabalho().equals(null))){
             throw new IllegalArgumentException("carteira_trabalho");
         }
           if (colaborador_pojo.getId_pessoa() == 0){
             throw new IllegalArgumentException("id_pessoa");
         }
     }
}
