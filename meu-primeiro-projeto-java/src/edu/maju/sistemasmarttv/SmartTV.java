package edu.maju.sistemasmarttv;

public class SmartTV {
    boolean ligada = false;
    int canal = 5;
    int volume = 10;
    
    public void ligar() {
      ligada = true;
      System.out.println("Ligando a TV");
    }
    
    public void desligar() {
      ligada = false;
      System.out.println("Desligando a TV");
    }

    public void volumeMais() {
      volume++;
      System.out.println("Aumentando o volume para: " + volume);
    }
    
    public void volumeMenos() {
      volume--;
      System.out.println("Diminuindo o volume para: " + volume);
    }

    
  public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Mudando para o canal: " + canal);
      }
    
    public void maisCanal() {
      canal++;
      System.out.println("Mudando para o canal: " + canal);
    }

    public void menosCanal() {
      canal--;
      System.out.println("Mudando para o canal: " + canal);
    }
    


}
    