/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.view.pessoas;

import semestral.pojo.pessoas.colaborador_POJO;

import semestral.pojo.pessoas.pessoa_POJO;
import semestral.pojo.pessoas.pessoa_cargo_POJO;

/**
 *
 * @author guilh
 */
public class cadastrar_colaborador extends javax.swing.JInternalFrame {

    /**
     * Creates new form cadastrar_colaborador
     */
    public cadastrar_colaborador() {
        initComponents();
    }
    public String[] monta_cadastro_pessoa(pessoa_POJO pessoa_pojo){
   String[] dados = {"nome","CPF","telefone","email","user_password","estado","cidade","rua","bairro","cep","numero","status_p","genero",pessoa_pojo.getNome(),pessoa_pojo.getCPF(),pessoa_pojo.getTelefone(),pessoa_pojo.getEmail(),pessoa_pojo.getPassword(),pessoa_pojo.getEstado(),pessoa_pojo.getCidade(),pessoa_pojo.getRua(),pessoa_pojo.getBairro(),pessoa_pojo.getCep(),pessoa_pojo.getNumero()+"",pessoa_pojo.getStatus_p()+"",pessoa_pojo.getGenero()};
    return dados;
    }
 
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
