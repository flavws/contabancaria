package account;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int code;

        while (true){
            System.out.println("************************************************************\n");
            System.out.println("                     WIRELESS BANK                          \n");
            System.out.println("************************************************************\n");
            System.out.println("                     1 - Criar conta                          ");
            System.out.println("                     2 - Listar todas as contas               ");
            System.out.println("                     3 - Buscar conta por número              ");
            System.out.println("                     4 - Atualizar dados da conta             ");
            System.out.println("                     5 - Apagar conta                         ");
            System.out.println("                     6 - Sacar                                ");
            System.out.println("                     7 - Depositar                            ");
            System.out.println("                     8 - Transferir valores entre contas      ");
            System.out.println("                     9 - Sair                               \n");
            System.out.println("************************************************************\n");
            System.out.println("Entre com a opção desejada: \n");

            code = read.nextInt();

            if (code == 9) {
                System.out.println("\nWireless Bank - O seu Futuro começa aqui!");
                read.close();
                System.exit(0);
            }
            switch (code) {
                case 1:
                    System.out.println("Criar Conta\n\n");

                    break;
                case 2:
                    System.out.println("Listar todas as Contas\n\n");

                    break;
                case 3:
                    System.out.println("Consultar dados da Conta - por número\n\n");

                    break;
                case 4:
                    System.out.println("Atualizar dados da Conta\n\n");

                    break;
                case 5:
                    System.out.println("Apagar a Conta\n\n");

                    break;
                case 6:
                    System.out.println("Saque\n\n");

                    break;
                case 7:
                    System.out.println("Depósito\n\n");

                    break;
                case 8:
                    System.out.println("Transferência entre Contas\n\n");

                    break;
                default:
                    System.out.println("\nOpção Inválida!\n");
                    break;
            }

        }
    }
}
