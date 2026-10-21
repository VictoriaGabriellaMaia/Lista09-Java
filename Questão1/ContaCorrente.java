package banco;

public class ContaCorrente {
    private int numero, agencia;
    private double saldo;

   
    public ContaCorrente(int numero, int agencia) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = 0;
    }

  
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
        } else {
            System.out.println("Erro: saldo insuficiente.");
        }
    }


    public void depositar(double valor) {
        saldo = saldo + valor;
    }


    public double consultarSaldo() {
        return saldo;
    }

    public void exibe() {
        System.out.printf("Agência:", agencia);
        System.out.printf("Conta:", numero);
        System.out.printf("Saldo:", saldo);
    }
}
