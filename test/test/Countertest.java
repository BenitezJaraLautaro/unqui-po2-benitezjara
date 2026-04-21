package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Counter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Countertest {
	
	private Counter contador2;

	@BeforeEach
	void setUpBeforeClass() throws Exception {
		contador2 = new Counter();
		
	}

	@Test
	void hayUnPar() {
		contador2.addNumber(2);
		contador2.addNumber(2);
		assertEquals(contador2.cuantosParesHay(), 2);
	}
	
	@Test
	void cuantosMultplosDe2() {	
		contador2.addNumber(2);
		contador2.addNumber(4);
		contador2.addNumber(8);
		contador2.addNumber(7);
		long n = contador2.cuantosParesHay();
		assertEquals(n, 3);
	}
	

}
