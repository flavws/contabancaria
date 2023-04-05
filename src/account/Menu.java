package account;

import account.controller.AccountController;
import account.model.Account;
import account.model.CurrentAccount;
import account.model.DepositAccount;
import account.util.Colors;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        AccountController accounts = new AccountController();

        int code, number, branch, type, birthday;
        String holder;
        float balance, limit;

        CurrentAccount cc1 = new CurrentAccount(accounts.generateNumber(),123,1,"João da Silva",1000f,100.0f);
        accounts.create(cc1);

        CurrentAccount cc2 = new CurrentAccount(accounts.generateNumber(),124,1,"Maria da Silva",2000f,100.0f);
        accounts.create(cc2);

        DepositAccount cp1 = new DepositAccount(accounts.generateNumber(),125,2,"Mariana Santos",4000f,12);
        accounts.create(cp1);

        DepositAccount cp2 = new DepositAccount(accounts.generateNumber(),126,2,"Juliana Ramos",8000f,15);
        accounts.create(cp2);

        Scanner read = new Scanner(System.in);

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
                    System.out.println(Colors.TEXT_WHITE + "Criar Conta\n\n");

                    System.out.println("Digite o número da agência: ");
                    branch = read.nextInt();
                    System.out.println("Digite o nome do titular: ");
                    read.skip("\\R?");
                    holder = read.nextLine();

                    do {
                        System.out.println("Digite o Tipo da Conta (1-CC ou 2-CP): ");
                        type = read.nextInt();
                    } while (type < 1 && type > 2);

                    System.out.println("Digite o Saldo da Conta (R$): ");
                    balance = read.nextFloat();

                    switch (type){
                        case 1 -> {
                            System.out.println("Digite o Limite de Crédito (R$): ");
                            limit = read.nextFloat();
                            accounts.create(new CurrentAccount(accounts.generateNumber(), branch, type, holder, balance, limit));
                        }
                        case 2 -> {
                            System.out.println("Digite o dia do Aniversario da Conta: ");
                            birthday = read.nextInt();
                            accounts.create(new DepositAccount(accounts.generateNumber(), branch, type, holder, balance, birthday));
                        }
                    }
                    break;
                case 2:
                    System.out.println(Colors.TEXT_WHITE + "Listar todas as Contas\n\n");
                    accounts.findAll();
                    break;
                case 3:
                    System.out.println(Colors.TEXT_WHITE + "Consultar dados da Conta - por número\n\n");

                    break;
                case 4:
                    System.out.println(Colors.TEXT_WHITE + "Atualizar dados da Conta\n\n");

                    break;
                case 5:
                    System.out.println(Colors.TEXT_WHITE + "Apagar a Conta\n\n");

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
