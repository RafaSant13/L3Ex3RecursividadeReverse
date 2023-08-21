package controller;

public class ReverseControle {

	public ReverseControle() {
		super();
	}
	
	public String Reverse(String palavra, int tamanho) {
		//Condi��o de parada -> Quando a vari�vel tamanho � igual a um, pois � palavra s� tem um caractere
		if (tamanho == 1)
		{
			return palavra;
		}
		else
		{
			tamanho--;
			//A fun��o � chamada na vari�vel inverso, com a v�riavel palavra sendo diminu�da por um caractere
			String inverso = Reverse(palavra.substring(1), tamanho);
			inverso = inverso + palavra.substring(0, 1);
			
			return inverso;
		}
	}

}
