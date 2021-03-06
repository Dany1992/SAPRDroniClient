package it.uniroma2.saprClient.view;


import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;


public class Pilot {
	
	@NotNull
	protected String name;
	@NotNull
	protected String surname;
	@NotNull
	protected String nation;
	@NotNull
	protected String state;
	@NotNull
	protected String licensepilot;
	@NotNull
	protected String taxcode;
	@DateTimeFormat(pattern="dd/MM/yyyy")
	protected String birthdate;
	@NotNull
	protected String residence;
	@NotNull
	protected String phone;
	@NotNull
	protected String mail;
	@NotNull
	protected String password;
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
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getLicensepilot() {
		return licensepilot;
	}
	public void setLicensepilot(String licensepilot) {
		this.licensepilot = licensepilot;
	}
	public String getTaxcode() {
		return taxcode;
	}
	public void setTaxcode(String taxcode) {
		this.taxcode = taxcode;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getResidence() {
		return residence;
	}
	public void setResidence(String residence) {
		this.residence = residence;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
