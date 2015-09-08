package br.edu.univas.si6.es4.abstractfactory;

public class PedidoMongoRDBDAO implements PedidoDAO{

	@Override
	public void insert(Pedido pd) {
		System.out.println("Inserindo pedido no MongoDB...");
		System.out.println(pd);
		
	}

	@Override
	public Pedido[] list() {
		System.out.println("Buscando pedido no MongoDB...");
		return new Pedido[0];
	}

}
