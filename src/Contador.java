import java.util.Scanner;
import java.util.InputMismatchException;

public class Contador {

	public static void main(String[] args) throws Exception {

		try {
            
		    Scanner scanner = new Scanner(System.in);

		    System.out.print("Digite o primeiro parâmetro: ");
		    int parametroUm = scanner.nextInt();

    		System.out.print("Digite o segundo parâmetro: ");
	    	int parametroDois = scanner.nextInt();
		
			contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
            System.out.println("Parametro inválido, informe um número inteiro.");
        }

	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

		if(parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		}
		
		int contagem = parametroDois - parametroUm;
		for(int i=1; i <= contagem; i++) {
			System.out.println("Imprimindo o número " + i);
		}

    }

}
