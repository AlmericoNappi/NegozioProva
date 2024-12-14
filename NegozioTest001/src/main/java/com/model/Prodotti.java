package com.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Prodotti.findAll", query = "SELECT c FROM Prodotti c")
public class Prodotti implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int code;

	private int internalCode;

	private String brand;
	private String stile;
	private String coloreTomaia;
	private String coloreDettagli;
	private String coloreSuola;
	private String materiale;
	private String versione;
	private String stagione;
	private int prezzoCosto;
	private int prezzoVendita;
	private String tagliaONumero;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getInternalCode() {
		return internalCode;
	}

	public void setInternalCode(int internalCode) {
		this.internalCode = internalCode;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getStile() {
		return stile;
	}

	public void setStile(String stile) {
		this.stile = stile;
	}

	public String getColoreTomaia() {
		return coloreTomaia;
	}

	public void setColoreTomaia(String coloreTomaia) {
		this.coloreTomaia = coloreTomaia;
	}

	public String getColoreDettagli() {
		return coloreDettagli;
	}

	public void setColoreDettagli(String coloreDettagli) {
		this.coloreDettagli = coloreDettagli;
	}

	public String getColoreSuola() {
		return coloreSuola;
	}

	public void setColoreSuola(String coloreSuola) {
		this.coloreSuola = coloreSuola;
	}

	public String getMateriale() {
		return materiale;
	}

	public void setMateriale(String materiale) {
		this.materiale = materiale;
	}

	public String getVersione() {
		return versione;
	}

	public void setVersione(String versione) {
		this.versione = versione;
	}

	public String getStagione() {
		return stagione;
	}

	public void setStagione(String stagione) {
		this.stagione = stagione;
	}

	public int getPrezzoCosto() {
		return prezzoCosto;
	}

	public void setPrezzoCosto(int prezzoCosto) {
		this.prezzoCosto = prezzoCosto;
	}

	public int getPrezzoVendita() {
		return prezzoVendita;
	}

	public void setPrezzoVendita(int prezzoVendita) {
		this.prezzoVendita = prezzoVendita;
	}

	public String getTagliaONumero() {
		return tagliaONumero;
	}

	public void setTagliaONumero(String tagliaONumero) {
		this.tagliaONumero = tagliaONumero;
	}

	@Override
	public String toString() {
		return "Prodotti [code=" + code + ", internalCode=" + internalCode + ", brand=" + brand + ", stile=" + stile
				+ ", coloreTomaia=" + coloreTomaia + ", coloreDettagli=" + coloreDettagli + ", coloreSuola="
				+ coloreSuola + ", materiale=" + materiale + ", versione=" + versione + ", stagione=" + stagione
				+ ", prezzoCosto=" + prezzoCosto + ", prezzoVendita=" + prezzoVendita + ", tagliaONumero="
				+ tagliaONumero + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, code, coloreDettagli, coloreSuola, coloreTomaia, internalCode, materiale,
				prezzoCosto, prezzoVendita, stagione, stile, tagliaONumero, versione);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prodotti other = (Prodotti) obj;
		return Objects.equals(brand, other.brand) && code == other.code
				&& Objects.equals(coloreDettagli, other.coloreDettagli)
				&& Objects.equals(coloreSuola, other.coloreSuola) && Objects.equals(coloreTomaia, other.coloreTomaia)
				&& internalCode == other.internalCode && Objects.equals(materiale, other.materiale)
				&& prezzoCosto == other.prezzoCosto && prezzoVendita == other.prezzoVendita
				&& Objects.equals(stagione, other.stagione) && Objects.equals(stile, other.stile)
				&& Objects.equals(tagliaONumero, other.tagliaONumero) && Objects.equals(versione, other.versione);
	}

}
