/*
 * Programação Orientada a Objetos 2
 * Aluno: Matheus Bazoti Brito Delgado
 * Professor: Adriano Caminha
 * Data: 28/07/2021
*/

package dados;

import java.io.FileInputStream; //arquivo leitura
import java.io.ObjectInputStream; //leitor

import java.io.FileOutputStream; //arquivo gravação
import java.io.ObjectOutputStream; //gravador

import java.io.IOException; //exceção de entrada e saída
import java.io.EOFException; //exceção fim de arquivo encontrado

import java.util.ArrayList;
import java.util.Iterator; //apontador para varrer o arraylist

import entidades.*;

public class Catalogo {
  /* ARRAYLIST */
  private ArrayList catalogo;
  
  public Catalogo() {
    catalogo = new ArrayList();
  }
  
  public void inserir(Disco d) {catalogo.add(d);}
  public void inserir(Livro l) {catalogo.add(l);}
  
  public String listarTodos() {
    StringBuilder lista = new StringBuilder();
    
    Iterator i = catalogo.iterator();
    while(i.hasNext()) {
      Disco d = (Disco) i.next();
      lista.append(d);
    }
    return lista.toString();
  }
  
  /* ARQUIVO */
  private ObjectOutputStream gravacao;
  private ObjectInputStream leitura;
  private final String dir = "src/dados/";
  
  public ObjectOutputStream abreArquivoGravacao(){
    try {
      setGravacao(new ObjectOutputStream(new FileOutputStream(dir + "catalogo.ser")));
    }
    catch (IOException e){
      System.err.println("\nErro abertura de arquivo:\n" + e);
    }
    return getGravacao();
  }
  
  public void gravarObjetos () {
    try {
      Iterator it = catalogo.iterator();
      while ( it.hasNext() )
        gravacao.writeObject( (Disco)it.next() );
    }
    catch ( IOException e ) {
      System.err.println( "\nErro gravacao do objeto no arquivo:\n" + e);
    }
  }
  
  public void fechaArquivoGravacao() {
    try {
      if (gravacao != null) gravacao.close();
    }
    catch(IOException e) {
      System.out.println("Erro fechar arquivo");
    }
  }
  
  public ObjectInputStream abreArquivoLeitura() {
    try {
      setLeitura(new ObjectInputStream(new FileInputStream(dir + "cardapio.ser")));
    }
    catch (IOException e) {
      System.err.println("\nErro abertura de arquivo:\n" + e);
    }
    return leitura;
  }
  
  public void leRegistros() {
    Disco d;
    try {
      catalogo.clear();
      while(true) {
        d = (Disco) leitura.readObject(); 
        catalogo.add(d);
      }
    }
    catch ( EOFException e ) {
      return;
    }
    catch ( ClassNotFoundException e ) {
      System.err.println( "Não foi possível criar o objeto.");
    }
    catch ( IOException e ) {
      System.err.println("\nErro de leitura do arquivo:\n" + e);
    }
  }
  
  public void fechaArquivoLeitura() {
    try {
      if (leitura != null) leitura.close();
    }
    catch(IOException e) {
      System.out.println("\nErro fechar arquivo:\n" + e);
    }
  }
  
  /* getters&setters */
  public ArrayList getCatalogo() { return catalogo; }
  public void setCatalogo(ArrayList cardapio) {this.catalogo = catalogo;}
  public ObjectOutputStream getGravacao() {return gravacao;}
  public ObjectInputStream getLeitura() {return leitura;}
  public void setGravacao(ObjectOutputStream gravacao) {this.gravacao = gravacao;}
  public void setLeitura(ObjectInputStream leitura) {this.leitura = leitura;}
}

/* COMENTARIOS
 * 
*/