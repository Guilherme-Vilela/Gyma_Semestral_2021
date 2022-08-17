/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.view.aluno;

import java.awt.Dimension;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.table.DefaultTableModel;
import semestral.dao.aluno.aluno_DAO;
import semestral.pojo.aluno.aluno_POJO;
import semestral.pojo.aluno.contato_emergencia_POJO;
import semestral.pojo.aluno.horario_POJO;
import semestral.pojo.pessoas.pessoa_POJO;
import semestral.view.navegacao;
import semestral.view.tela_home;


/**
 *
 * @author guilh
 */
public class tela_cadastro_anamenese extends javax.swing.JInternalFrame {
    aluno_DAO aluno_dao = new aluno_DAO();
    navegacao navega = new navegacao();
    /**
     * Creates new form tela_aluno
     */
   JDesktopPane area_menu;
    JDesktopPane area_trabalho;
    JInternalFrame tela;
    Dimension dimensao ; 
    public tela_cadastro_anamenese(Dimension tamanho,JDesktopPane area_menu_,JDesktopPane area_trabalho_, JInternalFrame aba) {
        initComponents();
        this.setSize(tamanho);
        area_menu = area_menu_;
        area_trabalho = area_trabalho_;
        tela = aba;
        dimensao = tamanho;
        L_imagem.setSize(tamanho);
        ImageIcon icon = new ImageIcon("src/semestral/imagem/area_trabalho/Area de Trabalho Anamnese.png");
        icon.setImage(icon.getImage().getScaledInstance(
        L_imagem.getWidth(), L_imagem.getHeight(),1));
        L_imagem.setIcon(icon);

    }
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        G_questao_01 = new javax.swing.ButtonGroup();
        G_questao_05 = new javax.swing.ButtonGroup();
        G_questao_06 = new javax.swing.ButtonGroup();
        G_questao_07 = new javax.swing.ButtonGroup();
        G_questao_08 = new javax.swing.ButtonGroup();
        G_questao_09 = new javax.swing.ButtonGroup();
        G_questao_10 = new javax.swing.ButtonGroup();
        G_questao_11 = new javax.swing.ButtonGroup();
        G_questao_12 = new javax.swing.ButtonGroup();
        G_questao_13 = new javax.swing.ButtonGroup();
        G_questao_14 = new javax.swing.ButtonGroup();
        G_questao_15 = new javax.swing.ButtonGroup();
        G_questao_16 = new javax.swing.ButtonGroup();
        R_questao01 = new javax.swing.JTextField();
        R_questao02 = new javax.swing.JTextField();
        R_questao03 = new javax.swing.JTextField();
        R_questao04 = new javax.swing.JTextField();
        R_questao05 = new javax.swing.JTextField();
        R_questao06 = new javax.swing.JTextField();
        R_questao07 = new javax.swing.JTextField();
        R_questao08 = new javax.swing.JTextField();
        R_questao09 = new javax.swing.JTextField();
        R_questao10 = new javax.swing.JTextField();
        R_questao11 = new javax.swing.JTextField();
        R_questao15 = new javax.swing.JTextField();
        R_questao16 = new javax.swing.JTextField();
        S_questao_01_nao = new javax.swing.JRadioButton();
        S_questao_01_sim = new javax.swing.JRadioButton();
        S_questao_05_nao = new javax.swing.JRadioButton();
        S_questao_05_sim = new javax.swing.JRadioButton();
        S_questao_06_nao = new javax.swing.JRadioButton();
        S_questao_06_sim = new javax.swing.JRadioButton();
        S_questao_07_nao = new javax.swing.JRadioButton();
        S_questao_07_sim = new javax.swing.JRadioButton();
        S_questao_08_nao = new javax.swing.JRadioButton();
        S_questao_08_sim = new javax.swing.JRadioButton();
        S_questao_09_nao = new javax.swing.JRadioButton();
        S_questao_09_sim = new javax.swing.JRadioButton();
        S_questao_10_nao = new javax.swing.JRadioButton();
        S_questao_10_sim = new javax.swing.JRadioButton();
        S_questao_11_nao = new javax.swing.JRadioButton();
        S_questao_11_sim = new javax.swing.JRadioButton();
        S_questao_12_nao = new javax.swing.JRadioButton();
        S_questao_12_sim = new javax.swing.JRadioButton();
        S_questao_13_nao = new javax.swing.JRadioButton();
        S_questao_13_sim = new javax.swing.JRadioButton();
        S_questao_14_nao = new javax.swing.JRadioButton();
        S_questao_14_sim = new javax.swing.JRadioButton();
        S_questao_15_nao = new javax.swing.JRadioButton();
        S_questao_15_sim = new javax.swing.JRadioButton();
        S_questao_16_nao = new javax.swing.JRadioButton();
        S_questao_16_sim = new javax.swing.JRadioButton();
        B_cadastrar = new javax.swing.JLabel();
        B_cancelar = new javax.swing.JLabel();
        L_imagem = new javax.swing.JLabel();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1368, 720));
        getContentPane().setLayout(null);

        R_questao01.setBackground(new java.awt.Color(230, 231, 232));
        R_questao01.setBorder(null);
        R_questao01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_questao01ActionPerformed(evt);
            }
        });
        getContentPane().add(R_questao01);
        R_questao01.setBounds(760, 50, 310, 16);

        R_questao02.setBackground(new java.awt.Color(230, 231, 232));
        R_questao02.setBorder(null);
        R_questao02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_questao02ActionPerformed(evt);
            }
        });
        getContentPane().add(R_questao02);
        R_questao02.setBounds(250, 80, 130, 16);

        R_questao03.setBackground(new java.awt.Color(230, 231, 232));
        R_questao03.setBorder(null);
        R_questao03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_questao03ActionPerformed(evt);
            }
        });
        getContentPane().add(R_questao03);
        R_questao03.setBounds(530, 80, 120, 16);

        R_questao04.setBackground(new java.awt.Color(230, 231, 232));
        R_questao04.setBorder(null);
        R_questao04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_questao04ActionPerformed(evt);
            }
        });
        getContentPane().add(R_questao04);
        R_questao04.setBounds(870, 80, 150, 16);

        R_questao05.setBackground(new java.awt.Color(230, 231, 232));
        R_questao05.setBorder(null);
        R_questao05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_questao05ActionPerformed(evt);
            }
        });
        getContentPane().add(R_questao05);
        R_questao05.setBounds(760, 110, 310, 16);

        R_questao06.setBackground(new java.awt.Color(230, 231, 232));
        R_questao06.setBorder(null);
        R_questao06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_questao06ActionPerformed(evt);
            }
        });
        getContentPane().add(R_questao06);
        R_questao06.setBounds(760, 150, 310, 20);

        R_questao07.setBackground(new java.awt.Color(230, 231, 232));
        R_questao07.setBorder(null);
        R_questao07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_questao07ActionPerformed(evt);
            }
        });
        getContentPane().add(R_questao07);
        R_questao07.setBounds(840, 190, 240, 16);

        R_questao08.setBackground(new java.awt.Color(230, 231, 232));
        R_questao08.setBorder(null);
        R_questao08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_questao08ActionPerformed(evt);
            }
        });
        getContentPane().add(R_questao08);
        R_questao08.setBounds(850, 240, 240, 16);

        R_questao09.setBackground(new java.awt.Color(230, 231, 232));
        R_questao09.setBorder(null);
        R_questao09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_questao09ActionPerformed(evt);
            }
        });
        getContentPane().add(R_questao09);
        R_questao09.setBounds(800, 280, 270, 16);

        R_questao10.setBackground(new java.awt.Color(230, 231, 232));
        R_questao10.setBorder(null);
        R_questao10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_questao10ActionPerformed(evt);
            }
        });
        getContentPane().add(R_questao10);
        R_questao10.setBounds(810, 320, 270, 16);

        R_questao11.setBackground(new java.awt.Color(230, 231, 232));
        R_questao11.setBorder(null);
        R_questao11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_questao11ActionPerformed(evt);
            }
        });
        getContentPane().add(R_questao11);
        R_questao11.setBounds(810, 370, 270, 16);

        R_questao15.setBackground(new java.awt.Color(230, 231, 232));
        R_questao15.setBorder(null);
        R_questao15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_questao15ActionPerformed(evt);
            }
        });
        getContentPane().add(R_questao15);
        R_questao15.setBounds(630, 560, 290, 16);

        R_questao16.setBackground(new java.awt.Color(230, 231, 232));
        R_questao16.setBorder(null);
        R_questao16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_questao16ActionPerformed(evt);
            }
        });
        getContentPane().add(R_questao16);
        R_questao16.setBounds(240, 660, 290, 16);

        S_questao_01_nao.setBackground(new java.awt.Color(230, 231, 232));
        G_questao_01.add(S_questao_01_nao);
        S_questao_01_nao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_questao_01_naoActionPerformed(evt);
            }
        });
        getContentPane().add(S_questao_01_nao);
        S_questao_01_nao.setBounds(530, 50, 25, 30);

        S_questao_01_sim.setBackground(new java.awt.Color(230, 231, 232));
        G_questao_01.add(S_questao_01_sim);
        S_questao_01_sim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_questao_01_simActionPerformed(evt);
            }
        });
        getContentPane().add(S_questao_01_sim);
        S_questao_01_sim.setBounds(590, 50, 25, 25);

        S_questao_05_nao.setBackground(new java.awt.Color(230, 231, 232));
        G_questao_05.add(S_questao_05_nao);
        S_questao_05_nao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_questao_05_naoActionPerformed(evt);
            }
        });
        getContentPane().add(S_questao_05_nao);
        S_questao_05_nao.setBounds(520, 110, 25, 30);

        S_questao_05_sim.setBackground(new java.awt.Color(230, 231, 232));
        G_questao_05.add(S_questao_05_sim);
        S_questao_05_sim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_questao_05_simActionPerformed(evt);
            }
        });
        getContentPane().add(S_questao_05_sim);
        S_questao_05_sim.setBounds(580, 110, 25, 30);

        S_questao_06_nao.setBackground(new java.awt.Color(230, 231, 232));
        G_questao_06.add(S_questao_06_nao);
        S_questao_06_nao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_questao_06_naoActionPerformed(evt);
            }
        });
        getContentPane().add(S_questao_06_nao);
        S_questao_06_nao.setBounds(520, 150, 25, 30);

        S_questao_06_sim.setBackground(new java.awt.Color(230, 231, 232));
        G_questao_06.add(S_questao_06_sim);
        S_questao_06_sim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_questao_06_simActionPerformed(evt);
            }
        });
        getContentPane().add(S_questao_06_sim);
        S_questao_06_sim.setBounds(580, 150, 25, 30);

        S_questao_07_nao.setBackground(new java.awt.Color(230, 231, 232));
        G_questao_07.add(S_questao_07_nao);
        S_questao_07_nao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_questao_07_naoActionPerformed(evt);
            }
        });
        getContentPane().add(S_questao_07_nao);
        S_questao_07_nao.setBounds(520, 190, 25, 30);

        S_questao_07_sim.setBackground(new java.awt.Color(230, 231, 232));
        G_questao_07.add(S_questao_07_sim);
        S_questao_07_sim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_questao_07_simActionPerformed(evt);
            }
        });
        getContentPane().add(S_questao_07_sim);
        S_questao_07_sim.setBounds(580, 190, 25, 30);

        S_questao_08_nao.setBackground(new java.awt.Color(230, 231, 232));
        G_questao_08.add(S_questao_08_nao);
        S_questao_08_nao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_questao_08_naoActionPerformed(evt);
            }
        });
        getContentPane().add(S_questao_08_nao);
        S_questao_08_nao.setBounds(520, 230, 25, 30);

        S_questao_08_sim.setBackground(new java.awt.Color(230, 231, 232));
        G_questao_08.add(S_questao_08_sim);
        S_questao_08_sim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_questao_08_simActionPerformed(evt);
            }
        });
        getContentPane().add(S_questao_08_sim);
        S_questao_08_sim.setBounds(580, 230, 25, 30);

        S_questao_09_nao.setBackground(new java.awt.Color(230, 231, 232));
        G_questao_09.add(S_questao_09_nao);
        S_questao_09_nao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_questao_09_naoActionPerformed(evt);
            }
        });
        getContentPane().add(S_questao_09_nao);
        S_questao_09_nao.setBounds(520, 280, 25, 30);

        S_questao_09_sim.setBackground(new java.awt.Color(230, 231, 232));
        G_questao_09.add(S_questao_09_sim);
        S_questao_09_sim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_questao_09_simActionPerformed(evt);
            }
        });
        getContentPane().add(S_questao_09_sim);
        S_questao_09_sim.setBounds(580, 280, 25, 30);

        S_questao_10_nao.setBackground(new java.awt.Color(230, 231, 232));
        G_questao_10.add(S_questao_10_nao);
        S_questao_10_nao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_questao_10_naoActionPerformed(evt);
            }
        });
        getContentPane().add(S_questao_10_nao);
        S_questao_10_nao.setBounds(520, 330, 25, 30);

        S_questao_10_sim.setBackground(new java.awt.Color(230, 231, 232));
        G_questao_10.add(S_questao_10_sim);
        S_questao_10_sim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_questao_10_simActionPerformed(evt);
            }
        });
        getContentPane().add(S_questao_10_sim);
        S_questao_10_sim.setBounds(580, 330, 25, 30);

        S_questao_11_nao.setBackground(new java.awt.Color(230, 231, 232));
        G_questao_11.add(S_questao_11_nao);
        S_questao_11_nao.setToolTipText("");
        S_questao_11_nao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_questao_11_naoActionPerformed(evt);
            }
        });
        getContentPane().add(S_questao_11_nao);
        S_questao_11_nao.setBounds(520, 370, 25, 30);

        S_questao_11_sim.setBackground(new java.awt.Color(230, 231, 232));
        G_questao_11.add(S_questao_11_sim);
        S_questao_11_sim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_questao_11_simActionPerformed(evt);
            }
        });
        getContentPane().add(S_questao_11_sim);
        S_questao_11_sim.setBounds(590, 370, 25, 30);

        S_questao_12_nao.setBackground(new java.awt.Color(230, 231, 232));
        G_questao_12.add(S_questao_12_nao);
        S_questao_12_nao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_questao_12_naoActionPerformed(evt);
            }
        });
        getContentPane().add(S_questao_12_nao);
        S_questao_12_nao.setBounds(270, 430, 25, 30);

        S_questao_12_sim.setBackground(new java.awt.Color(230, 231, 232));
        G_questao_12.add(S_questao_12_sim);
        S_questao_12_sim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_questao_12_simActionPerformed(evt);
            }
        });
        getContentPane().add(S_questao_12_sim);
        S_questao_12_sim.setBounds(330, 430, 25, 30);

        S_questao_13_nao.setBackground(new java.awt.Color(230, 231, 232));
        G_questao_13.add(S_questao_13_nao);
        S_questao_13_nao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_questao_13_naoActionPerformed(evt);
            }
        });
        getContentPane().add(S_questao_13_nao);
        S_questao_13_nao.setBounds(270, 470, 25, 30);

        S_questao_13_sim.setBackground(new java.awt.Color(230, 231, 232));
        G_questao_13.add(S_questao_13_sim);
        S_questao_13_sim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_questao_13_simActionPerformed(evt);
            }
        });
        getContentPane().add(S_questao_13_sim);
        S_questao_13_sim.setBounds(330, 470, 25, 30);

        S_questao_14_nao.setBackground(new java.awt.Color(230, 231, 232));
        G_questao_14.add(S_questao_14_nao);
        S_questao_14_nao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_questao_14_naoActionPerformed(evt);
            }
        });
        getContentPane().add(S_questao_14_nao);
        S_questao_14_nao.setBounds(270, 510, 25, 30);

        S_questao_14_sim.setBackground(new java.awt.Color(230, 231, 232));
        G_questao_14.add(S_questao_14_sim);
        S_questao_14_sim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_questao_14_simActionPerformed(evt);
            }
        });
        getContentPane().add(S_questao_14_sim);
        S_questao_14_sim.setBounds(330, 510, 25, 30);

        S_questao_15_nao.setBackground(new java.awt.Color(230, 231, 232));
        G_questao_15.add(S_questao_15_nao);
        S_questao_15_nao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_questao_15_naoActionPerformed(evt);
            }
        });
        getContentPane().add(S_questao_15_nao);
        S_questao_15_nao.setBounds(270, 560, 25, 30);

        S_questao_15_sim.setBackground(new java.awt.Color(230, 231, 232));
        G_questao_15.add(S_questao_15_sim);
        S_questao_15_sim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_questao_15_simActionPerformed(evt);
            }
        });
        getContentPane().add(S_questao_15_sim);
        S_questao_15_sim.setBounds(330, 560, 25, 30);

        S_questao_16_nao.setBackground(new java.awt.Color(230, 231, 232));
        G_questao_16.add(S_questao_16_nao);
        S_questao_16_nao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_questao_16_naoActionPerformed(evt);
            }
        });
        getContentPane().add(S_questao_16_nao);
        S_questao_16_nao.setBounds(90, 660, 25, 30);

        S_questao_16_sim.setBackground(new java.awt.Color(230, 231, 232));
        G_questao_16.add(S_questao_16_sim);
        S_questao_16_sim.setToolTipText("");
        S_questao_16_sim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_questao_16_simActionPerformed(evt);
            }
        });
        getContentPane().add(S_questao_16_sim);
        S_questao_16_sim.setBounds(150, 660, 25, 30);

        B_cadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(B_cadastrar);
        B_cadastrar.setBounds(1080, 680, 100, 40);

        B_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(B_cancelar);
        B_cancelar.setBounds(950, 680, 110, 40);

        L_imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semestral/imagem/area_trabalho/Area Anamnese Light.png"))); // NOI18N
        L_imagem.setPreferredSize(new java.awt.Dimension(1, 1));
        getContentPane().add(L_imagem);
        L_imagem.setBounds(0, 0, 1260, 742);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void R_questao01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_questao01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R_questao01ActionPerformed

    private void R_questao02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_questao02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R_questao02ActionPerformed

    private void R_questao16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_questao16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R_questao16ActionPerformed

    private void R_questao03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_questao03ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R_questao03ActionPerformed

    private void R_questao04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_questao04ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R_questao04ActionPerformed

    private void R_questao05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_questao05ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R_questao05ActionPerformed

    private void R_questao06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_questao06ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R_questao06ActionPerformed

    private void R_questao07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_questao07ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R_questao07ActionPerformed

    private void R_questao08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_questao08ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R_questao08ActionPerformed

    private void R_questao09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_questao09ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R_questao09ActionPerformed

    private void R_questao10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_questao10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R_questao10ActionPerformed

    private void R_questao11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_questao11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R_questao11ActionPerformed

    private void R_questao15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_questao15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R_questao15ActionPerformed

    private void S_questao_01_simActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_questao_01_simActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_questao_01_simActionPerformed

    private void S_questao_16_naoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_questao_16_naoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_questao_16_naoActionPerformed

    private void S_questao_01_naoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_questao_01_naoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_questao_01_naoActionPerformed

    private void S_questao_05_naoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_questao_05_naoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_questao_05_naoActionPerformed

    private void S_questao_05_simActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_questao_05_simActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_questao_05_simActionPerformed

    private void S_questao_06_naoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_questao_06_naoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_questao_06_naoActionPerformed

    private void S_questao_06_simActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_questao_06_simActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_questao_06_simActionPerformed

    private void S_questao_07_naoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_questao_07_naoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_questao_07_naoActionPerformed

    private void S_questao_07_simActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_questao_07_simActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_questao_07_simActionPerformed

    private void S_questao_08_naoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_questao_08_naoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_questao_08_naoActionPerformed

    private void S_questao_08_simActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_questao_08_simActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_questao_08_simActionPerformed

    private void S_questao_09_naoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_questao_09_naoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_questao_09_naoActionPerformed

    private void S_questao_09_simActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_questao_09_simActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_questao_09_simActionPerformed

    private void S_questao_10_naoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_questao_10_naoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_questao_10_naoActionPerformed

    private void S_questao_10_simActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_questao_10_simActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_questao_10_simActionPerformed

    private void S_questao_11_naoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_questao_11_naoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_questao_11_naoActionPerformed

    private void S_questao_11_simActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_questao_11_simActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_questao_11_simActionPerformed

    private void S_questao_12_naoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_questao_12_naoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_questao_12_naoActionPerformed

    private void S_questao_12_simActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_questao_12_simActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_questao_12_simActionPerformed

    private void S_questao_13_naoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_questao_13_naoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_questao_13_naoActionPerformed

    private void S_questao_13_simActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_questao_13_simActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_questao_13_simActionPerformed

    private void S_questao_14_naoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_questao_14_naoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_questao_14_naoActionPerformed

    private void S_questao_14_simActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_questao_14_simActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_questao_14_simActionPerformed

    private void S_questao_15_naoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_questao_15_naoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_questao_15_naoActionPerformed

    private void S_questao_15_simActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_questao_15_simActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_questao_15_simActionPerformed

    private void S_questao_16_simActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_questao_16_simActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_questao_16_simActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel B_cadastrar;
    private javax.swing.JLabel B_cancelar;
    private javax.swing.ButtonGroup G_questao_01;
    private javax.swing.ButtonGroup G_questao_05;
    private javax.swing.ButtonGroup G_questao_06;
    private javax.swing.ButtonGroup G_questao_07;
    private javax.swing.ButtonGroup G_questao_08;
    private javax.swing.ButtonGroup G_questao_09;
    private javax.swing.ButtonGroup G_questao_10;
    private javax.swing.ButtonGroup G_questao_11;
    private javax.swing.ButtonGroup G_questao_12;
    private javax.swing.ButtonGroup G_questao_13;
    private javax.swing.ButtonGroup G_questao_14;
    private javax.swing.ButtonGroup G_questao_15;
    private javax.swing.ButtonGroup G_questao_16;
    private javax.swing.JLabel L_imagem;
    private javax.swing.JTextField R_questao01;
    private javax.swing.JTextField R_questao02;
    private javax.swing.JTextField R_questao03;
    private javax.swing.JTextField R_questao04;
    private javax.swing.JTextField R_questao05;
    private javax.swing.JTextField R_questao06;
    private javax.swing.JTextField R_questao07;
    private javax.swing.JTextField R_questao08;
    private javax.swing.JTextField R_questao09;
    private javax.swing.JTextField R_questao10;
    private javax.swing.JTextField R_questao11;
    private javax.swing.JTextField R_questao15;
    private javax.swing.JTextField R_questao16;
    private javax.swing.JRadioButton S_questao_01_nao;
    private javax.swing.JRadioButton S_questao_01_sim;
    private javax.swing.JRadioButton S_questao_05_nao;
    private javax.swing.JRadioButton S_questao_05_sim;
    private javax.swing.JRadioButton S_questao_06_nao;
    private javax.swing.JRadioButton S_questao_06_sim;
    private javax.swing.JRadioButton S_questao_07_nao;
    private javax.swing.JRadioButton S_questao_07_sim;
    private javax.swing.JRadioButton S_questao_08_nao;
    private javax.swing.JRadioButton S_questao_08_sim;
    private javax.swing.JRadioButton S_questao_09_nao;
    private javax.swing.JRadioButton S_questao_09_sim;
    private javax.swing.JRadioButton S_questao_10_nao;
    private javax.swing.JRadioButton S_questao_10_sim;
    private javax.swing.JRadioButton S_questao_11_nao;
    private javax.swing.JRadioButton S_questao_11_sim;
    private javax.swing.JRadioButton S_questao_12_nao;
    private javax.swing.JRadioButton S_questao_12_sim;
    private javax.swing.JRadioButton S_questao_13_nao;
    private javax.swing.JRadioButton S_questao_13_sim;
    private javax.swing.JRadioButton S_questao_14_nao;
    private javax.swing.JRadioButton S_questao_14_sim;
    private javax.swing.JRadioButton S_questao_15_nao;
    private javax.swing.JRadioButton S_questao_15_sim;
    private javax.swing.JRadioButton S_questao_16_nao;
    private javax.swing.JRadioButton S_questao_16_sim;
    // End of variables declaration//GEN-END:variables
}
