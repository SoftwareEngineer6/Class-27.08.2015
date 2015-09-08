package br.edu.univas.si6.es4.abstractfactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public abstract class AbstractDAOFactory {

	public static final int TIPO_RDB = 1;
	public static final int TIPO_XML = 2;

	public abstract ProdutoDAO createProdutoDAO();

	public abstract ClienteDAO createClienteDAO();
	
	public abstract PedidoDAO createPedidoDAO();

	public static AbstractDAOFactory getFactory() {
		
		String filename = "daofactory.properties";
		
		//InputStream esta entrando com dados do arquivo que o getResourceAsStream
		//está carregando do getClassLoader
		InputStream is = AbstractDAOFactory.class.getClassLoader().
		getResourceAsStream(filename);
		if(is == null){
			throw new RuntimeException("Recurso não encontrado!");
		}
		Properties props = new Properties();
		try {
			props.load(is);
			String type = props.getProperty("daofactory.factorytype");
			if("RDB".equalsIgnoreCase(type)){
				return new RDBDAOFactory();
			} else if("XML".equalsIgnoreCase(type)){
				return new XMLDAOFactory();
			} else if("MongoRDB".equalsIgnoreCase(type)){
				return new MongoDBFactory();
			}else {
				throw new RuntimeException("Tipo não suportado: " + type);
			}
		} catch (IOException e) {
			throw new RuntimeException("Não foi possivel ler as propriedades!", e);

		}
	}

}
