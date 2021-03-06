package br.ufjf.dcc193.trb2lucas_rodrigo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * Revisao
 */
@Entity
public class Revisao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "REVISAO_ID")
    private Integer id;
    @ManyToOne
    private Avaliador avaliador;
    @ManyToOne
    private Trabalho trabalho;
    @Min(0)
    @Max(100)
    private Integer nota;
    private String descricao;
    @Enumerated
    private EnumStatus status;

    public Revisao() {
    }

    public Revisao(Integer id, Avaliador avaliador, Trabalho trabalho, Integer nota, String descricao,
            EnumStatus status) {
        this.id = id;
        this.avaliador = avaliador;
        this.trabalho = trabalho;
        this.nota = nota;
        this.descricao = descricao;
        this.status = status;
    }

    /**
     * @return the avaliador
     */
    public Avaliador getAvaliador() {
        return avaliador;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @return the nota
     */
    public Integer getNota() {
        return nota;
    }

    /**
     * @return the status
     */
    public EnumStatus getStatus() {
        return status;
    }

    /**
     * @return the trabalho
     */
    public Trabalho getTrabalho() {
        return trabalho;
    }

    /**
     * @param avaliador the avaliador to set
     */
    public void setAvaliador(Avaliador avaliador) {
        this.avaliador = avaliador;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(Integer nota) {
        this.nota = nota;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(EnumStatus status) {
        this.status = status;
    }

    /**
     * @param trabalho the trabalho to set
     */
    public void setTrabalho(Trabalho trabalho) {
        this.trabalho = trabalho;
    }

}