package banco_dio;

public class Main {

    public static void main(String[] args) {
        Cliente vasco = new Cliente();
        vasco.setNome("vasco");
        Conta corrente = new ContaCorrente(vasco);
        Conta poupanca = new ContaPoupanca(vasco);

        corrente.depositar(50);
        corrente.transferir(100, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
