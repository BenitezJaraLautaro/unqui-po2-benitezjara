package ar.edu.unq.po2.tp3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Predicate;

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
		return  this.contarSegun(numero -> numero % 2 == 0);
	}
	
	public long cuantosImparesHay() {
		return  this.contarSegun(numero -> numero % 2 != 0);
	}
	
	public long contarSegun(Predicate<Integer> condicion) {
		return colector.stream().filter(condicion).count();
	}
	
	public long cuantosMultiplosDe(Integer n) {
		return this.contarSegun(numero -> numero % n == 0);
	}
	

	
	
}
