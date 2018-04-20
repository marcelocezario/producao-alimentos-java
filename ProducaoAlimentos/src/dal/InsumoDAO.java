package dal;

import java.util.ArrayList;

import model.Insumo;

public class InsumoDAO {
	
	private static ArrayList<Insumo> insumos = new ArrayList<Insumo>();

	public static Insumo buscarInsumoPorNome(String nome) {
		for (Insumo insumoCadastrado : insumos) {
			if (insumoCadastrado.getNome().equals(nome)) {
				return insumoCadastrado;
			}
		}
		return null;
	}

	public static boolean cadastrarInsumo(Insumo insumo) {
		if (buscarInsumoPorNome(insumo.getNome()) == null) {
			if (insumos.size() > 0) {
				insumo.setId(insumos.get(insumos.size() - 1).getId() + 1);
			} else {
				insumo.setId(1);
			}
			insumos.add(insumo);
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean registrarEntradaInsumo (Insumo insumo, double quantidade, double valorTotal){
		if (quantidade > 0 && valorTotal > 0){
			insumo.setQuantidadeEstoque(insumo.getQuantidadeEstoque() + quantidade);
			insumo.setValorTotal(insumo.getValorTotal() + valorTotal);
			return true;
		} else {
			return false;
		}
	}
	
	public static double registrarSaidaInsumoeRetornarValorSaida (Insumo insumo, double quantidade){
		if (quantidade <= insumo.getQuantidadeEstoque()){
			double valorSaida = (insumo.getValorTotal() / insumo.getQuantidadeEstoque()) * quantidade;
			insumo.setQuantidadeEstoque(insumo.getQuantidadeEstoque() - quantidade);
			insumo.setValorTotal(insumo.getValorTotal() - valorSaida);
			return valorSaida;
		} else {
			return 0;
		}
	}
	
	
	public static ArrayList <Insumo> retornarInsumos (){
		return insumos;
	}
	
}
