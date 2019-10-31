package br.com.drummond.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ac2amilcar {
	
	@RequestMapping(value = "/api2/{numero1}/{numero2}/{numero3}", method = RequestMethod.GET)
	public Integer Resultado(@PathVariable Integer numero1,@PathVariable Integer numero2,@PathVariable Integer numero3)
	{
		
		Integer resultado;
		
		
		if (numero1 > numero2 && numero1 > numero3)
	    {
			resultado = numero1;
		        return resultado;
	    }
		if(numero2 > numero1 && numero2 > numero3)
		{
			resultado = numero2;
		        return resultado;
		}else
		resultado = numero3;
		return resultado;
		
	}
}