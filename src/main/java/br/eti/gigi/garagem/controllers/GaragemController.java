package br.eti.gigi.garagem.controllers;

import br.eti.gigi.garagem.entities.Veiculo;
import br.eti.gigi.garagem.services.GaragemService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sesideva
 */
@RestController
public class GaragemController {
    
    @Autowired
    private GaragemService garagemService; 
    
    @GetMapping("/garagem")
    public List<Veiculo> findAll() {
        List<Veiculo> result = garagemService.findAll();
        return result;
    }
    @GetMapping("/forsale/{id}")
    public List<Veiculo> findById(@PathVariable Long id) {
        List<Veiculo> result = garagemService.findById(id);
        return result;
    }
}
