package br.eti.gigi.garagem.services;

import br.eti.gigi.garagem.entities.Veiculo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.eti.gigi.garagem.repositories.GaragemRepository;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

/**
 *
 * @author sesideva
 */
@Service
public class GaragemService {
    
    @Autowired
    private GaragemRepository garagemRepository;
    
    public List<Veiculo> findAll () {
        
        List<Veiculo>result  = garagemRepository.findAll();
        return result;
    }
    public List<Veiculo> findById(long id) {
        List<Veiculo> result = garagemRepository.findById(id);
        return result;
    }
}
