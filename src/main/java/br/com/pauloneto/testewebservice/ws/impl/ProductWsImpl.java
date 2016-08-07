package br.com.pauloneto.testewebservice.ws.impl;

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
		// TODO Auto-generated method stub
		return null;
	}

}
