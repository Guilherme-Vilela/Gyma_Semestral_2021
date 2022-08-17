/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.view;

import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author guilh
 */
public class navegacao {
    JDesktopPane area_menu;
    JDesktopPane area_trabalho;
    JInternalFrame tela_trabalho;
    JInternalFrame tela_menu;
    Dimension dimensao ; 
    public void navegar(JDesktopPane area_trabalho_,JDesktopPane area_menu_, JInternalFrame aba_trabalho, JInternalFrame aba_menu,JInternalFrame aba_trabalho_fechar, JInternalFrame aba_menu_fechar){
        fechar_area(aba_trabalho_fechar, aba_menu_fechar,area_menu_,area_trabalho_);
        tela_menu = aba_menu;
        tela_trabalho = aba_trabalho;
        area_trabalho = area_trabalho_;
        area_menu = area_menu_;
        ((BasicInternalFrameUI)tela_trabalho.getUI()).setNorthPane(null);
        ((BasicInternalFrameUI)tela_menu.getUI()).setNorthPane(null);
        area_trabalho.add(tela_trabalho);
        area_menu.add(tela_menu);
        tela_trabalho.setVisible(true);
        tela_menu.setVisible(true);
        area_trabalho.setVisible(true);
        area_menu.setVisible(true);
        
    }
    public void fechar_area(JInternalFrame aba_trabalho_fechar, JInternalFrame aba_menu_fechar, JDesktopPane area_menu_fechar, JDesktopPane area_trabalho_fechar){
    area_menu_fechar.removeAll();
    area_trabalho_fechar.removeAll();
    aba_trabalho_fechar.dispose();
    aba_trabalho_fechar.setVisible(false);
    aba_menu_fechar.setVisible(false);
    aba_menu_fechar.dispose();
}
    
}
