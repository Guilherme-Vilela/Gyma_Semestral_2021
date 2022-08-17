/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral.view.aluno;

import java.awt.Dimension;
import java.util.Arrays;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import semestral.dao.aluno.aluno_DAO;
import semestral.dao.aluno.contato_emergencia_DAO;
import semestral.dao.aluno.horario_DAO;
import semestral.dao.pessoa.pessoa_DAO;
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
public class tela_cadastro_aluno extends javax.swing.JInternalFrame {
    aluno_DAO aluno_dao = new aluno_DAO();
    navegacao navega = new navegacao();
    pessoa_DAO pessoa_dao = new pessoa_DAO();
    contato_emergencia_DAO contato_dao = new contato_emergencia_DAO();
    horario_DAO horario_dao = new horario_DAO();
    int id_pessoa = 0;
    int id_aluno = 0;
    
    /**
     * Creates new form tela_aluno
     */
   JDesktopPane area_menu;
    JDesktopPane area_trabalho;
    JInternalFrame tela;
    Dimension dimensao ; 
    public tela_cadastro_aluno(Dimension tamanho,JDesktopPane area_menu_,JDesktopPane area_trabalho_, JInternalFrame aba,int aluno_id_recebido) {
        initComponents();
        this.setSize(tamanho);
        area_menu = area_menu_;
        area_trabalho = area_trabalho_;
        tela = aba;
        dimensao = tamanho;
        L_imagem.setSize(tamanho);
//        ImageIcon icon = new ImageIcon("src/semestral/imagem/area_trabalho/Cadastro Aluno Light.png");
//        icon.setImage(icon.getImage().getScaledInstance(
//        L_imagem.getWidth(), L_imagem.getHeight(),1));
//        L_imagem.setIcon(icon);
     
        if (aluno_id_recebido > 0 ){
            id_aluno = aluno_id_recebido;
            inserir_dados();
        }
    }
    
    public pessoa_POJO pegar_dados_pessoa(int id_pessoa_recebido){
        pessoa_POJO pessoa_pojo = new pessoa_POJO();
    if(id_pessoa_recebido == 0){
        
     }else{
         pessoa_pojo.setId_pessoa(id_pessoa_recebido);
     }
       // pegar dados pessoa 
       pessoa_pojo.setNome(C_nome.getText());
       pessoa_pojo.setCPF(C_cpf.getText());
       pessoa_pojo.setTelefone(C_telefone.getText());
       pessoa_pojo.setEmail(C_email.getText());
       pessoa_pojo.setPassword("");
       pessoa_pojo.setEstado(C_estado.getText());
       pessoa_pojo.setCidade(C_cidade.getText());
       pessoa_pojo.setRua(C_rua.getText());
       pessoa_pojo.setBairro(C_bairro.getText());
       pessoa_pojo.setCep(C_cep.getText());
       
       pessoa_pojo.setNascimento(inverter_data(C_data_nascimento.getText()));
       pessoa_pojo.setNumero(Integer.parseInt(C_numero.getText()));
       pessoa_pojo.setStatus_p(1);
       // ajustar set genero
       if(S_homem.isSelected()){
           pessoa_pojo.setGenero("Homem");
       }
       if(S_mulher.isSelected()){
           pessoa_pojo.setGenero("Mulher");
       }
       if(S_outro.isSelected()){
           pessoa_pojo.setGenero("Outro");
       }
       
//       pessoa_pojo.setNome("guilherme");
//       pessoa_pojo.setCPF("10710530943");
//       pessoa_pojo.setTelefone("47999999");
//       pessoa_pojo.setEmail("guilherme@gmail.com");
//       pessoa_pojo.setPassword("");
//       pessoa_pojo.setEstado(("SC"));
//       pessoa_pojo.setCidade("Timbó");
//       pessoa_pojo.setRua("arnold albrecht");
//       pessoa_pojo.setBairro("padre martinho");
//       pessoa_pojo.setCep("89120-000");
//       pessoa_pojo.setNumero(512);
//       pessoa_pojo.setStatus_p(1);
//       // ajustar set genero
//       pessoa_pojo.setGenero("1");
       return pessoa_pojo;
                 
    }
    public String inverter_data(String data){
    String resposta = "";
    if(data.length() == 10 && !data.equals(null) ){
        resposta = data.substring(6);
        resposta = resposta+ data.charAt(5);
        resposta = resposta+ data.charAt(3);
        resposta = resposta+ data.charAt(4);
        resposta = resposta+ data.charAt(2);
        resposta = resposta+ data.charAt(0);
        resposta = resposta+ data.charAt(1);
        
    }else{
        resposta = "quantidade de caracteres invalida";
    }
        System.out.println("a data convertida é "+resposta);
    return resposta;
    }
    
