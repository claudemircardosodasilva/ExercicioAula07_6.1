package com.javacodegeeks.patterns.strategypattern;

public class MensagemSabado implements MensagemDoDia {
	public void imprimir() {
		System.out.println("Hoje é sábado.");
	}
}
