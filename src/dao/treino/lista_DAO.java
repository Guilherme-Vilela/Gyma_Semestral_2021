/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.dao.treino;

import javax.swing.JOptionPane;
import semestral.dao.Metodos_banco;
import semestral.pojo.treinos.exercicio_POJO;
import semestral.pojo.treinos.lista_POJO;

/**
 *
 * @author guilh
 */
public class lista_DAO {
     Metodos_banco metodo_sql = new Metodos_banco();
    String[] colunas = {"id_lista","nome", "velocidade","intervalo","estado","dia"};
    String tabela = "lista";
        public int cadastro_lista_pojo(lista_POJO lista_pojo){
        String[] coluna = {"nome", "velocidade","intervalo","estado","dia"};
        String[] dados = {lista_pojo.getNome(),lista_pojo.getVelocidade(),lista_pojo.getIntervalo(),lista_pojo.getEstado()+"",lista_pojo.getDia()};  
        int op = metodo_sql.Cadastrar_banco(tabela,coluna,dados);
     return op;
    }
     public String[][] buscar_lista_nome(String lista_nome){
        String[] coluna = colunas; //{colunas[0],colunas[1],colunas[2],colunas[3],colunas[4],colunas[5],colunas[6],colunas[7],colunas[8],colunas[9],colunas[10],colunas[11],colunas[12],colunas[13]};   
        String condicao = "nome LIKE '%"+lista_nome+"%'"+"AND estado = 1";
        String[][] lista = metodo_sql.buscar_banco(coluna, tabela, condicao);
    return lista;
}
     public int deletar_lista_id_lista(int id_lista){
    String condicao = "WHERE id_lista = "+ id_lista;
    int op = metodo_sql.deletar_banco(tabela, condicao); 
    return op;
}
     public int editar_lista_pojo(lista_POJO lista_pojo) {
        int op = 0;
       String[] coluna = {"nome", "velocidade","intervalo","estado","dia"};
       String[] info = {lista_pojo.getNome(),lista_pojo.getVelocidade(),lista_pojo.getIntervalo(),lista_pojo.getEstado()+"",lista_pojo.getDia()};
       String condicao = "WHERE  "+colunas[0]+"="+lista_pojo.getId_lista()+'"';
    
        try {
           op = metodo_sql.atualizar_banco(tabela,coluna,info,condicao);
        } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "O campo "+ e.getMessage() + " é obrigatorio");
        }
        return op;
    } 
}
