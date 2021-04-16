package br.com.bandtec.projetojpa03.repositorio;

import br.com.bandtec.projetojpa03.dominio.Lutador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LutadorRepository  extends JpaRepository<Lutador, Integer> {

    List<Lutador> findByDiretor(String diretor);

    List<Lutador> findByDiretorAndClassico(String diretor, boolean classico);

    List<Lutador> findByClassicoTrue();

    List<Lutador> findByDiretorContainsAndClassico(String diretor, boolean classico);

}
