package teste02

class Oliveira {
	String nome
	String cpf
    static constraints = {
		cpf nullable:false, blank:false
		nome nullable:false, blank:false
    }
}
