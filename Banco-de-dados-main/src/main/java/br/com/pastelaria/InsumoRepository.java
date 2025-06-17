
package br.com.pastelaria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

public interface InsumoRepository extends JpaRepository<Insumo, Integer> {
    List<Insumo> findByNomeInsumoContainingIgnoreCase(String nome);
}