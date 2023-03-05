package entities;

public class PessoaFisica extends Contribuinte {
	
	private double despesaSaude;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, double despesaSaude) {
		super(nome, rendaAnual);
		this.despesaSaude = despesaSaude;
	}

	public double getDespesaSaude() {
		return despesaSaude;
	}

	public void setDespesaSaude(double despesaSaude) {
		this.despesaSaude = despesaSaude;
	}

	@Override
	public double taxaPaga() {				//public Double taxaPaga() {
		double total = 0.0;					//NÃO PRECISA
		if (rendaAnual > 0 && rendaAnual <= 20000) {
			total = rendaAnual * 0.15 - despesaSaude * 0.50;
		}	//return rendaAnual...
		else if (rendaAnual > 20000) {
			total = rendaAnual * 0.25 - despesaSaude * 0.50;
		}	//return rendaAnual...
		return total;						//NÃO PRECISA
		
	}
	
	
	
}
