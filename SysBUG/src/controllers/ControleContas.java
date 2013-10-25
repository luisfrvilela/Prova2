package controllers;
import java.util.ArrayList;

import modelosDeClasse.Cliente;

public class ControleContas {
	
	Cliente novoCliente = new Cliente("Maria","3562653","Brasilia-DF");
	ArrayList<Cliente> listaDeClientes; 
	boolean lista;
	
    public void adicionarCliente(Cliente novoCliente){
    	lista = listaDeClientes.add(novoCliente);
    }
}
