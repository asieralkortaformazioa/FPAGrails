package FPA_Webapp

import org.apache.commons.lang.builder.EqualsBuilder
import org.apache.commons.lang.builder.HashCodeBuilder

class Complexity implements Serializable {

	Integer id
	String description

	int hashCode() {
		def builder = new HashCodeBuilder()
		builder.append id
		builder.append description
		builder.toHashCode()
	}

	boolean equals(other) {
		if (other == null) return false
		def builder = new EqualsBuilder()
		builder.append id, other.id
		builder.append description, other.description
		builder.isEquals()
	}

	static mapping = {
		id composite: ["id", "description"]
		version false
	}

	static constraints = {
		id nullable: true
		description nullable: true, maxSize: 20
	}
}
