package br.edu.univas.si6.es4.abstractfactory;

public class MongoDBFactory extends AbstractDAOFactory{

	public PedidoDAO createPedidoDAO(){
		return new PedidoMongoRDBDAO();
	}
	
	public ClienteDAO createClienteDAO(){
		return new ClienteMongoRDBDAO();
	}

	public ProdutoDAO createProdutoDAO() {
		return new ProdutoMongoRDBDAO();
	}
	
}
