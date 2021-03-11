package br.pucpcaldas.acoes.dominio;

import org.joda.time.LocalDate;

public class Negocio {
    private final double preco;
    private final int quantidade;
    private final LocalDate data;

    /**
     * Construtor da Classe
     * 
     * @param preco      preço da unidade negociada
     * @param quantidade quantidade negociada
     * @param data       data da negociação
     */

    public Negocio(double preco, int quantidade, LocalDate data) {
        if(preco < 0.0)
            throw new IllegalArgumentException("O preço não pode ser negativo");
        if (data == null) 
            throw new IllegalArgumentException("A data não pode ser nula");
        

        this.preco = preco;
        this.quantidade = quantidade;
        this.data = data;
    }

    /**
     * Retorna a data da negociação
     * 
     * @return data da negociação
     */
    public LocalDate getData() {
        return this.data;
    }

    /**
     * Retorna Quantidade negociada
     * 
     * @return Quantidade negociada
     */
    public int getQuantidade() {
        return this.quantidade;
    }

    /**
     * Retorna o preço de cada unidade negociada.
     * 
     * @return preço da unidade negociada
     */
    public double getPreco() {
        return this.preco;
    }

    /**
     * Retorna o volume negociado que é o resultado da multiplicação do preço pela
     * quantidade negociada
     * 
     * @return volume negociado
     */
    public double getVolume() {
        return this.preco * this.quantidade;
    }
}
