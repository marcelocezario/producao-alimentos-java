package dal;

import java.util.ArrayList;
import java.util.Calendar;

import model.Insumo;
import model.Producao;
import model.Produto;
import util.Validacao;

public class ProducaoDAO {
	
	private static ArrayList<Producao> producao = new ArrayList<Producao>();
	private static Insumo insumo = new Insumo();

	public static boolean registrarNovaProducao(Produto produto, double quantidade) {
		if (quantidade > 0) {
			Producao novaProducao;
			novaProducao = new Producao();

			int insumosSemEstoque = 0;

			for (int i = 0; i < produto.getComposicao().size(); i++) {
				insumo = produto.getComposicao().get(i).getInsumo();
				double quantidadeInsumo = produto.getComposicao().get(i).getQuantidade() * quantidade;
				if (Validacao.validarQuantidadeEstoque(insumo, quantidadeInsumo)) {
					insumosSemEstoque += 0;
				} else {
					insumosSemEstoque += 1;
				}
			}

			if (insumosSemEstoque == 0) {

				double valorTotal = 0;

				for (int i = 0; i < produto.getComposicao().size(); i++) {
					insumo = produto.getComposicao().get(i).getInsumo();

					double quantidadeInsumo = produto.getComposicao().get(i).getQuantidade() * quantidade;
					double custoInsumo = InsumoDAO.registrarSaidaInsumoeRetornarValorSaida(insumo, quantidadeInsumo);

					valorTotal += custoInsumo;
				}

				produto.setCustoTotalEstoque(produto.getCustoTotalEstoque() + valorTotal);
				produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() + quantidade);

				if (producao.size() > 0) {
					novaProducao.setId(producao.get(producao.size() - 1).getId() + 1);
				} else {
					novaProducao.setId(1);
				}
				novaProducao.setDataDaProducao(Calendar.getInstance());
				novaProducao.setProduto(produto);
				novaProducao.setQuantidade(quantidade);
				novaProducao.setCustoProducao(valorTotal);
				producao.add(novaProducao);

				return true;

			} else {
				return false;
			}

		} else {
			return false;
		}
	}
	
	public static ArrayList<Producao> retornarProducao() {
		return producao;
	}	
	
}
