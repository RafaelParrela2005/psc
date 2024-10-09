import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tabela de gravidades dos planetas
        Map<String, Double> planetas = new HashMap<>();
        planetas.put("Mercúrio", 3.7);
        planetas.put("Vênus", 8.8);
        planetas.put("Terra", 9.8);
        planetas.put("Marte", 3.8);
        planetas.put("Júpiter", 26.4);
        planetas.put("Saturno", 11.5);
        planetas.put("Urano", 9.3);
        planetas.put("Netuno", 12.2);
        planetas.put("Plutão", 0.6);

        // Exibe os planetas disponíveis
        System.out.println("Escolha um planeta:");
        for (String planeta : planetas.keySet()) {
            System.out.println(planeta);
        }

        String escolha = scanner.nextLine();

        // Verifica se o planeta escolhido está na tabela
        if (!planetas.containsKey(escolha)) {
            System.out.println("Planeta inválido. Tente novamente.");
            scanner.close();
            return;
        }

        // Solicita a velocidade inicial e o instante
        System.out.print("Informe a velocidade inicial (v0) em m/s: ");
        double v0 = scanner.nextDouble();

        System.out.print("Informe o instante (t) em segundos: ");
        double t = scanner.nextDouble();

        // Obtém a gravidade do planeta escolhido
        double g = planetas.get(escolha);

        // Calcula a velocidade e a altura
        double v = v0 - g * t;
        double h = v0 * t - (g * t * t) / 2;

        // Exibe os resultados
        System.out.printf("No planeta %s, a velocidade v(t) é: %.2f m/s%n", escolha, v);
        System.out.printf("A altura h(t) é: %.2f m%n", h);

        scanner.close();
    }
}