package br.com.pauloneto.testewebservice.ws.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;

import br.com.pauloneto.testewebservice.models.Product;
import br.com.pauloneto.testewebservice.ws.IProductWs;

@WebService(endpointInterface = "br.com.pauloneto.testewebservice.ws.IProductWs")
public class ProductWsImpl implements IProductWs {

	@Resource
    private WebServiceContext wsctx;
	
	@Override
	@WebMethod
	public List<Product> obterTodosProdutos() {
		return gerarListaProdutos();
	}

	private List<Product> gerarListaProdutos() {
		List<Product> produtos = new ArrayList<Product>();
		Product p1 = new Product("Arroz");
		Product p2 = new Product("Feijão");
		Product p3 = new Product("Macarrão");
		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);
		return produtos;
	}

}
