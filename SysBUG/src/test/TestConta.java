package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import modelosDeClasse.Conta;

import org.junit.Before;
import org.junit.Test;

import controllers.ControleContas;

public class TestConta {

	ArrayList<Conta> listaDeContas; 
	Conta umaConta;
	ControleContas umControle;
	
	@Before
	public void setUp() throws Exception{
		umaConta = new Conta();
		umControle = new ControleContas();
		umaConta.gerarNumeroDaConta();
	}
	@Test
	public void testGetListaDeContas(){
		assertNotNull(umControle.getListaDeContas());
		assertEquals(0, umControle.getListaDeContas().size());
	}
	@Test
	public void testAdicionarConta() {
		umControle.adicionarConta(umaConta);
		assertEquals(1, umControle.getListaDeContas().size());
	}
	
     
    @Test
    public void testPesquisarConta(){
        umControle.adicionarConta(umaConta);
        assertEquals(umaConta, umControle.buscarConta(umaConta.getNumeroDaConta()));
        assertNotNull(umControle.buscarConta(umaConta.getNumeroDaConta()));
    }
    
    @Test
    public void testExcluirConta(){
        umControle.adicionarConta(umaConta);
        umControle.excluirConta(umaConta);
            assertNull(umControle.buscarConta(umaConta.getNumeroDaConta()));
    }

}
