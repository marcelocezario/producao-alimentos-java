package model;

public class ComposicaoProduto {
	
	private Insumo insumo;
	private double quantidade;
	
	public ComposicaoProduto (){
		insumo = new Insumo();
	}

	public Insumo getInsumo() {
		return insumo;
	}

	public void setInsumo(Insumo insumo) {
		this.insumo = insumo;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	
}
