package FPA_Webapp

import org.apache.commons.lang.builder.EqualsBuilder
import org.apache.commons.lang.builder.HashCodeBuilder

class Complexitymatrix implements Serializable {

	Integer id
	String type
	Integer horizontallowlimit
	Integer horizontaltoplimit
	Integer verticallowlimit
	Integer verticaltoplimit
	Integer complexity

	int hashCode() {
		def builder = new HashCodeBuilder()
		builder.append id
		builder.append type
		builder.append horizontallowlimit
		builder.append horizontaltoplimit
		builder.append verticallowlimit
		builder.append verticaltoplimit
		builder.append complexity
		builder.toHashCode()
	}

	boolean equals(other) {
		if (other == null) return false
		def builder = new EqualsBuilder()
		builder.append id, other.id
		builder.append type, other.type
		builder.append horizontallowlimit, other.horizontallowlimit
		builder.append horizontaltoplimit, other.horizontaltoplimit
		builder.append verticallowlimit, other.verticallowlimit
		builder.append verticaltoplimit, other.verticaltoplimit
		builder.append complexity, other.complexity
		builder.isEquals()
	}

	static mapping = {
		id composite: ["id", "type", "horizontallowlimit", "horizontaltoplimit", "verticallowlimit", "verticaltoplimit", "complexity"]
		version false
	}

	static constraints = {
		id nullable: true
		type nullable: true, maxSize: 20
		horizontallowlimit nullable: true
		horizontaltoplimit nullable: true
		verticallowlimit nullable: true
		verticaltoplimit nullable: true
		complexity nullable: true
	}
}
