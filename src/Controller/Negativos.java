package Controller;

public class Negativos {

	public Negativos() {
		super ();
	}
	
	
	public int QTNegativos (int [] vetor, int tamanho ) {
		if (tamanho==0) {
			return 0;
		} else {
			if (vetor[tamanho-1]<0) {
				return 1+ QTNegativos(vetor, tamanho-1);
				} else {
					return 0 + QTNegativos(vetor, tamanho-1);	
				}
		}
	}
}
