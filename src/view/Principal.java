package view;

import Controller.Negativos;

public class Principal {

	public static void main(String[] args) {
		
		int [] vetor = {-1,2,4,-8,5,-23};
		int tamanho= vetor.length;
		
		
		Negativos Ne = new Negativos();
		int res = Ne.QTNegativos(vetor, tamanho);
		System.out.println(res);
	
	}

}
