package br.edu.univas.si6.es4.abstractfactory;

public class ProdutoXMLDAO implements ProdutoDAO {

	@Override
	public void insert(Produto produto) {
		System.out.println("Inserindo produto no arquivo XML...");
		System.out.println(produto);
	}

	@Override
	public Produto[] list() {
		System.out.println("Buscando produtos do arquivo XML...");
		return new Produto[0];
	}

}
