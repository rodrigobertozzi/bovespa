package br.pucpcaldas.acoes.dominio;

import static org.junit.Assert.assertEquals;

import org.joda.time.LocalDate;
import org.junit.Test;

public class NegocioTest {
    
    @Test
    public void deveRetornarMultiplicacaoDoPrecoPelaQuantidade(){
        // Arranjo
        Negocio umNegocio = new Negocio(1.5, 4, LocalDate.now());
        
        // Ação
        double volumeCalculado = umNegocio.getVolume();
        
        // Asserção
        assertEquals(1.5 * 4, volumeCalculado, 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void deveRetornarUmaExcecaoUmNegocioComDataNula()
    {
        //Arranjo, Ação e Asserção
        Negocio umNegocio = new Negocio(1.5, 4, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void deveRetornarUmaExcecaoComPrecoNegativo()
    {
        //Arranjo, Ação e Asserção
        Negocio umNegocio = new Negocio(-1.5, 4, LocalDate.now());
    }

    @Test(expected = IllegalArgumentException.class)
    public void deveRetornarUmaExcecaoComPrecoZero()
    {
        //Arranjo, Ação e Asserção
        Negocio umNegocio = new Negocio(0, 4, LocalDate.now());
    }
}
