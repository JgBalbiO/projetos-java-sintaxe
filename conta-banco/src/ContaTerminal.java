//Usar sobre regras de declaração de variáveis
//Usar sobre terminal, main args e a classe Scanner
//Usar sobre concatenação e classe String com método concat

import java.util.Scanner; //Importar o scanner

public class ContaTerminal {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in); //criar o scanner

        System.out.println("Por favor, digite o número da sua agência: (EX.: 1234) "); //faz pergunta ao usuario 
        int numero = scanner.nextInt(); //programa vai ler a resposta do usuario em número inteiro 
        scanner.nextLine(); //Consumir a quebra de linha antes do próximo nextLine()

        System.out.println("Por favor, agora digite qual sua agência: (EX.: 123-4 ) ");//faz pergunta ao usuario 
        String agencia = scanner.nextLine();//programa vai ler a resposta do usuario em texto

        System.out.println("Por favor, agora digite seu nome: (EX.: JOAO PEDRO)");//faz pergunta ao usuario 
        String nome = scanner.nextLine();//programa vai ler a resposta do usuario em texto

        System.out.println("Por favor, agora digite seu saldo: (EX.: 1234,25)");//faz pergunta ao usuario 
        double saldo = scanner.nextDouble();//programa vai ler a resposta do usuario em número com virgula

        System.out.println("Olá, " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque."); //saída de dados concat

        scanner.close(); //fechar o scanner

    }
}
