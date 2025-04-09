/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.eti.gigi.garagem.repositories;

import br.eti.gigi.garagem.entities.Veiculo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;



/**
 *
 * @author sesideva
 */
public interface GaragemRepository extends JpaRepository<Veiculo, Long> {
    
    List<Veiculo> findById(long Id);
    List<Veiculo> findByCorIgnoreCase(String cor); 
}
