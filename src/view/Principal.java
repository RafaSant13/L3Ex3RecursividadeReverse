package view;
import controller.ReverseControle;

public class Principal {

	public static void main(String[] args) {
		ReverseControle RC = new ReverseControle();
		String palavra = "O sol bateu na janela do seu quarto";
		int tamanho = palavra.length();
		
		System.out.println("O inverso de "+palavra+" é "+RC.Reverse(palavra, tamanho));

	}

}
