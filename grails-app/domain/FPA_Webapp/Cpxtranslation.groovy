package FPA_Webapp

import org.apache.commons.lang.builder.EqualsBuilder
import org.apache.commons.lang.builder.HashCodeBuilder

class Cpxtranslation implements Serializable {

	Integer id
	String type
	Integer complexity
	Integer ufp

	int hashCode() {
		def builder = new HashCodeBuilder()
		builder.append id
		builder.append type
		builder.append complexity
		builder.append ufp
		builder.toHashCode()
	}

	boolean equals(other) {
		if (other == null) return false
		def builder = new EqualsBuilder()
		builder.append id, other.id
		builder.append type, other.type
		builder.append complexity, other.complexity
		builder.append ufp, other.ufp
		builder.isEquals()
	}

	static mapping = {
		id composite: ["id", "type", "complexity", "ufp"]
		version false
	}

	static constraints = {
		id nullable: true
		type nullable: true, maxSize: 20
		complexity nullable: true
		ufp nullable: true
	}
}
