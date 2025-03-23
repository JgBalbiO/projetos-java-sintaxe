import java.util.Scanner;

public class CadastroAluno {
    public static void main(String[] args)  {
    Scanner scanner = new Scanner(System.in); //criar o scanner
    
    // Solicitando os dados do aluno
    System.out.println("Qual a matrícula do aluno? (Ex.: 123456)");
    int matricula = scanner.nextInt();
    scanner.nextLine();// Consumir a quebra de linha

    System.out.println("Qual o nome do aluno? (Ex.: João Gabriel)");
    String nome = scanner.nextLine();

    System.out.println("Qual o curso do aluno? (Ex.: Defesa Cibernética)");
    String curso = scanner.nextLine();

    System.out.println("Qual sua nota? (Ex.:10,0)");
    double nota = scanner.nextDouble();

    // Exibir a mensagem formatada
    System.out.println("Olá, " + nome + " seu cadastro foi realizado com sucesso!");
    System.out.println("Matrícula: " + matricula);
    System.out.println("Curso: " + curso);
    System.out.println("Nota Final: "  + nota);
   
    // Fechar o scanner
    scanner.close();

    }     
}


