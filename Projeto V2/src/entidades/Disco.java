/*
 * Programação Orientada a Objetos 2
 * Aluno: Matheus Bazoti Brito Delgado
 * Professor: Adriano Caminha
 * Data: 28/07/2021
*/

package entidades;

import java.text.NumberFormat;

public class Disco extends Obra {
  private String banda;
  private String tipo = "Disco";
  
  /* construtor */
  public Disco(String nome, String banda, int ano, double preco) {
    super(nome, ano, preco);
    this.tipo = "Disco";
    this.banda = banda;
  }
  
  /* sobreposição */
  public Disco(String nome, int ano, double preco) {
    super(nome, ano, preco);
    this.tipo = "Disco";
    this.banda = "Banda desconhecida";
  }
  public Disco()                                   { }
  
  /* toString */
  public String toString() {
    NumberFormat moeda = NumberFormat.getCurrencyInstance();
    moeda.setMaximumFractionDigits(2);
    moeda.setMinimumFractionDigits(2);
    
    return  "Nome: "  + getNome()  + " - " +
            "Banda: " + getBanda() + " - " +
            "Ano: "   + getAno()   + " - " +
            "Preço: " + moeda.format(getPreco()) + "\n";
  }

  /* getters&setters */
  public String getBanda()           {return banda;}
  public void setBanda(String banda) {this.banda = banda;}
  public String getTitulo()          {return tipo;}
}

/* COMENTARIOS
 * 
*/