public class Main {

    public static void main(String[] args) {
        Cliente Felipe = new Cliente();
        Felipe.setNome("Felipe Barros de Oliveira");


        Conta cc = new ContaCorrente(Felipe);
        Conta poupanca = new ContaPoupanca(Felipe);
        cc.depositar(100);
        poupanca.depositar(500);
        poupanca.transferir(300,cc);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
