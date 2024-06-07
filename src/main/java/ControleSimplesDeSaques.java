import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o limite diário de saque: ");
        double limiteDiario = scanner.nextDouble();

        System.out.println("Limite diário de saque: " + limiteDiario);
        // Loop for para iterar sobre os saques
        for (int i = 1; ; i++) {
            System.out.print("Informe o valor do saque " + i + " (ou 0 para encerrar): ");
            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break; // Encerra o loop
            } else if (valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break; // Encerra o loop
            } else {
                limiteDiario = limiteDiario - valorSaque;
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
                // TODO: Atualizar o limite diário e imprimir a saída no formato dos exemplos.
            }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}