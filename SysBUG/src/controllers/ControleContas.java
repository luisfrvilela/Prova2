package controllers;
import java.util.ArrayList;

import modelosDeClasse.Conta;

public class ControleContas {
	
	private ArrayList<Conta> listaDeContas; 
	
	public ControleContas(){
		this.listaDeContas = new ArrayList<Conta>();
	}
    public void adicionarConta(Conta umaConta){
    	listaDeContas.add(umaConta);
    }
    
    public void excluirConta(Conta umaConta){
    	listaDeContas.remove(umaConta);
    }
    
    public Conta buscarConta(String numeroDaConta){
    	for (Conta i: listaDeContas) {
            if (i.getNumeroDaConta().equalsIgnoreCase(numeroDaConta)){
                return i;
            }
        }
        return null;
    }
}
