/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.view.aluno;

import semestral.view.*;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import semestral.view.aluno.tela_aluno;
import semestral.view.aluno.tela_cadastro_anamenese_menu;
import semestral.view.avaliacao.tela_avalicao;
import semestral.view.treinos.tela_treino;

/**
 *
 * @author guilh
 */
public class tela_cadastro_anamenese_menu extends javax.swing.JInternalFrame {
    navegacao navega = new navegacao();
    /**
     * Creates new form tela_home_menu
     */
    JDesktopPane area_menu;
    JDesktopPane area_trabalho;
    JInternalFrame tela;
    Dimension dimensao ; 
    public tela_cadastro_anamenese_menu(Dimension tamanho,JDesktopPane area_menu_,JDesktopPane area_trabalho_, JInternalFrame aba) {
        initComponents();
        area_menu = area_menu_;
        area_trabalho = area_trabalho_;
        tela = aba;
        dimensao = tamanho;
        ajustar_imagem();
        
    }
    public void ajustar_imagem(){
        this.setSize(dimensao);
        L_imagem.setSize(dimensao);
        ImageIcon icon = new ImageIcon("src/semestral/imagem/menu/Menu Lateral Anamnese Light.png");
        icon.setImage(icon.getImage().getScaledInstance(
        L_imagem.getWidth(), L_imagem.getHeight(),1));
        L_imagem.setIcon(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        B_perfil = new javax.swing.JLabel();
        B_anamnese = new javax.swing.JLabel();
        B_termo = new javax.swing.JLabel();
        B_home = new javax.swing.JLabel();
        B_aluno = new javax.swing.JLabel();
        B_avalicao = new javax.swing.JLabel();
        B_treino = new javax.swing.JLabel();
        L_imagem = new javax.swing.JLabel();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(140, 670));
        setVerifyInputWhenFocusTarget(false);
        getContentPane().setLayout(null);

        B_perfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_perfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_perfilMouseClicked(evt);
            }
        });
        getContentPane().add(B_perfil);
        B_perfil.setBounds(0, 170, 130, 30);

        B_anamnese.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_anamnese.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_anamneseMouseClicked(evt);
            }
        });
        getContentPane().add(B_anamnese);
        B_anamnese.setBounds(0, 220, 130, 40);

        B_termo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_termo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_termoMouseClicked(evt);
            }
        });
        getContentPane().add(B_termo);
        B_termo.setBounds(10, 270, 130, 30);

        B_home.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        B_home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_homeMouseClicked(evt);
            }
        });
        getContentPane().add(B_home);
        B_home.setBounds(10, 40, 130, 50);

        B_aluno.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        B_aluno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_aluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_alunoMouseClicked(evt);
            }
        });
        getContentPane().add(B_aluno);
        B_aluno.setBounds(60, 110, 130, 40);

        B_avalicao.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        B_avalicao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_avalicao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_avalicaoMouseClicked(evt);
            }
        });
        getContentPane().add(B_avalicao);
        B_avalicao.setBounds(10, 360, 130, 40);

        B_treino.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        B_treino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        B_treino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_treinoMouseClicked(evt);
            }
        });
        getContentPane().add(B_treino);
        B_treino.setBounds(10, 310, 130, 40);

        L_imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semestral/imagem/menu/Menu Anamnese Light.png"))); // NOI18N
        L_imagem.setPreferredSize(new java.awt.Dimension(160, 670));
        getContentPane().add(L_imagem);
        L_imagem.setBounds(0, 0, 160, 742);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_alunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_alunoMouseClicked
        tela_aluno tela_ = new tela_aluno(area_trabalho.getSize(),area_menu, area_trabalho,tela); // revisar
        tela_aluno_menu menu_= new tela_aluno_menu(dimensao, area_menu, area_trabalho, tela_);
        navega.navegar(area_trabalho, area_menu, tela_, menu_, tela, this);
        
    }//GEN-LAST:event_B_alunoMouseClicked

    private void B_perfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_perfilMouseClicked
      
//        tela_aluno tela_ = new tela_aluno(area_trabalho.getSize(), this);
//        tela_cadastro_aluno_menu menu_= new tela_cadastro_aluno_menu(dimensao, area_menu, area_trabalho, tela_);
//        navega.navegar(area_trabalho, area_menu, tela_, menu_, tela, this);
    }//GEN-LAST:event_B_perfilMouseClicked

    private void B_anamneseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_anamneseMouseClicked

//        tela_aluno tela_ = new tela_aluno(area_trabalho.getSize());
//        tela_aluno_menu menu_= new tela_aluno_menu(dimensao, area_menu, area_trabalho, tela_);
//        navega.navegar(area_trabalho, area_menu, tela_, menu_, tela, this);
    }//GEN-LAST:event_B_anamneseMouseClicked

    private void B_termoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_termoMouseClicked
      
    }//GEN-LAST:event_B_termoMouseClicked

    private void B_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_homeMouseClicked
       tela_home tela_ = new tela_home(area_trabalho.getSize());
       tela_home_menu menu_= new tela_home_menu(dimensao, area_menu, area_trabalho, tela_);
       navega.navegar(area_trabalho, area_menu, tela_, menu_, tela, this);
    }//GEN-LAST:event_B_homeMouseClicked

    private void B_avalicaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_avalicaoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_B_avalicaoMouseClicked

    private void B_treinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_treinoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_B_treinoMouseClicked
    public void cadastrar(){
       tela_home tela_ = new tela_home(area_trabalho.getSize());
       tela_home_menu menu_= new tela_home_menu(dimensao, area_menu, area_trabalho, tela_);
       navega.navegar(area_trabalho, area_menu, tela_, menu_, tela, this);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel B_aluno;
    private javax.swing.JLabel B_anamnese;
    private javax.swing.JLabel B_avalicao;
    private javax.swing.JLabel B_home;
    private javax.swing.JLabel B_perfil;
    private javax.swing.JLabel B_termo;
    private javax.swing.JLabel B_treino;
    private javax.swing.JLabel L_imagem;
    // End of variables declaration//GEN-END:variables
}
