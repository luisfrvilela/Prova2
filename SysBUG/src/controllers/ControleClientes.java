package controllers;

import java.util.ArrayList;

import modelosDeClasse.Cliente;



public class ControleClientes {
	
private ArrayList<Cliente> listaDeClientes; 
	
	public ControleClientes(){
		this.listaDeClientes = new ArrayList<Cliente>();
	}
	
	public ArrayList<Cliente> getListaDeClientes(){
		return listaDeClientes;
	}
	
    public void adicionarCliente(Cliente umCliente){
    	listaDeClientes.add(umCliente);
    }
    
    public void excluirCliente(Cliente umCliente){
    	listaDeClientes.remove(umCliente);
    }
    
    public Cliente buscarCliente(String nome){
    	for (Cliente i: listaDeClientes) {
            if (i.getNome().equalsIgnoreCase(nome)){
                return i;
            }
        }
        return null;
    }

}
