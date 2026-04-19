package ar.edu.unq.po2.tp3;
import java.util.ArrayList;

public class Counter {
	private ArrayList<Integer> colector; 
	
	public ArrayList<Integer> getColector() {
		return colector;
	}

	public void setColector(ArrayList<Integer> colector) {
		this.colector = colector;
	}
	
	
	public Counter() {
		super();
		this.colector = new ArrayList<>();
	}
	
	public void addNumber(Integer numero) {
		this.colector.add(numero); 
	}
	
	public int cuantosParHay() {
		int colector2 = 0;
		for (int numero: colector) {
			if (numero % 2 == 0) {
				colector2 = colector2 + 1;
			}
		}
		return colector2;
	}
	
	
	
}
