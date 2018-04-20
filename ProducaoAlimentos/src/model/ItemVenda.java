package model;

import java.util.Calendar;

public class ItemVenda {
	
	private Produto produto;
	private double quantidade;
	private Calendar dataAdicao;
	private double valorVenda;
	private double custoVenda;
	
	public Calendar getDataAdicao() {
		return dataAdicao;
	}

	public void setDataAdicao(Calendar dataAdicao) {
		this.dataAdicao = dataAdicao;
	}

	public double getCustoVenda() {
		return custoVenda;
	}

	public void setCustoVenda(double custoVenda) {
		this.custoVenda = custoVenda;
	}

	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
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

	public Calendar getDataDaAdicao() {
		return dataDaAdicao;
	}

	public void setDataDaAdicao(Calendar dataDaAdicao) {
		this.dataDaAdicao = dataDaAdicao;
	}

	private Calendar dataDaAdicao;
	
	public ItemVenda (){
		produto = new Produto();
	}


}
