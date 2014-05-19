package br.gov.sp.sorocaba.comunique.dominio;

public enum ProcessoSituacao {
	T("Tramitando");

	private ProcessoSituacao(String label) {
		this.label = label;
	}

	private String label;

	public String getLabel() {
		return label;
	}

}
