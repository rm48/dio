import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
		
		try {
			int parametroUm = lerParametro(terminal, "Digite o primeiro parâmetro:");
            int parametroDois = lerParametro(terminal, "Digite o segundo parâmetro:");
			
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			System.out.println(exception.getMessage());
		} 
            terminal.close();
			System.out.println("Fim");
	}

	private static int lerParametro(Scanner terminal, String mensagem) {
        while (true) {
            try {
                System.out.println(mensagem);
                return terminal.nextInt();
            } catch (InputMismatchException exception) {
                System.out.println("Entrada inválida. Precisa ser um número inteiro.");
                //limpar o buffer
				terminal.next();
            }
        }
    }

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if(parametroUm > parametroDois)
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
		int contagem = parametroDois - parametroUm;
		for(int i = 1; i <= contagem; i++){
			System.out.println("Imprimindo o número " + i);
		}
    }
}
