package account;

import account.model.Account;
import account.util.Colors;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Account c1 = new Account(1, 123, 1, "Adriana", 10000.0f);
        c1.view();
        c1.withdraw(12000.0f);
        c1.view();
        c1.deposit(5000.0f);
        c1.view();

        Scanner read = new Scanner(System.in);

        int code;

        while (true){
            System.out.println(Colors.TEXT_GREEN_BOLD + Colors.ANSI_BLACK_BACKGROUND
                    + "************************************************************\n");
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
            System.out.println("Entre com a opção desejada: \n" + Colors.TEXT_RESET);

            code = read.nextInt();

            if (code == 9) {
                System.out.println(Colors.TEXT_WHITE_BOLD +"\nWireless Bank - O seu Futuro começa aqui!");
                read.close();
                System.exit(0);
            }
            switch (code) {
                case 1:
                    System.out.println(Colors.TEXT_WHITE + "Criar Account\n\n");

                    break;
                case 2:
                    System.out.println(Colors.TEXT_WHITE + "Listar todas as Contas\n\n");

                    break;
                case 3:
                    System.out.println(Colors.TEXT_WHITE + "Consultar dados da Account - por número\n\n");

                    break;
                case 4:
                    System.out.println(Colors.TEXT_WHITE + "Atualizar dados da Account\n\n");

                    break;
                case 5:
                    System.out.println(Colors.TEXT_WHITE + "Apagar a Account\n\n");

                    break;
                case 6:
                    System.out.println(Colors.TEXT_WHITE + "Saque\n\n");

                    break;
                case 7:
                    System.out.println(Colors.TEXT_WHITE + "Depósito\n\n");

                    break;
                case 8:
                    System.out.println(Colors.TEXT_WHITE + "Transferência entre Contas\n\n");

                    break;
                default:
                    System.out.println(Colors.TEXT_RED_BOLD + "\nOpção Inválida!\n");
                    break;
            }

        }
    }
}
