package marcelo.gonzaga.gof.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import marcelo.gonzaga.gof.model.Cliente;
import marcelo.gonzaga.gof.service.impl.ClienteService;


@RestController
@RequestMapping ("clientes")
public class ClienteRestController {
   
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<Iterable <Cliente>> buscarTodos() {
        return ResponseEntity.ok(clienteService.buscarTodos());
    }

    @GetMapping ("/{id}")
    public ResponseEntity<Cliente>  buscarPorId(@PathVariable long id) {
        return ResponseEntity.ok(clienteService.buscaPorId(id));
    }

    @PostMapping
    public ResponseEntity<Cliente>  inserir(@RequestBody Cliente  cliente) {
        clienteService.inserir (cliente);
        return ResponseEntity.ok(cliente);
    }

    @PutMapping ("/{id}")
    public ResponseEntity<Cliente>  atualizar(@PathVariable long id, @RequestBody Cliente  cliente) {
        clienteService.atualizar (id, cliente);
        return ResponseEntity.ok(cliente); 
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<Cliente>  deletar(@PathVariable long id) {
        clienteService.deletar (id);
        return ResponseEntity.ok().build();   
    }

}