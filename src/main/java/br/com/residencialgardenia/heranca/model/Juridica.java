package br.com.residencialgardenia.heranca.model;

	import javax.persistence.Entity;
	import javax.persistence.PrimaryKeyJoinColumn;
	
	@Entity
	@PrimaryKeyJoinColumn(name="codigo")
	public class Juridica extends Pessoa{
	
		private static final long serialVersionUID = 1L;
		
		private String cnpj;
		private String razaoSocial;
		
		public String getCnpj() {
			return cnpj;
		}
		public void setCnpj(String cnpj) {
			this.cnpj = cnpj;
		}
		public String getRazaoSocial() {
			return razaoSocial;
		}
		public void setRazaoSocial(String razaoSocial) {
			this.razaoSocial = razaoSocial;
		}
	
	}
