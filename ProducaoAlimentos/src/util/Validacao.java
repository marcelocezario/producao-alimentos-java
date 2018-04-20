package util;

import model.Insumo;

public class Validacao {
	
	public static boolean validarQuantidadeEstoque (Insumo insumo, double quantidade){
		if (quantidade <= insumo.getQuantidadeEstoque()){
			return true;
		} else{
			return false;
		}
	}

}
