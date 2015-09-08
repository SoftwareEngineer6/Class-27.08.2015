package br.edu.univas.si6.es4.abstractfactory;

public class ClienteXMLDAO implements ClienteDAO {

	@Override
	public void insert(Cliente cliente) {
		System.out.println("Inserindo o cliente no arquivo XML...");
		System.out.println(cliente);
	}

	@Override
	public Cliente[] list() {
		System.out.println("Listando clientes do arquivo XML...");
		return new Cliente[0];
	}

}
