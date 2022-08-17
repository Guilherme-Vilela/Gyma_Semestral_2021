/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.dao.aluno;

import javax.swing.JOptionPane;
import semestral.dao.Metodos_banco;
import semestral.pojo.aluno.anamenese_POJO;
import semestral.pojo.aluno.contato_emergencia_POJO;
import semestral.pojo.pessoas.pessoa_POJO;

/**
 *
 * @author guilh
 */
public class contato_emergencia_DAO {
      Metodos_banco metodo_sql = new Metodos_banco();
    String[] colunas = {"id_emergencia","id_aluno","nome","telefone","endereco","status_e"};
    String tabela = "contato_emergencia";
    
       public int cadastro_contato_pojo(contato_emergencia_POJO contato_pojo){
    String[] coluna = {"id_aluno","nome","telefone","endereco","status_e"};
    String[] dados = {contato_pojo.getId_aluno()+"",contato_pojo.getNome(),contato_pojo.getTelefone(),contato_pojo.getEndereco(),contato_pojo.getStatus()+""};
    int op = metodo_sql.Cadastrar_banco(tabela,coluna,dados);
    return op;
}
         public String[][] buscar_contato_id_aluno(int id_aluno){
        String[] coluna = colunas;//{colunas[0],colunas[1],colunas[2],colunas[3],colunas[4],colunas[5],colunas[6],colunas[7],colunas[8],colunas[9]};
        String condicao = "id_aluno = '"+id_aluno+"'"+"AND estado = 1";
        String[][] lista = metodo_sql.buscar_banco(coluna, tabela, condicao);
    return lista;
} 
    public int deletar_contato_id_contato(int id_contato){
    String condicao = "WHERE id_contato = "+ id_contato;
    int op = metodo_sql.deletar_banco(tabela, condicao);
    return op;
}
     public int editar_contato_pojo(contato_emergencia_POJO contato_pojo) {
        int op = 0;
       String[] coluna = {"nome","telefone","endereco","status_e"};
       String[] info = {contato_pojo.getNome(),contato_pojo.getTelefone(),contato_pojo.getEndereco(), contato_pojo.getStatus()+""};
       String condicao = "WHERE "+colunas[0]+"="+contato_pojo.getId_emergencia();
        try {
           op = metodo_sql.atualizar_banco(tabela,coluna,info,condicao);
        } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "O campo "+ e.getMessage() + " é obrigatorio");
        }
        return op;
    } 
       public contato_emergencia_POJO buscar_dados_contato_tela_cadastro_aluno(int id_aluno){
        String[] coluna = colunas; //{colunas[0],colunas[1],colunas[2],colunas[3],colunas[4],colunas[5],colunas[6],colunas[7],colunas[8],colunas[9],colunas[10],colunas[11],colunas[12],colunas[13]};   
        String condicao = "WHERE id_aluno = " + id_aluno;
        String[][] lista = metodo_sql.buscar_banco(coluna, tabela, condicao);
        contato_emergencia_POJO contato_pojo = new contato_emergencia_POJO();
        if (!lista[0][0].equals("")){
       contato_pojo.setId_emergencia(Integer.parseInt(lista[0][0]+""));
        contato_pojo.setId_aluno(Integer.parseInt(lista[0][1]+""));
        contato_pojo.setNome(lista[0][2]);
        contato_pojo.setTelefone(lista[0][3]);
        contato_pojo.setEndereco(lista[0][4]);
        contato_pojo.setStatus(Integer.parseInt(lista[0][5]+"")); 
        }else{
            JOptionPane.showMessageDialog(null, "nenhum dado  de contato de emergencia encontrado referente ao aluno com ID "+ id_aluno);
        }
    return contato_pojo;
}
        public int buscar_id_emergencia_id_aluno(int id_aluno){
        int id_emergencia = -1;
        String[] coluna = {"id_emergencia"}; //{colunas[0],colunas[1],colunas[2],colunas[3],colunas[4],colunas[5],colunas[6],colunas[7],colunas[8],colunas[9],colunas[10],colunas[11],colunas[12],colunas[13]};   
        String condicao = "WHERE id_aluno = " + id_aluno;
        String[][] lista = metodo_sql.buscar_banco(coluna, tabela, condicao);
        id_emergencia = Integer.parseInt(lista[0][0]); 
    return id_emergencia;
        }
}
 