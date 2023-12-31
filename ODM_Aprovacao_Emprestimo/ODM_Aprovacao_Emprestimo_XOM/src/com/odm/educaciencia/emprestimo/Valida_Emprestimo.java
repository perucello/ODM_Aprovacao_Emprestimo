package com.odm.educaciencia.emprestimo;

/* ********************************************************************** 
*************** PROJETO EDUUCACIENCIA ***********************************
*************************************************************************
****** Data: 07/10/2023
****** Projeto: APROVACAO EMPRESTIMO
****** Vers�o: 1.0
****** Atualiza��o: 07/10/2023
************************************************************************/

public class Valida_Emprestimo {

	public String nomeValidaSolicitante;
	public int idadeValidaSolicitante;
	public double valorValidaSolicitado;

	public Valida_Emprestimo() {
		super();
	}

	public Valida_Emprestimo(String nomeValidaSolicitante, int idadeValidaSolicitante, double valorValidaSolicitado) {
		super();
		this.nomeValidaSolicitante = nomeValidaSolicitante;
		this.idadeValidaSolicitante = idadeValidaSolicitante;
		this.valorValidaSolicitado = valorValidaSolicitado;
	}

	public String getNomeValidaSolicitante() {
		return nomeValidaSolicitante;
	}

	public void setNomeValidaSolicitante(String nomeValidaSolicitante) {
		this.nomeValidaSolicitante = nomeValidaSolicitante;
	}

	public int getIdadeValidaSolicitante() {
		return idadeValidaSolicitante;
	}

	public void setIdadeValidaSolicitante(int idadeValidaSolicitante) {
		this.idadeValidaSolicitante = idadeValidaSolicitante;
	}

	public double getValorValidaSolicitado() {
		return valorValidaSolicitado;
	}

	public void setValorValidaSolicitado(double valorValidaSolicitado) {
		this.valorValidaSolicitado = valorValidaSolicitado;
	}

}
