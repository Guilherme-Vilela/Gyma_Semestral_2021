/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author guilh
 */
public class Metodos_banco {
    public static semestral.dao.ConPooling cn = semestral.dao.ConPooling.getInstance();
    
    
public int Cadastrar_banco(String tabela,String[] colunas,String[] info){
          //String[] dados = {"nome","email","telefone",T_nome.getText(),T_email.getText(),T_telefone.getText()};
       int op =1;
       int tamanho = info.length;
       int tamanho_col = colunas.length;
       int metade = tamanho/2;
       String coluna = "(";
       String values = "(";
       System.out.println("tamanho" + tamanho);
       Connection con = cn.getConnection();
    //Função lendaria monta SQL;
       for(int i=0;i<info.length;i++) {
           System.out.println(info[i]);
       //valor é menor que a metade da quantidade de itens?
            if(i == 0){ // é o primeiro item do array?
                coluna = coluna+colunas[i]; // monta a string
                values = values+"'"+info[i]+"' ";
            }else{
                 if(i == (tamanho-1)){ // 
                 coluna = coluna+", "+colunas[i]+") ";          
                 values = values+", "+"'"+info[i]+"'"+") ";
        }else{
                  coluna = coluna+", "+colunas[i];  
                  values = values+", "+"'"+info[i]+"'";
             }
             }
       }
       
    String sql = "INSERT INTO "+tabela+" "+coluna+" VALUES "+values+" ;";
    System.out.println(sql);
        try {
            PreparedStatement p = con.prepareStatement(sql);
            op=p.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro 01 no cadastro na tabela "+ tabela + "  SQL error"+e);
        }
        cn.retConnection(con);
        return op;
    
}
      
      
      
 public String[][] buscar_banco(String[] coluna,String tabela, String condicao){
       int tamanho = coluna.length;
       String colunas = " ";
    //Função lendaria monta SQL;
       for(int i=0;i<coluna.length;i++) {
        if(i == tamanho -1){ // é o primeiro item do array?
                colunas = colunas+coluna[i]+ " "; // monta a string
            }else{
          colunas = colunas+coluna[i]+", ";
        }
       }
         Connection con = cn.getConnection();
    String sql = "SELECT"+colunas+"FROM "+tabela+"  "+condicao+";";
    System.out.println(sql);
     try {
            PreparedStatement p = con.prepareStatement(sql);
            ResultSet rs =p.executeQuery();
             int multi = 0;
             int size =0;
             Boolean array_criado = false;
              if(!array_criado){
                if (rs != null) {
  
                    rs.last();    // moves cursor to the last row
                    size = rs.getRow(); // get row id 
                    rs.first();

 }
 }
 String[][] resposta = new String [size][tamanho];
        if (size == 1){
  for(int i=0;i<tamanho;i++) {
  resposta[multi][i]= rs.getString(coluna[i]);
//  if(resposta[multi][i].equals(null) ||resposta[multi][i].equals("") ){
      
//      resposta[multi][i]= ""+(rs.getInt(coluna[i]));
//  } 
             }
   
             }else if(size == 0){
                  String[][] erro = new String [1][tamanho];
         for(int i=0;i<tamanho;i++) { 
             erro[0][i] = "";
           
         }
             System.out.println("consulta sem resultado");
         System.out.println(Arrays.deepToString(erro));
            return erro;
            } else {
            do{
             for(int i=0;i<tamanho;i++) {
                resposta[multi][i]= rs.getString(coluna[i]);
             }            
            multi++;
            array_criado = true;
            
        }while(rs.next());
            }
         System.out.println("resposta do banco");
         System.out.println(Arrays.deepToString(resposta));
         cn.retConnection(con);
        return resposta;
       
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro 01 - na busca"+ " "+tabela+ " "+ e);
        }
         cn.retConnection(con);
         String[][] caso = new String [0][0];
         return caso;
    }
    

public int deletar_banco(String tabela,String condicao){
          int op = 0;
         Connection con = cn.getConnection();
         String sql = "DELETE from"+tabela+"  "+condicao+";";
        try {
            PreparedStatement p = con.prepareStatement(sql);
             op=p.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na exclusao do dado na tabela"+ tabela + e);
        }
        cn.retConnection(con);
        return op;
    }
public int atualizar_banco(String tabela,String[] colunas,String[] info,String condicao){
       int tamanho = info.length;
       int tamanho_col = colunas.length;
       
       String update = "";
       System.out.println("tamanho" + tamanho);
    //Função lendaria monta SQL;
          int op = 0;
           for(int i=0;i<info.length;i++) {
               System.out.println(colunas[i]);
           System.out.println(info[i]);
 
            if(i == 0){ // é o primeiro item do array?
                update = " "+colunas[i]+ " = "+ '"'+info[i]+'"';
                if (tamanho > 1){
                    update = update + ", ";
                }
              
            }else{
                 if(i == (tamanho-1)){ // é o ultimo item antes da metade?
                 update = update +colunas[i]+ " = "+ '"'+info[i]+'"'+ " ";          
                
        }else{
                update = update + colunas[i]+ " = "+ '"'+info[i]+'"'+", ";
             }
             }
       }
          
        String sql = "UPDATE "+ tabela+" SET "+ update + " "+condicao+" ;";
        System.out.println(sql);
           Connection con = cn.getConnection();
         
        try {
            PreparedStatement p = con.prepareStatement(sql);
             op=p.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na alteração do dado na tabela"+ tabela + e);
        }
        cn.retConnection(con);
        return op;
    }
   
}