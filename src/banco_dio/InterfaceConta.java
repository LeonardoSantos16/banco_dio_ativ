package banco_dio;

public interface InterfaceConta {
    void sacar(double valor);

    void depositar(double valor);

    void imprimirExtrato();

    void transferir(double valor, InterfaceConta contaDestino);
}
