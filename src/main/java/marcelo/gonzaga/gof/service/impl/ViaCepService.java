package marcelo.gonzaga.gof.service.impl;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import marcelo.gonzaga.gof.model.Endereco;

@FeignClient(name = "viacep", url = "http://viacep.com.br/ws")
public interface ViaCepService {
    //  @RequestMapping(method = RequestMethod.GET, value = "/{cep}/json/")
    @GetMapping("/{cep}/json/")  
    Endereco consultarCep(@PathVariable("cep") String cep);

}
