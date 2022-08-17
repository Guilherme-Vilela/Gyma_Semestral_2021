/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.dao.pessoa;

import java.util.Arrays;
import javax.swing.JOptionPane;
import semestral.dao.Metodos_banco;
import semestral.pojo.pessoas.colaborador_POJO;
import semestral.pojo.pessoas.pessoa_POJO;

/**
 *
 * @author guilh
 */
public class pessoa_DAO {
    Metodos_banco metodo_sql = new Metodos_banco();
    String[] colunas = {"id_pessoa","nome","CPF","telefone","email","user_password","estado","cidade","rua","bairro","cep","numero","status_p","genero","nascimento"};
    String tabela = "pessoa";
    
     public int cadastro_pessoa_pojo(pessoa_POJO pessoa_pojo){
   String[] coluna = {"nome","CPF","telefone","email","user_password","estado","cidade","rua","bairro","cep","numero","status_p","genero","nascimento"};
   String[] dados = {pessoa_pojo.getNome(),pessoa_pojo.getCPF(),pessoa_pojo.getTelefone(),pessoa_pojo.getEmail(),pessoa_pojo.getPassword(),pessoa_pojo.getEstado(),pessoa_pojo.getCidade(),pessoa_pojo.getRua(),pessoa_pojo.getBairro(),pessoa_pojo.getCep(),pessoa_pojo.getNumero()+"",pessoa_pojo.getStatus_p()+"",pessoa_pojo.getGenero(),pessoa_pojo.getNascimento()};
    int op = metodo_sql.Cadastrar_banco(tabela,coluna,dados);
     return op;
    }
     public String[][] buscar_pessoa_nome(String nome){
        String[] coluna = colunas; //{colunas[0],colunas[1],colunas[2],colunas[3],colunas[4],colunas[5],colunas[6],colunas[7],colunas[8],colunas[9],colunas[10],colunas[11],colunas[12],colunas[13]};   
        String condicao = "WHERE nome LIKE '%"+nome+"%'"+"";
        String[][] teste = metodo_sql.buscar_banco(coluna, tabela, condicao);
        System.out.println("chegou ate aqui as infomraçoes " + Arrays.deepToString(teste));
        
    return teste;
}
     public int deletar_pessoa_id_pessoa(int id_pessoa){
    String condicao = "WHERE id_pessoa = "+ id_pessoa;
    int op = metodo_sql.deletar_banco(tabela, condicao); 
    return op;
} 
      public int editar_pessoa_pojo(pessoa_POJO pessoa_pojo) {
        int op = 0;
       String[] coluna = {"nome","CPF","telefone","email","user_password","estado","cidade","rua","bairro","cep","numero","status_p","genero","nascimento"};
       String[] info = {pessoa_pojo.getNome(),pessoa_pojo.getCPF(),pessoa_pojo.getTelefone(),pessoa_pojo.getEmail(),pessoa_pojo.getPassword(),pessoa_pojo.getEstado(),pessoa_pojo.getCidade(),pessoa_pojo.getRua(),pessoa_pojo.getBairro(),pessoa_pojo.getCep(),pessoa_pojo.getNumero()+"",pessoa_pojo.getStatus_p()+"",pessoa_pojo.getGenero(),pessoa_pojo.getNascimento()};
       String condicao = "WHERE  "+colunas[0]+"="+pessoa_pojo.getId_pessoa();  
        try {
           op = metodo_sql.atualizar_banco(tabela,coluna,info,condicao);
        } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "O campo "+ e.getMessage() + " é obrigatorio");
        }
        return op;
    } 
        public int buscar_id_pessoa_max(){
        int id_pessoa = -1;
        String[] coluna = {"max(id_pessoa)"}; //{colunas[0],colunas[1],colunas[2],colunas[3],colunas[4],colunas[5],colunas[6],colunas[7],colunas[8],colunas[9],colunas[10],colunas[11],colunas[12],colunas[13]};   
        String condicao = "";
        String[][] lista = metodo_sql.buscar_banco(coluna, tabela, condicao);
        id_pessoa = Integer.parseInt(lista[0][0]); 
    return id_pessoa;
}
   
    public pessoa_POJO buscar_dados_pessoa_tela_cadastro_aluno(int id_pessoa){
        
        String[] coluna = colunas; //{colunas[0],colunas[1],colunas[2],colunas[3],colunas[4],colunas[5],colunas[6],colunas[7],colunas[8],colunas[9],colunas[10],colunas[11],colunas[12],colunas[13]};   
        String condicao = "WHERE id_pessoa = " + id_pessoa;
        String[][] lista = metodo_sql.buscar_banco(coluna, tabela, condicao);
        pessoa_POJO pessoa_pojo = new pessoa_POJO();
         if (!lista[0][0].equals("")){
        pessoa_pojo.setNome(lista[0][1]);
        pessoa_pojo.setCPF(lista[0][2]);
        pessoa_pojo.setTelefone(lista[0][3]);
        pessoa_pojo.setEmail(lista[0][4]);
        pessoa_pojo.setPassword("");
        pessoa_pojo.setEstado((lista[0][6]));
        pessoa_pojo.setCidade(lista[0][7]);
        pessoa_pojo.setRua(lista[0][8]);
        pessoa_pojo.setBairro(lista[0][9]);
        pessoa_pojo.setCep(lista[0][10]);
        pessoa_pojo.setNumero(Integer.parseInt(lista[0][11]));
        pessoa_pojo.setStatus_p(1);
       // ajustar set genero
       pessoa_pojo.setGenero(lista[0][13]);
       pessoa_pojo.setNascimento(lista[0][14]);
        }else{
            JOptionPane.showMessageDialog(null, "nenhum dado da pessoa encontrado. id pessoa "+ id_pessoa);
        }
    return pessoa_pojo;
}
}
