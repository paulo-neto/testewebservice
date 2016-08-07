package br.com.pauloneto.testewebservice.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import br.com.pauloneto.testewebservice.models.Product;

@WebService
@SOAPBinding(style = Style.RPC)
public interface IProductWs {

	@WebMethod
	public List<Product> obterTodosProdutos();
}
