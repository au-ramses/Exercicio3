package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import calculaValor.CalculaValorNumero;

public class CalculaValorNumeroTest {

	CalculaValorNumero novoCalculo;
	
	@Before
	public void setUp() throws Exception{
		novoCalculo = new CalculaValorNumero();
	}
	
	@Test
	public void CalculaValorNumeroQuadradoTestNumeroZero() {
		assertEquals(0, novoCalculo.CalculaValorNumeroQuadrado(0.0),0.1);
	}
	
	@Test
	public void CalculaValorNumeroQuadradoTestNumeroPequenoPositivo() {
		assertEquals(4, novoCalculo.CalculaValorNumeroQuadrado(2.0),0.1);
	}
	
	@Test
	public void CalculaValorNumeroQuadradoTestNumeroGrandePositivo() {
		assertEquals(1000000000000.0, novoCalculo.CalculaValorNumeroQuadrado(1000000.0),0.1);
	}
	
	@Test
	public void CalculaValorNumeroQuadradoTestNumeroPequenoNegativo() {
		assertEquals(4.0, novoCalculo.CalculaValorNumeroQuadrado(-2.0),0.1);
	}
	
	@Test
	public void CalculaValorNumeroQuadradoTestNumeroGrandaNegativo() {
		assertEquals(1000000000000.0, novoCalculo.CalculaValorNumeroQuadrado(-1000000.0),0.1);
	}
	
	@Test
	public void CalculaValorNumeroCuboTestNumeroZero() {
		assertEquals(0, novoCalculo.CalculaValorNumeroCubo(0.0),0.1);
	}
	
	@Test
	public void CalculaValorNumeroCuboTestNumeroPequenoPositivo() {
		assertEquals(8, novoCalculo.CalculaValorNumeroCubo(2.0),0.1);
	}
	
	@Test
	public void CalculaValorNumeroCuboTestNumeroGrandePositivo() {
		assertEquals(1000000000000000000.0, novoCalculo.CalculaValorNumeroCubo(1000000.0),0.1);
	}
	
	@Test
	public void CalculaValorNumeroCuboTestNumeroPequenoNegativo() {
		assertEquals(-8.0, novoCalculo.CalculaValorNumeroCubo(-2.0),0.1);
	}
	
	@Test
	public void CalculaValorNumeroCuboTestNumeroGrandaNegativo() {
		assertEquals(-1000000000000000000.0, novoCalculo.CalculaValorNumeroCubo(-1000000.0),0.1);
	}
	
}
