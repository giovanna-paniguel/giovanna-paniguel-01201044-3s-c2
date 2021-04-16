package br.com.bandtec.projetojpa03.dominio;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Lutador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    @Size(min = 3, max = 12)
    private String nome;

    @NotNull
    private Double forcaGolpe;

    @Positive
    @NotNull
    private Double vida;

    @PositiveOrZero
    private Integer concentracoesRealizadas;

    private Boolean vivo;

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getForcaGolpe() {
        return forcaGolpe;
    }

    public Double getVida() {
        return vida;
    }

    public Integer getConcentracoesRealizadas() {
        return concentracoesRealizadas;
    }

    public Boolean getVivo() {
        return vivo;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setForcaGolpe(Double forcaGolpe) {
        this.forcaGolpe = forcaGolpe;
    }

    public void setVida(Double vida) {
        this.vida = vida;
    }

    public void setConcentracoesRealizadas(Integer concentracoesRealizadas) {
        this.concentracoesRealizadas = concentracoesRealizadas;
    }

    public void setVivo(Boolean vivo) {
        this.vivo = vivo;
    }
}
