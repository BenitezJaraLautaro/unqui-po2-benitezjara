package ar.edu.unq.po2.tp3;

public class Ejercicio3 {/*devuelva el número más alto entre 0 y 1000, que sea múltiplo simultáneamente de X e Y. Si no existe, devolver -1*/
	public int numeroMasAlto(int x, int y) {
		
		int multiplo = 1000;
		while(multiplo >=1 && (multiplo % x != 0 || multiplo % y != 0)) {
			multiplo--;
		}
		if(multiplo >= 1) {
			return multiplo;
		} else {
			return -1;
		}
			
	}
	
}

