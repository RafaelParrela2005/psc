package inteiro;

public class Inteiro {
	 // Método para multiplicação utilizando apenas soma
    public int multiplicacao(int a, int b) {
        int resultado = 0;
        for (int i = 0; i < Math.abs(b); i++) { //Só sai do loop quando i for igual ou maior que b positivo
            resultado += a;
        }
        // Ajusta o sinal caso b seja negativo
        return (b < 0) ? -resultado : resultado;
    }

    // Método para potência utilizando o método multiplicacao
    public int potencia(int a, int b) {
        if (b == 0) {
            return 1; // Qualquer número elevado a 0 é 1
        }
        
        int resultado = a;
        for (int i = 1; i < b; i++) {
            resultado = multiplicacao(resultado, a);
        }
        return resultado;
    }

    // Método para divisão utilizando apenas subtração
    public int divisao(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não permitida.");
        }
        
        int resultado = 0;
        int dividendo = Math.abs(a);
        int divisor = Math.abs(b);
        
        while (dividendo >= divisor) {
            dividendo -= divisor;
            resultado++;
        }
        
        // Ajusta o sinal do resultado caso a ou b sejam negativos
        return (a < 0 && b > 0) || (a > 0 && b < 0) ? -resultado : resultado;
    }

    // Método para verificar se um número é par
    public boolean par(int a) {
        return a % 2 == 0;
    }
}
