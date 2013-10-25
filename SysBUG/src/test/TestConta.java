package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import modelosDeClasse.Conta;

import org.junit.Before;
import org.junit.Test;

public class TestConta {

	ArrayList<Conta> listaDeContas; 
	Conta umaConta;
	
	@Before
	public void setUp() throws Exception{
		listaDeContas = new ArrayList<Conta>();
		umaConta = new Conta();
	}
	@Test
	public void testAdicionarConta() {
		listaDeContas.add(umaConta);
		assertEquals(1,listaDeContas.size());
	}

}
