package br.gov.sp.sorocaba.comunique.dominio;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;

public abstract class BaseEntity<K extends Serializable> implements Identity<K> {

	private static final long serialVersionUID = 1L;

	public abstract void setId(K id);
	public abstract K getId();

	public boolean equals(Object obj) {

		if (obj == null)
			return false;

		if (!(obj instanceof BaseEntity))
			return false;

		BaseEntity<?> element = (BaseEntity<?>) obj;

		if (this == element)
			return true;

		if (this.getId() == null || element.getId() == null)
			return false;

		return new EqualsBuilder().append(this.getId(), element.getId()).isEquals();
	}

	public int hashCode() {
		return (getId() != null ? getId().hashCode() : super.hashCode());
	}

	@Override
	public String toString() {
		return getClass().getCanonicalName() + "@ID=" +  getId();
	}

}
