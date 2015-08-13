package teste02

class Viana {
	String nome
	String cpf
    static constraints = {nome nullable:false, blank:false, unique:true
    }
}
