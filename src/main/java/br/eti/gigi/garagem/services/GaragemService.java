package br.eti.gigi.garagem.services;

import br.eti.gigi.garagem.DTO.VeiculoDTO;
import br.eti.gigi.garagem.entities.Veiculo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.eti.gigi.garagem.repositories.GaragemRepository;
import java.util.ArrayList;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

/**
 *
 * @author sesideva
 */
@Service
public class GaragemService {

    @Autowired
    private GaragemRepository garagemRepository;

    public List<Veiculo> findAll() {

        List<Veiculo> result = garagemRepository.findAll();
        return result;
    }

    public List<Veiculo> findById(long id) {
        List<Veiculo> result = garagemRepository.findById(id);
        return result;
    }

    public List<VeiculoDTO> findByCorIgnoreCase(String cor) {

        List<Veiculo> resultVeiculo = garagemRepository.findByCorIgnoreCase(cor);

        List<VeiculoDTO> resultDTO = resultVeiculo.stream()
                .map(x -> new VeiculoDTO(x)).toList();
        return resultDTO;
    }

}