    public String reverter_data(String data){
    String resposta = "";
    if(data.equals(null)){
        data = "";
    }
        System.err.println("data recebida" + data);
    if(data.length() == 10){
        resposta = data.substring(8);
        resposta = resposta+ data.charAt(7);
        resposta = resposta+ data.charAt(5);
        resposta = resposta+ data.charAt(6);
        resposta = resposta+ data.charAt(4);
        resposta = resposta+ data.charAt(0);
        resposta = resposta+ data.charAt(1);
        resposta = resposta+ data.charAt(2);
        resposta = resposta+ data.charAt(3);
        
    }else{
        resposta = "00/00/0000";
    }
        System.out.println("a data convertida é "+resposta);
    return resposta;
    }
    
    public aluno_POJO pegar_dados_aluno(int id_pessoa_recebido){
        aluno_POJO aluno_pojo = new aluno_POJO();
     // pegar dados aluno
     if(id_pessoa_recebido == 0){
        id_pessoa = pessoa_dao.buscar_id_pessoa_max();
     }else{
          id_pessoa = id_pessoa_recebido;
          aluno_pojo.setId_aluno(id_aluno);
     }
        aluno_pojo.setId_pessoa(id_pessoa);
        aluno_pojo.setMatricula(Integer.parseInt(C_matricula.getText()));
        aluno_pojo.setObjetivo(C_objetivo.getText());
        aluno_pojo.setEstado(1);
        return aluno_pojo;
     }
    public contato_emergencia_POJO pegar_dados_contato(int id_emergencia_recebido){
         if(id_aluno == 0){
             id_aluno = aluno_dao.buscar_id_aluno();
         }
          contato_emergencia_POJO contato_pojo = new contato_emergencia_POJO();
         if (id_emergencia_recebido > 0 ){
             contato_pojo.setId_emergencia(id_emergencia_recebido);
         }
       
        contato_pojo.setId_aluno(id_aluno);
        contato_pojo.setNome(C_nome_contato.getText());
        contato_pojo.setTelefone(C_telefone_contato.getText());
        contato_pojo.setEndereco(C_endereco.getText());
        contato_pojo.setStatus(1);  
        return contato_pojo;
     }
    public void cadastrar_horario(int id_aluno_recebido){
         Boolean editar = false;
         try {
        if(id_aluno_recebido == 0){
             id_aluno = aluno_dao.buscar_id_aluno();
         }else{
             id_aluno = id_aluno_recebido;
             editar = true;
         }
        horario_POJO horario_pojo = new horario_POJO();
        horario_pojo.setId_aluno(id_aluno);
         if(S_seg.isSelected()){
        
         horario_pojo.setDia_semana("Segunda");
         horario_pojo.setHorario(S_horario_01.getText());
         horario_pojo.setTurno("Vespertino");
         if (editar == false){
         horario_dao.cadastro_horario_pojo(horario_pojo);
         }else{
           int resultado = horario_dao.verificar_horario_tela_cadastro_aluno(id_aluno, "Segunda");
             if(resultado == 0){
              horario_dao.cadastro_horario_pojo(horario_pojo);   
             }else{
                 horario_pojo.setId_horario(resultado);
                 horario_dao.editar_horario_pojo(horario_pojo);
             }
         }
        }
         if(S_ter.isSelected()){
         horario_pojo.setDia_semana("Terça");
         horario_pojo.setHorario(S_horario_02.getText());
         horario_pojo.setTurno("Vespertino");
        if (editar == false){
         horario_dao.cadastro_horario_pojo(horario_pojo);
         }else{
           int resultado = horario_dao.verificar_horario_tela_cadastro_aluno(id_aluno, "Terça");
             if(resultado == 0){
              horario_dao.cadastro_horario_pojo(horario_pojo);   
             }else{
                 horario_pojo.setId_horario(resultado);
                 horario_dao.editar_horario_pojo(horario_pojo);
             }
         }
        }
        if(S_qua.isSelected()){
        horario_pojo.setDia_semana("Quarta");
        horario_pojo.setHorario(S_horario_03.getText());
        horario_pojo.setTurno("Vespertino");
        if (editar == false){
         horario_dao.cadastro_horario_pojo(horario_pojo);
         }else{
           int resultado = horario_dao.verificar_horario_tela_cadastro_aluno(id_aluno, "Quarta");
             if(resultado == 0){
              horario_dao.cadastro_horario_pojo(horario_pojo);   
             }else{
                 horario_pojo.setId_horario(resultado);
                 horario_dao.editar_horario_pojo(horario_pojo);
             }
         }
     }
        if(S_qui.isSelected()){
         horario_pojo.setDia_semana("Quinta");
         horario_pojo.setHorario(S_horario_04.getText());
         horario_pojo.setTurno("Vespertino");
        if (editar == false){
         horario_dao.cadastro_horario_pojo(horario_pojo);
         }else{
           int resultado = horario_dao.verificar_horario_tela_cadastro_aluno(id_aluno, "Quinta");
             if(resultado == 0){
              horario_dao.cadastro_horario_pojo(horario_pojo);   
             }else{
                 horario_pojo.setId_horario(resultado);
                 horario_dao.editar_horario_pojo(horario_pojo);
             }
         }
        }
          if(S_sex.isSelected()){
         horario_pojo.setDia_semana("Sexta");
         horario_pojo.setHorario(S_horario_05.getText());
         horario_pojo.setTurno("Vespertino");
         if (editar == false){
         horario_dao.cadastro_horario_pojo(horario_pojo);
         }else{
           int resultado = horario_dao.verificar_horario_tela_cadastro_aluno(id_aluno, "Sexta");
             if(resultado == 0){
              horario_dao.cadastro_horario_pojo(horario_pojo);   
             }else{
                 horario_pojo.setId_horario(resultado);
                 horario_dao.editar_horario_pojo(horario_pojo);
             }
         }
        }
           if(S_sab.isSelected()){
         horario_pojo.setDia_semana("Sabado");
         horario_pojo.setHorario(S_horario_06.getText());
         horario_pojo.setTurno("Vespertino");
         if (editar == false){
         horario_dao.cadastro_horario_pojo(horario_pojo);
         }else{
           int resultado = horario_dao.verificar_horario_tela_cadastro_aluno(id_aluno, "Sabado");
             if(resultado == 0){
              horario_dao.cadastro_horario_pojo(horario_pojo);   
             }else{
                 horario_pojo.setId_horario(resultado);
                 horario_dao.editar_horario_pojo(horario_pojo);
             }
         }
        }
             if(S_dom.isSelected()){
         horario_pojo.setDia_semana("Domingo");
         horario_pojo.setHorario(S_horario_07.getText());
         horario_pojo.setTurno("Vespertino");
         if (editar == false){
         horario_dao.cadastro_horario_pojo(horario_pojo);
         }else{
           int resultado = horario_dao.verificar_horario_tela_cadastro_aluno(id_aluno, "Domingo");
             if(resultado == 0){
              horario_dao.cadastro_horario_pojo(horario_pojo);   
             }else{
                 horario_pojo.setId_horario(resultado);
                 horario_dao.editar_horario_pojo(horario_pojo);
             }
         }
     }
             } catch (IllegalArgumentException e) {
             
}
     }
    public void limpar(){
      //limpa dados pessoa 
      C_nome.setText("");
      C_cpf.setText("");
      C_telefone.setText("");
      C_email.setText("");
      //pessoa_pojo.setPassword("");
      C_estado.setText("");
      C_cidade.setText("");
      C_rua.setText("");
      C_bairro.setText("");
      C_cep.setText("");
      C_numero.setText("");
      
      //limpa dados aluno
      C_objetivo.setText("");
      C_matricula.setText("");
      
      //limpa horario
      S_horario_01.setText("");
      S_horario_02.setText("");
      S_horario_03.setText("");
      S_horario_04.setText("");
      S_horario_05.setText("");
      S_horario_06.setText("");
      S_horario_07.setText("");
          
       //contato emergencia
      C_nome_contato.setText("");
      C_telefone_contato.setText("");
      C_endereco.setText("");
    }
    public void inserir_dados(){
        aluno_POJO aluno_pojo = aluno_dao.buscar_dados_aluno_tela_cadastro_aluno(id_aluno);
        contato_emergencia_POJO contato_pojo = contato_dao.buscar_dados_contato_tela_cadastro_aluno(id_aluno);
        List lista = horario_dao.buscar_dados_horario_tela_cadastro_aluno(id_aluno);
        id_pessoa = aluno_pojo.getId_pessoa();
        pessoa_POJO pessoa_pojo = pessoa_dao.buscar_dados_pessoa_tela_cadastro_aluno(id_pessoa);
        //seta dados pessoa
      C_nome.setText(pessoa_pojo.getNome());
      C_cpf.setText(pessoa_pojo.getCPF());
      C_telefone.setText(pessoa_pojo.getTelefone());
      C_email.setText(pessoa_pojo.getEmail());
      //pessoa_pojo.setPassword("");
      C_estado.setText(pessoa_pojo.getEstado());
      C_cidade.setText(pessoa_pojo.getCidade());
      C_rua.setText(pessoa_pojo.getRua());
      C_bairro.setText(pessoa_pojo.getBairro());
      C_cep.setText(pessoa_pojo.getCep());
      C_numero.setText(pessoa_pojo.getNumero()+"");
      C_data_nascimento.setText(reverter_data(pessoa_pojo.getNascimento()));
      switch(pessoa_pojo.getGenero()){
          case"Homem":
              S_homem.setSelected(true);
              break;
          case"Mulher":
              S_mulher.setSelected(true);
              break;
          case"Outro":
              S_outro.setSelected(true);
              break;
      }
      // seta dados cotato emergencai
      C_nome_contato.setText(contato_pojo.getNome());
      C_telefone_contato.setText(contato_pojo.getTelefone());
      C_endereco.setText(contato_pojo.getEndereco());
      
      // seta valores do aluno 
      C_objetivo.setText(aluno_pojo.getObjetivo());
      C_matricula.setText(aluno_pojo.getMatricula()+"");
       for(int i=0; i<lista.size();i++){
           horario_POJO horario_pojo = (horario_POJO)lista.get(i);
           String dia = horario_pojo.getDia_semana();
           
          if(dia.equals("Segunda")){
         S_seg.setSelected(true);
        S_horario_01.setText(horario_pojo.getHorario());
        }
         if(dia.equals("Terça")){
         S_ter.setSelected(true);
        S_horario_02.setText(horario_pojo.getHorario());
        }
        if(dia.equals("Quarta")){
        S_qua.setSelected(true);
        S_horario_03.setText(horario_pojo.getHorario());
     }
        if(dia.equals("Quinta")){
         S_qui.setSelected(true);
        S_horario_04.setText(horario_pojo.getHorario());
        }
          if(dia.equals("Sexta")){
        S_sex.setSelected(true);
        S_horario_05.setText(horario_pojo.getHorario());
        }
           if(dia.equals("Sabado")){
        S_sab.setSelected(true);
        S_horario_06.setText(horario_pojo.getHorario());
        }
             if(dia.equals("Domingo")){
        S_dom.setSelected(true);
        S_horario_07.setText(horario_pojo.getHorario());
     }
       }
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        G_genero = new javax.swing.ButtonGroup();
        C_nome = new javax.swing.JTextField();
        C_cpf = new javax.swing.JFormattedTextField();
        C_idade = new javax.swing.JFormattedTextField();
        C_data_nascimento = new javax.swing.JFormattedTextField();
        C_telefone = new javax.swing.JFormattedTextField();
        C_email = new javax.swing.JTextField();
        C_data_incio = new javax.swing.JFormattedTextField();
        S_horario_01 = new javax.swing.JFormattedTextField();
        S_horario_02 = new javax.swing.JFormattedTextField();
        S_horario_03 = new javax.swing.JFormattedTextField();
        S_horario_04 = new javax.swing.JFormattedTextField();
        S_horario_05 = new javax.swing.JFormattedTextField();
        S_horario_06 = new javax.swing.JFormattedTextField();
        S_horario_07 = new javax.swing.JFormattedTextField();
        C_cidade = new javax.swing.JTextField();
        C_rua = new javax.swing.JTextField();
        C_numero = new javax.swing.JTextField();
        C_bairro = new javax.swing.JTextField();
        C_cep = new javax.swing.JTextField();
        C_estado = new javax.swing.JTextField();
        C_nome_contato = new javax.swing.JTextField();
        C_endereco = new javax.swing.JTextField();
        C_telefone_contato = new javax.swing.JFormattedTextField();
        S_homem = new javax.swing.JRadioButton();
        S_outro = new javax.swing.JRadioButton();
        S_mulher = new javax.swing.JRadioButton();
        S_seg = new javax.swing.JRadioButton();
        S_ter = new javax.swing.JRadioButton();
        S_qua = new javax.swing.JRadioButton();
        S_qui = new javax.swing.JRadioButton();
        S_sex = new javax.swing.JRadioButton();
        S_sab = new javax.swing.JRadioButton();
        S_dom = new javax.swing.JRadioButton();
        C_objetivo = new javax.swing.JTextField();
        C_matricula = new javax.swing.JFormattedTextField();
        L_cadastrar = new javax.swing.JLabel();
        L_cancelar = new javax.swing.JLabel();
        L_imagem = new javax.swing.JLabel();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1368, 720));
        getContentPane().setLayout(null);

        C_nome.setBackground(new java.awt.Color(230, 231, 232));
        C_nome.setBorder(null);
        C_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_nomeActionPerformed(evt);
            }
        });
        getContentPane().add(C_nome);
        C_nome.setBounds(170, 43, 420, 20);

        C_cpf.setBackground(new java.awt.Color(230, 231, 232));
        C_cpf.setBorder(null);
        try {
            C_cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        C_cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_cpfActionPerformed(evt);
            }
        });
        getContentPane().add(C_cpf);
        C_cpf.setBounds(90, 90, 130, 22);

        C_idade.setBackground(new java.awt.Color(230, 231, 232));
        C_idade.setBorder(null);
        C_idade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_idadeActionPerformed(evt);
            }
        });
        getContentPane().add(C_idade);
        C_idade.setBounds(570, 90, 110, 22);

        C_data_nascimento.setBackground(new java.awt.Color(230, 231, 232));
        C_data_nascimento.setBorder(null);
        try {
            C_data_nascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        C_data_nascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_data_nascimentoActionPerformed(evt);
            }
        });
        getContentPane().add(C_data_nascimento);
        C_data_nascimento.setBounds(380, 90, 100, 22);

        C_telefone.setBackground(new java.awt.Color(230, 231, 232));
        C_telefone.setBorder(null);
        try {
            C_telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(C_telefone);
        C_telefone.setBounds(160, 136, 110, 20);

        C_email.setBackground(new java.awt.Color(230, 231, 232));
        C_email.setBorder(null);
        C_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_emailActionPerformed(evt);
            }
        });
        getContentPane().add(C_email);
        C_email.setBounds(370, 136, 190, 20);

        C_data_incio.setBackground(new java.awt.Color(230, 231, 232));
        C_data_incio.setBorder(null);
        try {
            C_data_incio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(C_data_incio);
        C_data_incio.setBounds(810, 180, 100, 28);
        C_data_incio.getAccessibleContext().setAccessibleName("");

        S_horario_01.setBackground(new java.awt.Color(230, 231, 232));
        S_horario_01.setBorder(null);
        try {
            S_horario_01.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        S_horario_01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_horario_01ActionPerformed(evt);
            }
        });
        getContentPane().add(S_horario_01);
        S_horario_01.setBounds(810, 250, 50, 22);

        S_horario_02.setBackground(new java.awt.Color(230, 231, 232));
        S_horario_02.setBorder(null);
        try {
            S_horario_02.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(S_horario_02);
        S_horario_02.setBounds(810, 282, 50, 30);

        S_horario_03.setBackground(new java.awt.Color(230, 231, 232));
        S_horario_03.setBorder(null);
        try {
            S_horario_03.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(S_horario_03);
        S_horario_03.setBounds(810, 320, 50, 22);

        S_horario_04.setBackground(new java.awt.Color(230, 231, 232));
        S_horario_04.setBorder(null);
        try {
            S_horario_04.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(S_horario_04);
        S_horario_04.setBounds(810, 350, 50, 22);

        S_horario_05.setBackground(new java.awt.Color(230, 231, 232));
        S_horario_05.setBorder(null);
        try {
            S_horario_05.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(S_horario_05);
        S_horario_05.setBounds(810, 380, 50, 22);

        S_horario_06.setBackground(new java.awt.Color(230, 231, 232));
        S_horario_06.setBorder(null);
        try {
            S_horario_06.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        S_horario_06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_horario_06ActionPerformed(evt);
            }
        });
        getContentPane().add(S_horario_06);
        S_horario_06.setBounds(810, 412, 50, 30);

        S_horario_07.setBackground(new java.awt.Color(230, 231, 232));
        S_horario_07.setBorder(null);
        try {
            S_horario_07.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(S_horario_07);
        S_horario_07.setBounds(810, 450, 50, 22);

        C_cidade.setBackground(new java.awt.Color(230, 231, 232));
        C_cidade.setBorder(null);
        C_cidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_cidadeActionPerformed(evt);
            }
        });
        getContentPane().add(C_cidade);
        C_cidade.setBounds(116, 215, 140, 20);

        C_rua.setBackground(new java.awt.Color(230, 231, 232));
        C_rua.setBorder(null);
        C_rua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_ruaActionPerformed(evt);
            }
        });
        getContentPane().add(C_rua);
        C_rua.setBounds(90, 255, 190, 20);

        C_numero.setBackground(new java.awt.Color(230, 231, 232));
        C_numero.setBorder(null);
        C_numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_numeroActionPerformed(evt);
            }
        });
        getContentPane().add(C_numero);
        C_numero.setBounds(330, 255, 40, 20);

        C_bairro.setBackground(new java.awt.Color(230, 231, 232));
        C_bairro.setBorder(null);
        C_bairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_bairroActionPerformed(evt);
            }
        });
        getContentPane().add(C_bairro);
        C_bairro.setBounds(100, 300, 180, 20);

        C_cep.setBackground(new java.awt.Color(230, 231, 232));
        C_cep.setBorder(null);
        C_cep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_cepActionPerformed(evt);
            }
        });
        getContentPane().add(C_cep);
        C_cep.setBounds(90, 345, 80, 20);

        C_estado.setBackground(new java.awt.Color(230, 231, 232));
        C_estado.setBorder(null);
        C_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_estadoActionPerformed(evt);
            }
        });
        getContentPane().add(C_estado);
        C_estado.setBounds(110, 390, 60, 20);

        C_nome_contato.setBackground(new java.awt.Color(230, 231, 232));
        C_nome_contato.setBorder(null);
        C_nome_contato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_nome_contatoActionPerformed(evt);
            }
        });
        getContentPane().add(C_nome_contato);
        C_nome_contato.setBounds(100, 560, 320, 25);

        C_endereco.setBackground(new java.awt.Color(230, 231, 232));
        C_endereco.setBorder(null);
        C_endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_enderecoActionPerformed(evt);
            }
        });
        getContentPane().add(C_endereco);
        C_endereco.setBounds(130, 620, 320, 25);

        C_telefone_contato.setBackground(new java.awt.Color(230, 231, 232));
        C_telefone_contato.setBorder(null);
        try {
            C_telefone_contato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        C_telefone_contato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_telefone_contatoActionPerformed(evt);
            }
        });
        getContentPane().add(C_telefone_contato);
        C_telefone_contato.setBounds(100, 590, 100, 25);

        S_homem.setBackground(new java.awt.Color(230, 231, 232));
        G_genero.add(S_homem);
        S_homem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_homemActionPerformed(evt);
            }
        });
        getContentPane().add(S_homem);
        S_homem.setBounds(110, 450, 30, 30);

        S_outro.setBackground(new java.awt.Color(230, 231, 232));
        G_genero.add(S_outro);
        S_outro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_outroActionPerformed(evt);
            }
        });
        getContentPane().add(S_outro);
        S_outro.setBounds(290, 450, 30, 40);

        S_mulher.setBackground(new java.awt.Color(230, 231, 232));
        G_genero.add(S_mulher);
        S_mulher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_mulherActionPerformed(evt);
            }
        });
        getContentPane().add(S_mulher);
        S_mulher.setBounds(205, 450, 30, 30);

        S_seg.setBackground(new java.awt.Color(230, 231, 232));
        S_seg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_segActionPerformed(evt);
            }
        });
        getContentPane().add(S_seg);
        S_seg.setBounds(750, 250, 25, 30);

        S_ter.setBackground(new java.awt.Color(230, 231, 232));
        S_ter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_terActionPerformed(evt);
            }
        });
        getContentPane().add(S_ter);
        S_ter.setBounds(750, 280, 25, 30);

        S_qua.setBackground(new java.awt.Color(230, 231, 232));
        S_qua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_quaActionPerformed(evt);
            }
        });
        getContentPane().add(S_qua);
        S_qua.setBounds(750, 310, 25, 40);

        S_qui.setBackground(new java.awt.Color(230, 231, 232));
        S_qui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_quiActionPerformed(evt);
            }
        });
        getContentPane().add(S_qui);
        S_qui.setBounds(750, 350, 25, 30);

        S_sex.setBackground(new java.awt.Color(230, 231, 232));
        S_sex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_sexActionPerformed(evt);
            }
        });
        getContentPane().add(S_sex);
        S_sex.setBounds(750, 380, 25, 30);

        S_sab.setBackground(new java.awt.Color(230, 231, 232));
        S_sab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_sabActionPerformed(evt);
            }
        });
        getContentPane().add(S_sab);
        S_sab.setBounds(750, 410, 25, 30);

        S_dom.setBackground(new java.awt.Color(230, 231, 232));
        S_dom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_domActionPerformed(evt);
            }
        });
        getContentPane().add(S_dom);
        S_dom.setBounds(750, 440, 25, 30);

        C_objetivo.setBackground(new java.awt.Color(230, 231, 232));
        C_objetivo.setBorder(null);
        C_objetivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_objetivoActionPerformed(evt);
            }
        });
        getContentPane().add(C_objetivo);
        C_objetivo.setBounds(700, 530, 370, 25);

        C_matricula.setBackground(new java.awt.Color(230, 231, 232));
        C_matricula.setBorder(null);
        C_matricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_matriculaActionPerformed(evt);
            }
        });
        getContentPane().add(C_matricula);
        C_matricula.setBounds(800, 49, 115, 20);

        L_cadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        L_cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L_cadastrarMouseClicked(evt);
            }
        });
        getContentPane().add(L_cadastrar);
        L_cadastrar.setBounds(1080, 680, 100, 40);

        L_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        L_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L_cancelarMouseClicked(evt);
            }
        });
        getContentPane().add(L_cancelar);
        L_cancelar.setBounds(950, 680, 110, 40);

        L_imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/semestral/imagem/area_trabalho/Area Cadastro Aluno Light.png"))); // NOI18N
        getContentPane().add(L_imagem);
        L_imagem.setBounds(0, 0, 1206, 742);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void C_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_nomeActionPerformed

    private void C_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_emailActionPerformed

    private void C_cidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_cidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_cidadeActionPerformed

    private void C_ruaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_ruaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_ruaActionPerformed

    private void C_numeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_numeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_numeroActionPerformed

    private void C_bairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_bairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_bairroActionPerformed

    private void C_cepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_cepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_cepActionPerformed

    private void C_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_estadoActionPerformed

    private void C_nome_contatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_nome_contatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_nome_contatoActionPerformed

    private void C_enderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_enderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_enderecoActionPerformed

    private void S_outroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_outroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_outroActionPerformed

    private void S_homemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_homemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_homemActionPerformed

    private void S_mulherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_mulherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_mulherActionPerformed

    private void S_domActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_domActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_domActionPerformed

    private void S_segActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_segActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_segActionPerformed

    private void S_terActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_terActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_terActionPerformed

    private void S_quaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_quaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_quaActionPerformed

    private void S_quiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_quiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_quiActionPerformed

    private void S_sexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_sexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_sexActionPerformed

    private void S_sabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_sabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_sabActionPerformed

    private void C_idadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_idadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_idadeActionPerformed

    private void C_data_nascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_data_nascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_data_nascimentoActionPerformed

    private void C_cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_cpfActionPerformed

    private void C_telefone_contatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_telefone_contatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_telefone_contatoActionPerformed

    private void C_objetivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_objetivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_objetivoActionPerformed

    private void C_matriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_matriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_matriculaActionPerformed

    private void L_cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L_cancelarMouseClicked
    tela_aluno tela_ = new tela_aluno(dimensao, area_menu, area_trabalho,tela);
    tela_aluno_menu menu_= new tela_aluno_menu(area_menu.getSize(), area_menu, area_trabalho, tela_);
    tela_ = new tela_aluno(dimensao, area_menu, area_trabalho,menu_);
    navega.navegar(area_trabalho, area_menu, tela_, menu_, this, tela);
        
    }//GEN-LAST:event_L_cancelarMouseClicked

    private void L_cadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L_cadastrarMouseClicked
        
        if(id_aluno == 0){
        try { 
        pessoa_POJO pessoa_pojo = pegar_dados_pessoa(0);
        pessoa_dao.cadastro_pessoa_pojo(pessoa_pojo);
        aluno_POJO aluno_pojo = pegar_dados_aluno(0);
        aluno_dao.cadastar_aluno_pojo(aluno_pojo);
        cadastrar_horario(0);
        contato_emergencia_POJO contato_pojo = pegar_dados_contato(0);
        contato_dao.cadastro_contato_pojo(contato_pojo);
        JOptionPane.showMessageDialog(null,"cadastrado com sucesso");
         } catch (IllegalArgumentException e) {
     JOptionPane.showMessageDialog(null, "Falha no casdastro do aluno, tente mais tarde" + "  Erro: "+e);
        }
        }
        else{
        try { 
        id_pessoa = aluno_dao.buscar_id_pessoa_id_aluno(id_aluno);
            //editar pessoa
        pessoa_POJO pessoa_pojo = pegar_dados_pessoa(id_pessoa);
        pessoa_dao.editar_pessoa_pojo(pessoa_pojo);
        //editar aluno
        aluno_POJO aluno_pojo = pegar_dados_aluno(id_pessoa);
        aluno_dao.editar_aluno_pojo(aluno_pojo);
        //editar contato
            System.out.println("BUSCAR CODIGO DO CONTATO EMERGENCIA ");
        contato_emergencia_POJO contato_pojo = pegar_dados_contato(contato_dao.buscar_id_emergencia_id_aluno(id_aluno));
        if(contato_dao.buscar_id_emergencia_id_aluno(id_aluno) == 0){
            contato_dao.cadastro_contato_pojo(contato_pojo);
        }else{
          contato_dao.editar_contato_pojo(contato_pojo);  
        }
        
        //editar horario
        cadastrar_horario(id_aluno);
        JOptionPane.showMessageDialog(null, "usuario editado com sucesso");
       } catch (IllegalArgumentException e) { 
     JOptionPane.showMessageDialog(null, "Falha na ediação do aluno, tente mais tarde" + "  Erro: "+e);
        }
    }
