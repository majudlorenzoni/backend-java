public class Main {
  public static void main(String[] args) {
    Cliente cliente1 = new Cliente();
    cliente1.setNome("João da Silva");

    Cliente cliente2 = new Cliente();
    cliente2.setNome("Maria de Souza");
    
    Conta cc1 = new ContaCorrente(cliente1);
    Conta cp1 = new ContaPoupanca(cliente2);

    cc1.depositar(1000);
    cp1.depositar(1000);
    cc1.imprimirExtrato();
    cp1.transferir(400, cc1);

    cc1.imprimirExtrato();
    cp1.imprimirExtrato();
   
  }
}
