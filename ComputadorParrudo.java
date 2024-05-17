package br.com.devsgeeknerd.computadores.classes;

import java.util.Date;

public class ComputadorParrudo extends Computador {
  private String corGabinete;

  public String getCorGabinete() {
    return corGabinete;
  }

  public void setCorGabinete(String corGabinete) {
    this.corGabinete = corGabinete;
  }

  public ComputadorParrudo(String nome, double preco, Date dataDeFabricacao, String corGabinete) {
    super(nome, preco, dataDeFabricacao);
    this.corGabinete = corGabinete;
  }

  public void jogarCS() {
    System.out.println(getNome() + " esta jogando CS...");
  }
}
