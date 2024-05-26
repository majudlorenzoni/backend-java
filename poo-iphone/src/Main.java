public class Main {
  public static void main(String[] args) {
      Iphone iphone = new Iphone();
      
      // Testando ReprodutorMusical
      iphone.tocar();
      iphone.pausar();
      iphone.selecionarMusica("Minha Música Favorita");
      
      // Testando AparelhoTelefonico
      iphone.ligar("123456789");
      iphone.atender();
      iphone.iniciarCorreioVoz();
      
      // Testando NavegadorInternet
      iphone.exibirPagina("https://www.exemplo.com");
      iphone.adicionarNovaAba();
      iphone.atualizarPagina();
  }
}
