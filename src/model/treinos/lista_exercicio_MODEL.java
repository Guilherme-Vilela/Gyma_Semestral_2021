/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.model.treinos;


import semestral.pojo.treinos.lista_exercicio_POJO;

/**
 *
 * @author guilh
 */
public class lista_exercicio_MODEL {
    public void verificar_cadastro_lista_exercicio (lista_exercicio_POJO  lista_exercicio_pojo) throws IllegalArgumentException{
           if (lista_exercicio_pojo.getOrdem().equals("") || (lista_exercicio_pojo.getOrdem().equals(null))){
             throw new IllegalArgumentException("Ordem");
         }
           if (lista_exercicio_pojo.getSerie().equals("") || (lista_exercicio_pojo.getSerie().equals(null))){
             throw new IllegalArgumentException("serie");
         }
           if (lista_exercicio_pojo.getId_exercicio()== 0 ){
             throw new IllegalArgumentException("id_exercicio");
         }
           if (lista_exercicio_pojo.getId_lista()== 0 ){
             throw new IllegalArgumentException("id_lista");
         }
     }
}
