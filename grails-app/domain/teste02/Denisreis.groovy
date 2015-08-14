package teste02

class Denisreis {
	String nome
	String cpf
	Integer mac
	String tipo 
	
			static constraints = {
				nome nullable:false, blank:false
				cpf nullable:false, blank:false, maxlenght5:true
				mac nullable:false, blank:false
				tipo nullable:false, blank:false				
			}
		}
		
