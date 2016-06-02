package com.tan.bean;

public class User {
	private String username;
	private String password;
	private String nickname;
	private String gender;
	private String email;
	private String address;
	private String profession;
	private String birthday;
	private String phone;

	public User(String username, String password, String nickname,
			String gender, String email, String address, String profession,
			String birthday, String phone) {
		super();
		this.username = username;
		this.password = password;
		this.nickname = nickname;
		this.gender = gender;
		this.email = email;
		this.address = address;
		this.profession = profession;
		this.birthday = birthday;
		this.phone = phone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	

}
