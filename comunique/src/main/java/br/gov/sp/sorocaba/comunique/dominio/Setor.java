package br.gov.sp.sorocaba.comunique.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "setoresoriginal")
public class Setor extends BaseEntity<Integer>{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	@Id
	@Column(name="setCodigo")
	private Integer id;
	
	
	
	@Column(name="setCodSetor")
	private String codigoSetor;
	
	
	@Column(name="setCodSec")
	private String codigoSecretaria;
	
	

	@Column(name="setCodDiv")
	private String codigoDivisao;
	

	@Column(name="setNomeSet")
	private String nomeSetor;
	
	
	@Column(name="setEndSetor")
	private String enderecoSetor;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(String codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public String getCodigoSecretaria() {
		return codigoSecretaria;
	}

	public void setCodigoSecretaria(String codigoSecretaria) {
		this.codigoSecretaria = codigoSecretaria;
	}

	public String getCodigoDivisao() {
		return codigoDivisao;
	}

	public void setCodigoDivisao(String codigoDivisao) {
		this.codigoDivisao = codigoDivisao;
	}

	public String getNomeSetor() {
		return nomeSetor;
	}

	public void setNomeSetor(String nomeSetor) {
		this.nomeSetor = nomeSetor;
	}

	public String getEnderecoSetor() {
		return enderecoSetor;
	}

	public void setEnderecoSetor(String enderecoSetor) {
		this.enderecoSetor = enderecoSetor;
	}
	
	
	
	
}
