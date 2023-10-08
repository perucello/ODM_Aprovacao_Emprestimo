package com.odm.educaciencia.emprestimo;

/* ********************************************************************** 
*************** PROJETO EDUUCACIENCIA ***********************************
*************************************************************************
****** Data: 07/10/2023
****** Projeto: APROVACAO EMPRESTIMO
****** Versão: 1.0
****** Atualização: 07/10/2023
************************************************************************/

public class Response {
	public String statusResponse;
	public String riscoResponse;
	public String observacaoResponse;
	public boolean aprovado = false;

	public Response() {
		super();
	}

	public Response(String statusResponse, String riscoResponse, String observacaoResponse, boolean aprovado) {
		super();
		this.statusResponse = statusResponse;
		this.riscoResponse = riscoResponse;
		this.observacaoResponse = observacaoResponse;
		this.aprovado = aprovado;
	}

	public String getStatusResponse() {
		return statusResponse;
	}

	public void setStatusResponse(String statusResponse) {
		this.statusResponse = statusResponse;
	}

	public String getRiscoResponse() {
		return riscoResponse;
	}

	public void setRiscoResponse(String riscoResponse) {
		this.riscoResponse = riscoResponse;
	}

	public String getObservacaoResponse() {
		return observacaoResponse;
	}

	public void setObservacaoResponse(String observacaoResponse) {
		this.observacaoResponse = observacaoResponse;
	}

	public boolean isAprovado() {
		return aprovado;
	}

	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}

}
