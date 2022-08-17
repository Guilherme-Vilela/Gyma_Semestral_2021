/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.model.avaliacao;

import semestral.pojo.avaliacao.protocolo_marinha_POJO;



/**
 *
 * @author guilh
 */
public class protocolo_marinha_MODEL {
       public void verificar_protocolo_fe(protocolo_marinha_POJO protocolo_fe_pojo) throws IllegalArgumentException{
         if (protocolo_fe_pojo.getId_avaliacao()== 0){
         throw new IllegalArgumentException("id_avalicao"); 
         }
    }
}
