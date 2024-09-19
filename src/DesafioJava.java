import java.util.Scanner;

public class DesafioJava {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        String nome = "Tony Stark";
        String tipoConta = "corrente";
        double saldo = 25000.00;
        int operacao = 0;


        System.out.println ("****************************************");
        System.out.println ("\nDados iniciais do cliente ");
        System.out.println ("Nome do cliente: " + nome);
        System.out.println ("Tipo de conta: " + tipoConta);
        System.out.println ("Saldo inicial: R$" + saldo);
        System.out.println ("\n******************************************");


        String menu = """ 
                   Operações 
                1-Consultar saldo
                2-Receber valor
                3-Transferir valor
                4-Sair
                """;



        while (operacao != 4) {
            System.out.println(menu);
            operacao = dados.nextInt();

            switch (operacao) {
                case 1:
                    System.out.println("Seu saldo é: R$" + saldo);
                    break;

                case 2:
                    System.out.println("Quanto você irá receber?");
                    double receberValor = dados.nextDouble();
                    saldo += receberValor;
                    System.out.println("Seu saldo atualizado: R$" + saldo);
                    break;

                case 3:
                    System.out.println("Quanto deseja transferir?");
                    double transferirValor = dados.nextDouble();
                    if (transferirValor > saldo) {
                        System.out.println("Não há saldo suficiente para fazer essa transferência.");
                    } else {
                        saldo -= transferirValor;
                        System.out.println("Seu saldo agora é de R$" + saldo);
                    }
                    break;

                case 4: //flag para sair do loop
                    boolean continuarLoop = false;
                    System.out.println("Obrigado por utilizar o Manubank!");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }

        }
    }
}
