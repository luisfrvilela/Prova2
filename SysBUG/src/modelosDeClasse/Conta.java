package modelosDeClasse;

public class Conta {
	
	private Double saldo;
	private Double retirada;
	private Double deposito;
	private String numeroDaConta;
	private int numeroAleatorio;
	
	public String getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(String numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public int getNumeroAleatorio() {
		return numeroAleatorio;
	}

	public void setNumeroAleatorio(int numeroAleatorio) {
		this.numeroAleatorio = numeroAleatorio;
	}

	public void gerarNumeroDaConta(){
		numeroAleatorio = (int) (Math.random()*10000000);
		numeroDaConta = new Integer(numeroAleatorio).toString();
		this.setNumeroDaConta(numeroDaConta);
	}
	
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public Double getRetirada() {
		return retirada;
	}
	public void setRetirada(Double retirada) {
		this.retirada = retirada;
	}
	public Double getDeposito() {
		return deposito;
	}
	public void setDeposito(Double deposito) {
		this.deposito = deposito;
	}
	
	
	

}
