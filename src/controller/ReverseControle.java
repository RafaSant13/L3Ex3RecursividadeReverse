package controller;

public class ReverseControle {

	public ReverseControle() {
		super();
	}
	
	public String Reverse(String palavra, int tamanho) {
		//Condição de parada -> Quando a variável tamanho é igual a um, pois á palavra só tem um caractere
		if (tamanho == 1)
		{
			return palavra;
		}
		else
		{
			tamanho--;
			//A função é chamada na variável inverso, com a váriavel palavra sendo diminuída por um caractere
			String inverso = Reverse(palavra.substring(1), tamanho);
			inverso = inverso + palavra.substring(0, 1);
			
			return inverso;
		}
	}

}
