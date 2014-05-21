package br.gov.sp.sorocaba.comunique.dominio;

import java.io.Serializable;

public interface Identity<K extends Serializable> extends Serializable {

	public K getId();

	public void setId(K id);

}
