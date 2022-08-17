/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.model.avaliacao;


import semestral.pojo.avaliacao.dipasquali_POJO;

/**
 *
 * @author guilh
 */
public class dipasquali_MODEL {
    public void verificar_dipasquali(dipasquali_POJO dipasquali_pojo) throws IllegalArgumentException{
         if (dipasquali_pojo.getId_avaliacao()== 0){
         throw new IllegalArgumentException("id_avalicao"); 
         }
    }
}
