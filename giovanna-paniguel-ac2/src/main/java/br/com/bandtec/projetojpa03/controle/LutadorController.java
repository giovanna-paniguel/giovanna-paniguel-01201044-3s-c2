package br.com.bandtec.projetojpa03.controle;

import br.com.bandtec.projetojpa03.repositorio.LutadorRepository;
import br.com.bandtec.projetojpa03.dominio.Lutador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/lutadores")
public class LutadorController {
    @Autowired
    private LutadorRepository repository;

    @PostMapping
    public ResponseEntity postLutadores(@RequestBody @Valid Lutador novoLutador) {
        repository.save(novoLutador);
        return ResponseEntity.status(201).build();
    }

}

