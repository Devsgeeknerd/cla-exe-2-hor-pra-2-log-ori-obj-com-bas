package br.com.devsgeeknerd.computadores.classes;

import java.util.Date;

public class ComputadorGamer extends Computador {
  private int memoriaDedicadaPlacaDeVideo;

  public int getMemoriaDedicadaPlacaDeVideo() {
    return memoriaDedicadaPlacaDeVideo;
  }

  public void setMemoriaDedicadaPlacaDeVideo(int memoriaDedicadaPlacaDeVideo) {
    this.memoriaDedicadaPlacaDeVideo = memoriaDedicadaPlacaDeVideo;
  }

  public ComputadorGamer(String nome, double preco, Date dataDeFabricacao, int memoriaDedicadaPlacaDeVideo) {
    super(nome, preco, dataDeFabricacao);
    this.memoriaDedicadaPlacaDeVideo = memoriaDedicadaPlacaDeVideo;
  }

  public void jogarNeedForSpeed() {
    System.out.println(getNome() + " esta jogando Need For Speed...");
  }
}
