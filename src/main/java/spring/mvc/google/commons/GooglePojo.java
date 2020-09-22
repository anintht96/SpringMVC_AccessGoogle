package spring.mvc.google.commons;

public class GooglePojo {

	private String id;
	private String name;
	private String email;
	private String verified_email;
	private String given_name;
	private String family_name;
	private String link;
	private String picture;
	private String locale;

	public GooglePojo() {
		super();
	}

	public GooglePojo(String id, String name, String email, String verified_email, String given_name,
			String family_name, String link, String picture) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.verified_email = verified_email;
		this.given_name = given_name;
		this.family_name = family_name;
		this.link = link;
		this.picture = picture;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getVerified_email() {
		return verified_email;
	}

	public void setVerified_email(String verified_email) {
		this.verified_email = verified_email;
	}

	public String getGiven_name() {
		return given_name;
	}

	public void setGiven_name(String given_name) {
		this.given_name = given_name;
	}

	public String getFamily_name() {
		return family_name;
	}

	public void setFamily_name(String family_name) {
		this.family_name = family_name;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	@Override
	public String toString() {
		return "GooglePojo [id=" + id + ", name=" + name + ", email=" + email + ", verified_email=" + verified_email
				+ ", given_name=" + given_name + ", family_name=" + family_name + ", link=" + link + ", picture="
				+ picture + "]";
	}

}
