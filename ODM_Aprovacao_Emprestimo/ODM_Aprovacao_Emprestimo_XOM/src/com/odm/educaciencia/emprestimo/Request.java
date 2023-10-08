package com.odm.educaciencia.emprestimo;

/* ********************************************************************** 
*************** PROJETO EDUUCACIENCIA ***********************************
*************************************************************************
****** Data: 07/10/2023
****** Projeto: APROVACAO EMPRESTIMO
****** Versão: 1.0
****** Atualização: 07/10/2023
************************************************************************/

public class Request {

	public String nomeSolicitante = "nome nao informado.";
	public int idadeSolicitante = 0;
	public double valorSolicitado = 0.00;

	public Request() {
		super();
	}

	public Request(String nomeSolicitante, int idadeSolicitante, double valorSolicitado) {
		super();
		this.nomeSolicitante = nomeSolicitante;
		this.idadeSolicitante = idadeSolicitante;
		this.valorSolicitado = valorSolicitado;
	}

	public String getNomeSolicitante() {
		return nomeSolicitante;
	}

	public void setNomeSolicitante(String nomeSolicitante) {
		this.nomeSolicitante = nomeSolicitante;
	}

	public int getIdadeSolicitante() {
		return idadeSolicitante;
	}

	public void setIdadeSolicitante(int idadeSolicitante) {
		this.idadeSolicitante = idadeSolicitante;
	}

	public double getValorSolicitado() {
		return valorSolicitado;
	}

	public void setValorSolicitado(double valorSolicitado) {
		this.valorSolicitado = valorSolicitado;
	}

}