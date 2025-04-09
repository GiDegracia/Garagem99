package br.eti.gigi.garagem.controllers;

import br.eti.gigi.garagem.DTO.VeiculoDTO;
import br.eti.gigi.garagem.entities.Veiculo;
import br.eti.gigi.garagem.services.GaragemService;
import java.util.List;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    
    @GetMapping("/forsale")
    public List<Veiculo> findAll() {
        List<Veiculo> result = garagemService.findAll();
        return result;
    }
    @GetMapping("/forsale/{id}")
    public ResponseEntity<List<Veiculo>> findById(@PathVariable Long id) {
        List<Veiculo> result = garagemService.findById(id);
       
        
    if (result.isEmpty()){
        return ResponseEntity.notFound().build();
    
    } else {
        return ResponseEntity.ok(result);
    }
    
    }
    @GetMapping("/cor/{cor}")
    public ResponseEntity<List<VeiculoDTO>> findByCorIgnoreCase(@PathVariable String cor) {
        
        List<VeiculoDTO> result = garagemService.findByCorIgnoreCase(cor);
        if (result.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(result);
        }
    }
}
