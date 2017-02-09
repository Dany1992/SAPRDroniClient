package it.uniroma2.saprClient.view;

public class LoginBean {
	String license;
	
	String password;

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginBean [license=" + license + ", password=" + password + "]";
	}
	

}
