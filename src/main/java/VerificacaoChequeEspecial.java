import java.util.Scanner;

public class VerificacaoChequeEspecial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do saldo: ");
        double saldo = scanner.nextDouble();
        System.out.println("Digite o valor do saque: ");
        double saque = scanner.nextDouble();

        double limiteChequeEspecial = 500;

        limiteChequeEspecial = limiteChequeEspecial + saldo;

        if(saque <= saldo) {
            saldo = saldo - saque;
            System.out.println("Transacao realizada com sucesso.");
        } else if (saque <= limiteChequeEspecial){
            System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
        } else {
            System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
        }

        scanner.close();
    }

}
