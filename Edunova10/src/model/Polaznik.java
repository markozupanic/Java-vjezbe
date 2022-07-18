package model;

import java.math.BigDecimal;

public class Polaznik extends Osoba {

	
	private BigDecimal naknada;
	private BigDecimal prijvoz;
	private BigDecimal ulaznica;
	
	public Polaznik(int sifra, String ime, String prezime, BigDecimal naknada, BigDecimal prijvoz,
			BigDecimal ulaznica) {
		super(sifra, ime, prezime);
		this.naknada = naknada;
		this.prijvoz = prijvoz;
		this.ulaznica = ulaznica;
	}
	public Polaznik() {
		super();
	}
	public BigDecimal getNaknada() {
		return naknada;
	}
	public void setNaknada(BigDecimal naknada) {
		this.naknada = naknada;
	}
	public BigDecimal getPrijvoz() {
		return prijvoz;
	}
	public void setPrijvoz(BigDecimal prijvoz) {
		this.prijvoz = prijvoz;
	}
	public BigDecimal getUlaznica() {
		return ulaznica;
	}
	public void setUlaznica(BigDecimal ulaznica) {
		this.ulaznica = ulaznica;
	}
	@Override
	public BigDecimal getUkupno() {
		
		return naknada.add(prijvoz).add(ulaznica);
	}
	
	
	
	
	
	
	
}
