package br.unesp.rc.springtutorial.repository;

import br.unesp.rc.springtutorial.entity.Fisica;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Lucas
 */
public interface FisicaRepository extends JpaRepository<Fisica, Long> {

    Fisica findByCpf(String cpf);    

}
