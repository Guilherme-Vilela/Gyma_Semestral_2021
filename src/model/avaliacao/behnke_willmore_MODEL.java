/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.model.avaliacao;


import semestral.pojo.avaliacao.behnke_willmore_POJO;

/**
 *
 * @author guilh
 */
public class behnke_willmore_MODEL {
    public void verificar_beh_will(behnke_willmore_POJO behnke_willmore_pojo) throws IllegalArgumentException{
         if (behnke_willmore_pojo.getId_avaliacao()== 0){
         throw new IllegalArgumentException("id_avalicao"); 
         }
    }
}


