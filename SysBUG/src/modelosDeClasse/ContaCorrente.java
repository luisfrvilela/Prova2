package modelosDeClasse;

public class ContaCorrente extends Conta{

	private String numeroCartaoDebito;
	private Double emprestimo;
	private Double taxaDeManutencao;
	
	public String getNumeroCartaoDebito() {
		return numeroCartaoDebito;
	}
	public void setNumeroCartaoDebito(String numeroCartaoDebito) {
		this.numeroCartaoDebito = numeroCartaoDebito;
	}
	public Double getEmprestimo() {
		return emprestimo;
	}
	public void setEmprestimo(Double emprestimo) {
		this.emprestimo = emprestimo;
	}
	public Double getTaxaDeManutencao() {
		return taxaDeManutencao;
	}
	public void setTaxaDeManutencao(Double taxaDeManutencao) {
		this.taxaDeManutencao = taxaDeManutencao;
	}
	
	
}
