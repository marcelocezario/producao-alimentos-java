package model;

import java.util.ArrayList;

public class Produto {
	
	private int id;
	private String nome;
	private String unidadeMedida;
	private double quantidadeEstoque;
	private double custoTotalEstoque;
	private ArrayList<ComposicaoProduto> composicao;
	
	public Produto (){
		composicao = new ArrayList<ComposicaoProduto>();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUnidadeMedida() {
		return unidadeMedida;
	}
	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}
	public double getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	public void setQuantidadeEstoque(double quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	public double getCustoTotalEstoque() {
		return custoTotalEstoque;
	}
	public void setCustoTotalEstoque(double custoTotalEstoque) {
		this.custoTotalEstoque = custoTotalEstoque;
	}
	public ArrayList<ComposicaoProduto> getComposicao() {
		return composicao;
	}
	public void setComposicao(ArrayList<ComposicaoProduto> composicao) {
		this.composicao = composicao;
	}

}