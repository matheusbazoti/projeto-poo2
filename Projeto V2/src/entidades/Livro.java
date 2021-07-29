/*
 * Programação Orientada a Objetos 2
 * Aluno: Matheus Bazoti Brito Delgado
 * Professor: Adriano Caminha
 * Data: 28/07/2021
*/

package entidades;

import java.text.NumberFormat;

public class Livro extends Obra {
  private String autor;
  private String tipo;
  
  /* construtor */
  public Livro(String nome, String autor, int ano, double preco) {
    super(nome, ano, preco);
    this.tipo = "Livro";
    this.autor = autor;
  }
  
  /* sobreposição */
  public Livro(String nome, int ano, double preco) {
    super(nome, ano, preco);
    this.tipo = "Livro";
    this.autor = "Autor desconhecido";
  }
  public Livro() {}
  
  /* toString */
  public String toString() {
    NumberFormat moeda = NumberFormat.getCurrencyInstance();
    moeda.setMaximumFractionDigits(2);
    moeda.setMinimumFractionDigits(2);
    
    return  "Nome: "  + getNome()  + " - " +
            "Autor "  + getAutor() + " - " +
            "Ano: "   + getAno()   + " - " +
            "Preço: " + moeda.format(getPreco()) + "\n";
  }

  /* getters&setters */
  public String getAutor()           {return autor;}
  public String getTipo()            {return tipo;}
  public void setAutor(String autor) {this.autor = autor;}
}

/* COMENTARIOS
 * 
*/