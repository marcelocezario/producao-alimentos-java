package model;

import java.util.Calendar;

public class Producao {
	
	private int id;
	private Calendar dataDaProducao;
	private Produto produto;
	private double quantidade;
	private double custoProducao;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Calendar getDataDaProducao() {
		return dataDaProducao;
	}
	public void setDataDaProducao(Calendar dataDaProducao) {
		this.dataDaProducao = dataDaProducao;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	public double getCustoProducao() {
		return custoProducao;
	}
	public void setCustoProducao(double custoProducao) {
		this.custoProducao = custoProducao;
	}
	
	

}
