package br.com.devsgeeknerd.computadores.classes;

import java.util.Date;

public class ComputadorSimples extends Computador {
  public ComputadorSimples(String nome, double preco, Date dataDeFabricacao) {
    super(nome, preco, dataDeFabricacao);
  }

  public void jogarPaciencia() {
    System.out.println(getNome() + " esta jogando Paciência...");
  }
}
