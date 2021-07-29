package loja;

import entidades.*;
import dados.Catalogo;
import javax.swing.JOptionPane;

public class Janela extends javax.swing.JFrame {
  public Janela() {
    initComponents();
  }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
  private void initComponents() {

    painel1 = new javax.swing.JPanel();
    Banda = new javax.swing.JLabel();
    tfNome = new javax.swing.JTextField();
    Ano = new javax.swing.JLabel();
    tfAno = new javax.swing.JTextField();
    btInserir = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    atLista = new javax.swing.JTextArea();
    btListarTodos = new javax.swing.JButton();
    jTextField1 = new javax.swing.JTextField();
    Nome = new javax.swing.JLabel();
    Preco = new javax.swing.JLabel();
    tfBanda = new javax.swing.JTextField();
    tfPreco = new javax.swing.JTextField();
    btGravar = new javax.swing.JButton();
    btLer = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    painel1.setBackground(new java.awt.Color(255, 204, 204));

    Banda.setForeground(new java.awt.Color(0, 0, 0));
    Banda.setText("Banda:");

    Ano.setForeground(new java.awt.Color(0, 0, 0));
    Ano.setText("Ano:");

    btInserir.setText("Inserir");
    btInserir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btInserirActionPerformed(evt);
      }
    });

    atLista.setColumns(20);
    atLista.setRows(5);
    jScrollPane1.setViewportView(atLista);

    btListarTodos.setText("Listar Todos");
    btListarTodos.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btListarTodosActionPerformed(evt);
      }
    });

    jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    jTextField1.setText("Cadastro de Discos");

    Nome.setForeground(new java.awt.Color(0, 0, 0));
    Nome.setText("Nome:");

    Preco.setForeground(new java.awt.Color(0, 0, 0));
    Preco.setText("Preço:");

    javax.swing.GroupLayout painel1Layout = new javax.swing.GroupLayout(painel1);
    painel1.setLayout(painel1Layout);
    painel1Layout.setHorizontalGroup(
      painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(painel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jTextField1)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel1Layout.createSequentialGroup()
            .addComponent(jScrollPane1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(btInserir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(btListarTodos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
          .addGroup(painel1Layout.createSequentialGroup()
            .addComponent(Nome)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(tfNome))
          .addGroup(painel1Layout.createSequentialGroup()
            .addComponent(Banda)
            .addGap(3, 3, 3)
            .addComponent(tfBanda, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(Ano)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(tfAno, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(Preco)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(tfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE)))
        .addContainerGap())
    );
    painel1Layout.setVerticalGroup(
      painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(painel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(Nome)
          .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(Banda)
          .addComponent(tfBanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(Ano)
          .addComponent(tfAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(Preco)
          .addComponent(tfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(painel1Layout.createSequentialGroup()
            .addComponent(btInserir)
            .addGap(18, 18, 18)
            .addComponent(btListarTodos)
            .addGap(0, 0, Short.MAX_VALUE))
          .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
        .addContainerGap())
    );

    btGravar.setText("Gravar no Arquivo");
    btGravar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btGravarActionPerformed(evt);
      }
    });

    btLer.setText("Ler do Arquivo");
    btLer.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btLerActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(painel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(layout.createSequentialGroup()
            .addComponent(btGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(89, 89, 89)
            .addComponent(btLer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(painel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btGravar)
          .addComponent(btLer))
        .addContainerGap())
    );

    pack();
  }// </editor-fold>                        

  private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {                                          
    String t = tfTipo.getText();
    String n = tfNome.getText();
    String b = tfBanda.getText();
    String au = tfAutor.getText();
    String a = tfAno.getText();
    String p = tfPreco.getText();
        
    int ano = Integer.parseInt(a);
    double preco = Double.parseDouble(p);
        
    if(t == "L" )
      Livro o = new Livro(n, au, ano, preco);
    else
      Disco o = new Disco(n, b, ano, preco);
      
    card.inserir(o);
    
    tfTipo.getText("");
    tfNome.setText("");
    tfAutor.setText("");
    tfBanda.setText("");
    tfAno.setText("");
    tfPreco.setText("");
    
    atLista.setText(o.getTipo() + " inserido: \n" + o);
  }                                         

    private void btListarTodosActionPerformed(java.awt.event.ActionEvent evt) {                                              
        //mostrar objetos na area de texto
        atLista.setText( card.listarTodos() );
    }                                             

    private void btGravarActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //abrir arq p gravacao
        card.abreArquivoGravacao();

        //varrer obj arraylist gravando no arq
        card.gravarObjetos();

        //fechar arq gravacao
        card.fechaArquivoGravacao();

        JOptionPane.showMessageDialog(rootPane, "Gravados com sucesso!");
    }                                        

    private void btLerActionPerformed(java.awt.event.ActionEvent evt) {                                      
        //abrir arq p leitura
        card.abreArquivoLeitura();

        //ler objetos e preencher arraylist
        card.leRegistros();

        //fechar arq leitura
        card.fechaArquivoLeitura();

        JOptionPane.showMessageDialog(rootPane, "Lidos com sucesso!");
    }                                     

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela().setVisible(true);
            }
        });
    }
    
    Catalogo card = new Catalogo(); //obj que contem o ArrayList
    
  // Variables declaration - do not modify                     
  private javax.swing.JLabel Ano;
  private javax.swing.JLabel Banda;
  private javax.swing.JLabel Nome;
  private javax.swing.JLabel Preco;
  private javax.swing.JTextArea atLista;
  private javax.swing.JButton btGravar;
  private javax.swing.JButton btInserir;
  private javax.swing.JButton btLer;
  private javax.swing.JButton btListarTodos;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTextField jTextField1;
  private javax.swing.JPanel painel1;
  private javax.swing.JTextField tfAno;
  private javax.swing.JTextField tfBanda;
  private javax.swing.JTextField tfNome;
  private javax.swing.JTextField tfPreco;
  // End of variables declaration                   
}
