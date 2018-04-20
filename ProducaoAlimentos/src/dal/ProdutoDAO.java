package dal;

import java.util.ArrayList;

import model.Produto;
import model.ComposicaoProduto;

public class ProdutoDAO {

	private static ArrayList<Produto> produtos = new ArrayList<Produto>();

	public static Produto buscarProdutoPorNome(String nome) {
		for (Produto produtoCadastrado : produtos) {
			if (produtoCadastrado.getNome().equals(nome)) {
				return produtoCadastrado;
			}
		}
		return null;
	}

	public static boolean cadastrarProduto(Produto produto) {
		if (buscarProdutoPorNome(produto.getNome()) == null) {
			if (produtos.size() > 0) {
				produto.setId(produtos.get(produtos.size() - 1).getId() + 1);
			} else {
				produto.setId(1);
			}
			produtos.add(produto);
			return true;
		} else {
			return false;
		}
	}

	public static boolean registrarSaidaProduto(Produto produto, double quantidade) {
		if (quantidade <= produto.getQuantidadeEstoque() && quantidade > 0) {

			double valorSaida = 0;

			valorSaida = (produto.getCustoTotalEstoque() / produto.getQuantidadeEstoque()) * quantidade;

			produto.setCustoTotalEstoque(produto.getCustoTotalEstoque() - valorSaida);
			produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() - quantidade);

			return true;
		} else {
			return false;
		}

	}

	public static ArrayList<Produto> retornarProdutos() {
		return produtos;
	}

	public static boolean excluirInsumoDentroProduto(String nomeProduto, String nomeInsumo) {
		for (Produto produtoCadastrado : produtos) {
			if (produtoCadastrado.getNome().equals(nomeProduto)) {
				for (ComposicaoProduto insumoComposicao : produtoCadastrado.getComposicao()) {
					if (insumoComposicao.getInsumo().getNome().equals(nomeInsumo)) {
						produtoCadastrado.getComposicao().remove(insumoComposicao);
						return true;
					} 
				}
			}
		}
		return false;
	}
	
	public static boolean cadastrarComposicaoProduto (Produto produto, ComposicaoProduto composicaoProduto){
		
		if (composicaoProduto.getQuantidade() > 0){
			produto.getComposicao().add(composicaoProduto);
			return true;
		} else {
			return false;
		}
	}

}
