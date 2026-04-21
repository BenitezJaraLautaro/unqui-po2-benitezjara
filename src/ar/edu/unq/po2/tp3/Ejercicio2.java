package ar.edu.unq.po2.tp3;

public class Ejercicio2 {
	
	public int elMayorNumeroConDigitosPares(int[] arreglo) {
		int elMayor = arreglo[0];
		int maxPar = this.contarDigitosPares(elMayor);
		for(int i = 1; i<arreglo.length; i = i +1 ) {
			int numeroActual = arreglo[i];
			if(this.contarDigitosPares(numeroActual) >= maxPar) {
				maxPar = this.contarDigitosPares(numeroActual);
				elMayor = numeroActual;
			}
			
		}
		return elMayor;
	}
	
	public int contarDigitosPares(int n) {
		int contador = 0;
		int numero = n;
		while (numero > 0) {
			int digito = numero%10;
			if (digito% 2 == 0) {
				contador = contador +1;
			}
			numero = numero/10;
		}
		return contador;
	}

}
