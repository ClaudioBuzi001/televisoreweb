package it.prova.televisoreweb.model;

public class Televisore {

	// Proprieta Di istanza
	private Long id;
	private String marca;
	private String modello;
	private int prezzo;
	private int numeroPollici;
	private String codice;

	public Televisore() {
		super();
	}

	public Televisore(String marca, String modello, int prezzo, int numeroPollici, String codice) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.prezzo = prezzo;
		this.numeroPollici = numeroPollici;
		this.codice = codice;
	}

	public Televisore(Long id, String marca, String modello, int prezzo, int numeroPollici, String codice) {
		super();
		this.id = id;
		this.marca = marca;
		this.modello = modello;
		this.prezzo = prezzo;
		this.numeroPollici = numeroPollici;
		this.codice = codice;
	}

	public Long getIdTelevisore() {
		return id;
	}

	public void setIdTelevisore(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}

	public int getNumeroPollici() {
		return numeroPollici;
	}

	public void setNumeroPollici(int numeroPollici) {
		this.numeroPollici = numeroPollici;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

}
