package model;

import java.util.ArrayList;
import java.util.Calendar;

public class Venda {
	
	private int id;
	private String cliente;
	private Calendar dataDaVenda;
	private double valorDaVenda;
	private ArrayList<ItemVenda> itens;
	private double custoDaVenda;
	


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getCliente() {
		return cliente;
	}



	public void setCliente(String cliente) {
		this.cliente = cliente;
	}



	public Calendar getDataDaVenda() {
		return dataDaVenda;
	}



	public void setDataDaVenda(Calendar dataDaVenda) {
		this.dataDaVenda = dataDaVenda;
	}



	public double getValorDaVenda() {
		return valorDaVenda;
	}



	public void setValorDaVenda(double valorDaVenda) {
		this.valorDaVenda = valorDaVenda;
	}



	public ArrayList<ItemVenda> getItens() {
		return itens;
	}



	public void setItens(ArrayList<ItemVenda> itens) {
		this.itens = itens;
	}



	public double getCustoDaVenda() {
		return custoDaVenda;
	}



	public void setCustoDaVenda(double custoDaVenda) {
		this.custoDaVenda = custoDaVenda;
	}



	public Venda (){
		itens = new ArrayList<ItemVenda>();
	}

}
