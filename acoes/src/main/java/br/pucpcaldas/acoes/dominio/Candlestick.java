package br.pucpcaldas.acoes.dominio;

import org.joda.time.LocalDate;

/**
 * Um objeto da classe <code>Candlestick</code> armazena o preço minimo, o preço
 * maximo, de abertura, de fechamento, volume e data a partir de uma coleçao de
 * objetos da classe <code>Negocio</code>
 * 
 * @author Rodrigo Bertozzi
 * @since 2020-03-04
 * @version 1.0
 * @see Negocio
 */
public class Candlestick {

    private final double abertura;
    private final double fechamento;
    private final double minimo;
    private final double maximo;
    private final double volume;
    private final LocalDate data;

    /**
     * Construtor da classe
     * 
     * @param abertura   Preço de abertura
     * @param fechamento Preço de fechamento
     * @param minimo     Preço Minimo
     * @param maximo     Preço Máximo
     * @param volume     Volume negociado
     * @param data       Data da negociação
     */
    public Candlestick(double abertura, double fechamento, double minimo, double maximo, double volume,
            LocalDate data) {
        if(minimo > maximo)
                throw new IllegalArgumentException("Preço Maximo não pode ser menor que preço minimo");
        this.abertura = abertura;
        this.fechamento = fechamento;
        this.minimo = minimo;
        this.maximo = maximo;
        this.volume = volume;
        this.data = data;
    }

    /**
     * Retorna o preço de abertura
     * 
     * @return preço de abertura
     */
    public double getAbertura() {
        return abertura;
    }

    /**
     * Retorna o preço de fechamento
     * 
     * @return preço de fechamento
     */
    public double getFechamento() {
        return fechamento;
    }

    /**
     * Retorna o preço de minimo
     * 
     * @return preço de minimo
     */
    public double getMinimo() {
        return minimo;
    }

    /**
     * Retorna o preço de maximo
     * 
     * @return preço de maximo
     */
    public double getMaximo() {
        return maximo;
    }

    /**
     * Retorna o volume negociado
     * 
     * @return volume negociado
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Retorna a data da negociação
     * 
     * @return data da negociação
     */
    public LocalDate getData() {
        return data;
    }

	public boolean isAlta() {
		return this.abertura < this.fechamento;
	}

	public boolean isBaixa() {
		return this.abertura > this.fechamento;
	}


}
