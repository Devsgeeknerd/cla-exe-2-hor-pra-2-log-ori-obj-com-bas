package br.com.devsgeeknerd.computadores.app;

import java.util.Date;

import br.com.devsgeeknerd.computadores.classes.Computador;
import br.com.devsgeeknerd.computadores.classes.ComputadorSimples;
import br.com.devsgeeknerd.computadores.classes.ComputadorParrudo;
import br.com.devsgeeknerd.computadores.classes.ComputadorGamer;

public class Programa {
  public static void main(String[] args) {
    ComputadorSimples computadorSimples = new ComputadorSimples("Computador Home", 1500.00, new Date());
    ComputadorParrudo computadorParrudo = new ComputadorParrudo("Computador Profissional", 2800.00, new Date(),
        "Branco");
    ComputadorGamer computadorGamer = new ComputadorGamer("Computador Gamer", 4200.00, new Date(), 12);

    computadorSimples.ligar();
    computadorSimples.acessarInternet();
    computadorSimples.jogarPaciencia();
    computadorSimples.desligar();

    computadorParrudo.ligar();
    computadorParrudo.acessarInternet();
    computadorParrudo.jogarCS();
    computadorParrudo.desligar();

    computadorGamer.ligar();
    computadorGamer.acessarInternet();
    computadorGamer.jogarNeedForSpeed();
    computadorGamer.desligar();
  }
}
