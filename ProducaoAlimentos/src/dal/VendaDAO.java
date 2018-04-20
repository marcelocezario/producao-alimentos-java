package dal;

import java.util.ArrayList;

import model.Venda;

public class VendaDAO {
	
	private static ArrayList <Venda> vendas = new ArrayList<Venda>();
	
	public static void cadastrarVenda (Venda venda){
	
		if (vendas.size() > 0){
			int ultimoId = vendas.get(vendas.size() - 1).getId();
			venda.setId(ultimoId + 1);
		} else{
			venda.setId(1);
		}
		vendas.add(venda);
	}
	
	public static ArrayList<Venda> retornarVendas() {
		return vendas;
	}	
}
