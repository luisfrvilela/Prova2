package modelosDeClasse;

public class FuncionarioGerente extends FuncionarioComum{


	private int senhaDeAcessoInterno;
	private int numeroDeFuncionariosGerenciados;
	
	public FuncionarioGerente(String nome, String telefone, String endereco,
			int cargaHorariaSemanal, Double salario, int anoDeContratacao) {
		super(nome, telefone, endereco, cargaHorariaSemanal, salario, anoDeContratacao);
	}

	public int getSenhaDeAcessoInterno() {
		return senhaDeAcessoInterno;
	}

	public void setSenhaDeAcessoInterno(int senhaDeAcessoInterno) {
		this.senhaDeAcessoInterno = senhaDeAcessoInterno;
	}

	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}

	public void setNumeroDeFuncionariosGerenciados(
			int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}

	
}
