package entities;

public class PessoaJuridica extends Contribuinte {
	
	private Integer numeroFuncionario;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionario) {
		super(nome, rendaAnual);
		this.numeroFuncionario = numeroFuncionario;
	}

	public Integer getNumeroFuncionario() {
		return numeroFuncionario;
	}

	public void setNumeroFuncionario(Integer numeroFuncionario) {
		this.numeroFuncionario = numeroFuncionario;
	}

	@Override
	public double taxaPaga() {				//public Double taxaPaga() {
		double total = 0.0;					//NÃO PRECISA
		if (numeroFuncionario <= 10) {
			total = rendaAnual * 0.16;
		}	//return rendaAnual...
		else {
			total = rendaAnual * 0.14;
		}	//return rendaAnual...
		return total;						//NÃO PRECISA
		
	}
	
}
