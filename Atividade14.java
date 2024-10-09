import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita que o usuário insira um comando Git
        System.out.print("Digite um comando Git (git clone, git fetch, git pull): ");
        String comando = scanner.nextLine().trim();

        // Verifica qual comando foi informado e exibe a explicação
        switch (comando) {
            case "git clone":
                System.out.println("\n'git clone' é usado para criar uma cópia local de um repositório remoto.");
                System.out.println("Exemplo: 'git clone https://github.com/usuario/repositorio.git'");
                break;
            case "git fetch":
                System.out.println("\n'git fetch' é usado para baixar novos dados de um repositório remoto.");
                System.out.println("Exemplo: 'git fetch origin'");
                break;
            case "git pull":
                System.out.println("\n'git pull' é usado para baixar e mesclar alterações do repositório remoto.");
                System.out.println("Exemplo: 'git pull origin main'");
                break;
            default:
                System.out.println("Comando inválido. Por favor, insira um dos comandos: git clone, git fetch, git pull.");
                break;
        }

        scanner.close();
    }
}
