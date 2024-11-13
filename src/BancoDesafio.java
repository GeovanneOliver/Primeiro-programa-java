import java.util.Scanner;

public class BancoDesafio {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        String nome = "Geovanne Oliveira";
        String tipoConta = "Corrente";
        double saldo = 2500;
        int opcaoEscolhida;


        String mensagemInicial = """
                ****************************
                Dados Iniciais do Cliente:
                
                Nome: %s
                Tipo de Conta: %s
                Saldo Inicial: R$ %f
                
                ****************************
                
                """.formatted(nome, tipoConta, saldo);

        String opcoes = """
                
                Operações: 
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Digite a opção desejada: 
                """;

        System.out.println(mensagemInicial);
        System.out.println(opcoes);
        opcaoEscolhida = terminal.nextInt();

        while (opcaoEscolhida != 4) {
            switch (opcaoEscolhida) {
                case 1:
                    System.out.println("Seu saldo atual é de: R$"+saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor a receber: ");
                    float valorAReceber = terminal.nextFloat();
                    saldo += valorAReceber;
                    System.out.println("Valor recebido com sucesso! Saldo atualizado: R$"+ saldo);
                    break;
                case 3:
                    System.out.println("Digite o valor a transferir: ");
                    float valorATransferir = terminal.nextFloat();
                    if (valorATransferir > saldo) {
                        System.out.println("Saldo inválido!");
                    }else{
                        saldo -= valorATransferir;
                        System.out.println("Valor transferido com sucesso! Saldo atualizado: R$"+ saldo);
                    }
                    break;
                default:
                    System.out.println("Opção invalida!");
                    break;
            }
            System.out.println(opcoes);
            opcaoEscolhida = terminal.nextInt();
        }
    }
}
