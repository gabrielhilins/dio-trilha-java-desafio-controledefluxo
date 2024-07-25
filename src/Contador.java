import java.util.Scanner;
public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			System.err.println("Erro: " + e.getMessage());
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O Segundo parâmetro deve ser maior que o primeiro");
        }
		int contagem = parametroDois - parametroUm;
		for (int i = 1; i < contagem + 1; i++) {
            System.out.println(i);
        }
	}
}