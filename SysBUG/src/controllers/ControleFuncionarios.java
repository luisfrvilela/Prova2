package controllers;

import java.util.ArrayList;

import modelosDeClasse.FuncionarioComum;;



public class ControleFuncionarios {
	
private ArrayList<FuncionarioComum> listaDeFuncionarios; 
	
	public ControleFuncionarios(){
		this.listaDeFuncionarios = new ArrayList<FuncionarioComum>();
	}
	
	public ArrayList<FuncionarioComum> getListaDeFuncionarios(){
		return listaDeFuncionarios;
	}
	
    public void adicionarFuncionario(FuncionarioComum umFuncionario){
    	listaDeFuncionarios.add(umFuncionario);
    }
    
    public void excluirFuncionario(FuncionarioComum umFuncionario){
    	listaDeFuncionarios.remove(umFuncionario);
    }
    
    public FuncionarioComum buscarFuncionario(String nome){
    	for (FuncionarioComum i: listaDeFuncionarios) {
            if (i.getNome().equalsIgnoreCase(nome)){
                return i;
            }
        }
        return null;
    }

}
