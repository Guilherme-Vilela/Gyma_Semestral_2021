/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.model.pessoas;


import semestral.pojo.pessoas.pessoa_POJO;

/**
 *
 * @author guilh
 */
public class pessoa_MODEL {
    public void verificar_pessoa (pessoa_POJO pessoa_pojo) throws IllegalArgumentException{
             if (pessoa_pojo.getCPF().equals("") || (pessoa_pojo.getCPF().equals(null))){
             throw new IllegalArgumentException("cpf");
         }
             if (pessoa_pojo.getNome().equals("") || (pessoa_pojo.getNome().equals(null))){
             throw new IllegalArgumentException("nome");
         }
             if (pessoa_pojo.getTelefone().equals("") || (pessoa_pojo.getTelefone().equals(null))){
             throw new IllegalArgumentException("telefone");
         } 
             if (pessoa_pojo.getEmail().equals("") || (pessoa_pojo.getEmail().equals(null))){
             throw new IllegalArgumentException("email");
         } 
             if (pessoa_pojo.getPassword().equals("") || (pessoa_pojo.getPassword().equals(null))){
             throw new IllegalArgumentException("passaword");
         }  
             if (pessoa_pojo.getCep().equals("") || (pessoa_pojo.getCep().equals(null))){
             throw new IllegalArgumentException("cep");
         } 
     }


}
