package br.com.devsgeeknerd.computadores.classes;

import java.util.Date;

public abstract class Computador {
  private String nome;
  private double preco;
  private Date dataDeFabricacao;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public Date getDataDeFabricacao() {
    return dataDeFabricacao;
  }

  public void setDataDeFabicacao(Date dataDeFabricacao) {
    this.dataDeFabricacao = dataDeFabricacao;
  }

  public Computador(String nome, double preco, Date dataDeFabricacao) {
    this.nome = nome;
    this.preco = preco;
    this.dataDeFabricacao = dataDeFabricacao;
  }

  public void ligar() {
    System.out.println(nome + " esta ligando...");
  }

  public void desligar() {
    System.out.println(nome + " esta desligando...");
  }

  public void acessarInternet() {
    System.out.println(nome + "esta acessando a internet...");
  }
}
