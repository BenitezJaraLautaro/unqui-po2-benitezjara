package ar.edu.unq.po2.tp3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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
	
	public long cuantosParesHay() {
		return  colector.stream().filter(numero -> numero % 2 == 0).count();
	}
	
	public long cuantosImparesHay() {
		return  colector.stream().filter(numero -> numero % 2 != 0).count();
	}
	
	
	
}
