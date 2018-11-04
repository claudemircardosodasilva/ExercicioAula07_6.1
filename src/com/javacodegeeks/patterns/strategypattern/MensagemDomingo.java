package com.javacodegeeks.patterns.strategypattern;

public class MensagemDomingo implements MensagemDoDia {
	public void imprimir() {
		System.out.println("Hoje é domingo.");
	}
}
