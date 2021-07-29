/*
 * Programação Orientada a Objetos 2
 * Aluno: Matheus Bazoti Brito Delgado
 * Professor: Adriano Caminha
 * Data: 28/07/2021
*/

package entidades;

import java.text.NumberFormat;

public abstract class Obra {
  private String nome;
  private int ano;
  private double preco;
  
  /* construtor */
  public Obra(String nome, int ano, double preco) {
    this.nome = nome;
    this.ano = ano;
    this.preco = preco;
  }
  
  /* sobreposições */
  public Obra(String nome, int ano)      {
    this(nome, ano, 0.0);
  }
  public Obra(String nome, double preco) {
    this(nome, 0, preco);
  }
  public Obra(String nome)               {
    this(nome, 0, 0.0);
  }
  public Obra() { }
  
  /* toString */
  public String toString() {
    NumberFormat ano = NumberFormat.getCurrencyInstance();
    ano.setMaximumIntegerDigits(4);
    ano.setMinimumIntegerDigits(4);
    NumberFormat moeda = NumberFormat.getCurrencyInstance();
    moeda.setMaximumFractionDigits(2);
    moeda.setMinimumFractionDigits(2);
    
    return  "Nome: " + getNome() + " - " +
            "Ano: " + getAno() + " - " +
            "Preço: " + moeda.format(getPreco()) + "\n";
  }

  /* getters&setters */
  public String getNome()             {return nome;}
  public int getAno()                 {return ano;}
  public double getPreco()            {return preco;}
  public void setNome(String nome)    {this.nome = nome;}
  public void setAno(int ano)         {this.ano = ano;}
  public void setPreco(double preco)  {this.preco = preco;}
}

/* COMENTARIOS
 * 
*/