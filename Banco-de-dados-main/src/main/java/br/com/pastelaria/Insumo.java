package br.com.pastelaria;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue; 
import jakarta.persistence.GenerationType; 
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;



@Entity
@Table(name = "insumos") 
public class Insumo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "cod_insumo")
    private Integer codInsumo;

    @Column(name = "nome_insumo")
    private String nomeInsumo;

    private String fornecedor;

    private String medida;

    @Column(name = "valor_inicial")
    private BigDecimal valorInicial;

    public Insumo() {}

    // Getters e Setters
    public Integer getCodInsumo() {
        return codInsumo;
    }

    public void setCodInsumo(Integer codInsumo) {
        this.codInsumo = codInsumo;
    }

    public String getNomeInsumo() {
        return nomeInsumo;
    }

    public void setNomeInsumo(String nomeInsumo) {
        this.nomeInsumo = nomeInsumo;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public BigDecimal getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(BigDecimal valorInicial) {
        this.valorInicial = valorInicial;
    }
}