// chama proxima tela 
//        tela_cadastro_anamenese tela_ = new tela_cadastro_anamenese(dimensao, area_menu, area_trabalho,tela);
//        tela_cadastro_anamenese_menu menu_= new tela_cadastro_anamenese_menu(area_menu.getSize(), area_menu, area_trabalho, tela_);
//        tela_ = new tela_cadastro_anamenese(dimensao, area_menu, area_trabalho,menu_);
//        navega.navegar(area_trabalho, area_menu, tela_, menu_, this, tela);


    }//GEN-LAST:event_L_cadastrarMouseClicked

    private void S_horario_01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_horario_01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_horario_01ActionPerformed

    private void S_horario_06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_horario_06ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_horario_06ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField C_bairro;
    private javax.swing.JTextField C_cep;
    private javax.swing.JTextField C_cidade;
    private javax.swing.JFormattedTextField C_cpf;
    private javax.swing.JFormattedTextField C_data_incio;
    private javax.swing.JFormattedTextField C_data_nascimento;
    private javax.swing.JTextField C_email;
    private javax.swing.JTextField C_endereco;
    private javax.swing.JTextField C_estado;
    private javax.swing.JFormattedTextField C_idade;
    private javax.swing.JFormattedTextField C_matricula;
    private javax.swing.JTextField C_nome;
    private javax.swing.JTextField C_nome_contato;
    private javax.swing.JTextField C_numero;
    private javax.swing.JTextField C_objetivo;
    private javax.swing.JTextField C_rua;
    private javax.swing.JFormattedTextField C_telefone;
    private javax.swing.JFormattedTextField C_telefone_contato;
    private javax.swing.ButtonGroup G_genero;
    private javax.swing.JLabel L_cadastrar;
    private javax.swing.JLabel L_cancelar;
    private javax.swing.JLabel L_imagem;
    private javax.swing.JRadioButton S_dom;
    private javax.swing.JRadioButton S_homem;
    private javax.swing.JFormattedTextField S_horario_01;
    private javax.swing.JFormattedTextField S_horario_02;
    private javax.swing.JFormattedTextField S_horario_03;
    private javax.swing.JFormattedTextField S_horario_04;
    private javax.swing.JFormattedTextField S_horario_05;
    private javax.swing.JFormattedTextField S_horario_06;
    private javax.swing.JFormattedTextField S_horario_07;
    private javax.swing.JRadioButton S_mulher;
    private javax.swing.JRadioButton S_outro;
    private javax.swing.JRadioButton S_qua;
    private javax.swing.JRadioButton S_qui;
    private javax.swing.JRadioButton S_sab;
    private javax.swing.JRadioButton S_seg;
    private javax.swing.JRadioButton S_sex;
    private javax.swing.JRadioButton S_ter;
    // End of variables declaration//GEN-END:variables
}
