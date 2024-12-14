package com.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="Operatori.findAll",query="SELECT c FROM Operatori c")
public class Operatori implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	
	private String name;
	private String surname;
	
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, password, surname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Operatori other = (Operatori) obj;
		return id == other.id && Objects.equals(name, other.name) && Objects.equals(password, other.password)
				&& Objects.equals(surname, other.surname);
	}

	@Override
	public String toString() {
		return "Operatori [id=" + id + ", name=" + name + ", surname=" + surname + ", password=" + password + "]";
	}
	
	

	
}
