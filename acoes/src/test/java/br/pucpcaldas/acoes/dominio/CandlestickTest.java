package br.pucpcaldas.acoes.dominio;

import static org.junit.Assert.assertTrue;

import org.joda.time.LocalDate;
import org.junit.Test;

public class CandlestickTest {

    @Test
    public void deveRetornarTrueParaAberturaMenorQueFechamento() {
        // Arranjo
        Candlestick umCandle = new Candlestick(40.0, 50.0, 35.0, 55.0, 1500, LocalDate.now());

        // Ação
        boolean houveAlta = umCandle.isAlta();

        // Asserção
        assertTrue(houveAlta);
    }

    @Test
    public void deveRetornarTrueParaAberturaMaiorQueFechamento() {
        // Arranjo
        Candlestick umCandle = new Candlestick(50.0, 40.0, 35.0, 55.0, 1500, LocalDate.now());

        // Ação
        boolean houveUmaBaixa = umCandle.isBaixa();

        // Asserção
        assertTrue(houveUmaBaixa);
    }
}
