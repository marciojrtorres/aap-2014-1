package persistencia;

public class Contato { // ENTIDADE

	// preferencialmente usamos objetos (wrapper) em vez de primitivos
	// Integer em vez de int
	// Double em vez de double
	// Boolean em vez de boolean
	
	private Integer id;
	private String nome     = "";
	private String telefone = "";
	private String email    = "";

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contato [id=" + id + ", nome=" + nome + ", telefone="
				+ telefone + ", email=" + email + "]";
	}

	
}
