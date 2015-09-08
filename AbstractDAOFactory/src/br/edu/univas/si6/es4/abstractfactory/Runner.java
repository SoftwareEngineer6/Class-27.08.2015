package br.edu.univas.si6.es4.abstractfactory;

public class Runner {

	public static void main(String[] args) {
		// Buscar a fábrica correta:
		AbstractDAOFactory factory = AbstractDAOFactory.getFactory();
		
		// Fabricar o ProdutoDAO:
		ProdutoDAO produtoDAO = factory.createProdutoDAO();
		
		// Fabricar o ClienteDAO:
		ClienteDAO clienteDAO = factory.createClienteDAO();
		
		//Gerar Pedido
		PedidoDAO pedidoDAO = factory.createPedidoDAO();
		
		// Inserindo um novo produto:
		Produto produto = new Produto("Macarrão");
		produtoDAO.insert(produto);
		
		// Inserindo um novo cliente:
		Cliente cliente = new Cliente("João");
		clienteDAO.insert(cliente);
		
		//Inserindo um novo produto
		Pedido pedido = new Pedido("Pedido de Compra");
		pedidoDAO.insert(pedido);
		
		// Listando produtos:
		Produto[] produtos = produtoDAO.list();
		
		// Listando clientes:
		Cliente[] clientes = clienteDAO.list();
		
		//Listando pedidos
		Pedido[] pedidos = pedidoDAO.list();
	}

}
