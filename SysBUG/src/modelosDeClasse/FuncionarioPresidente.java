package modelosDeClasse;

public class FuncionarioPresidente extends FuncionarioComum{

	private int numeroDeFuncionariosDoBanco;
	private int numeroDeClientesDoBanco;
	
	public FuncionarioPresidente(String nome, String telefone,
			String endereco, int cargaHorariaSemanal, Double salario,
			int anoDeContratacao) {
		super(nome, telefone, endereco, cargaHorariaSemanal, salario, anoDeContratacao);
	}

	public int getNumeroDeFuncionariosDoBanco() {
		return numeroDeFuncionariosDoBanco;
	}

	public void setNumeroDeFuncionariosDoBanco(int numeroDeFuncionariosDoBanco) {
		this.numeroDeFuncionariosDoBanco = numeroDeFuncionariosDoBanco;
	}

	public int getNumeroDeClientes() {
		return numeroDeClientesDoBanco;
	}

	public void setNumeroDeClientes(int numeroDeClientes) {
		this.numeroDeClientesDoBanco = numeroDeClientes;
	}

	
}
