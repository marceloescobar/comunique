package br.gov.sp.sorocaba.comunique.dominio;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "processos")
public class Processo extends BaseEntity<Integer>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="proCodigo")
	private Integer id;
	
	@Column(name="proProcesso")
	private Integer processo;
	
	@Column(name="proInteressado")
	private String interessado;
	
	@Column(name="proCodigoAssunto")
	private Integer codigoAssunto;
	
	@Column(name="proAssunto")
	private String assunto;
	
	@Column(name="proPortador")
	private String portador;
	
	@Column(name="proDataCadastro")
	@Temporal(TemporalType.DATE)
	private Date dataCadastro;
	
	@Column(name="proSituacao")
	@Enumerated(EnumType.STRING)
	private ProcessoSituacao situacao;
	
	@OneToMany(fetch=FetchType.LAZY)
	@OrderBy("dataEnvio DESC, horaEnvio DESC")
	@JoinColumn(name="traProcesso", referencedColumnName="proProcesso")
	private List<Tramitacao> tramitacoes;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getProcesso() {
		return processo;
	}

	public void setProcesso(Integer processo) {
		this.processo = processo;
	}

	public String getInteressado() {
		return interessado;
	}

	public void setInteressado(String interessado) {
		this.interessado = interessado;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Integer getCodigoAssunto() {
		return codigoAssunto;
	}

	public void setCodigoAssunto(Integer codigoAssunto) {
		this.codigoAssunto = codigoAssunto;
	}

	public String getPortador() {
		return portador;
	}

	public void setPortador(String portador) {
		this.portador = portador;
	}

	public ProcessoSituacao getSituacao() {
		return situacao;
	}

	public void setSituacao(ProcessoSituacao situacao) {
		this.situacao = situacao;
	}

	public List<Tramitacao> getTramitacoes() {
		return tramitacoes;
	}

	public void setTramitacoes(List<Tramitacao> tramitacoes) {
		this.tramitacoes = tramitacoes;
	}
	
	
	
	
}
