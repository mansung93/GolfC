package com.ncs.vo;

// VO(Value Object), DTO(Data Transfer Object)

public class GolferVO {

	private String id;
	private String password;
	private String name;
	private int age;
	private double hcp;
	private String gender;
	private String homeclub;
	private String birthday;
	private String phone;
	private String adress;
	private String lev;
	private int point;
	
	public String getId() {return id;}
	public void setId(String id) {this.id = id;}
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	public double getHcp() {return hcp;}
	public void setHcp(double hcp) {this.hcp = hcp;}
	public String getGender() {return gender;}
	public void setGender(String gender) {this.gender = gender;}
	public String getHomeclub() {return homeclub;}
	public void setHomeclub(String homeclub) {this.homeclub = homeclub;}
	public String getBirthday() {return birthday;}
	public void setBirthday(String birthday) {this.birthday = birthday;}
	public String getPhone() {return phone;}
	public void setPhone(String phone) {this.phone = phone;}
	public String getAdress() {return adress;}
	public void setAdress(String adress) {this.adress = adress;}
	public String getLev() {return lev;}
	public void setLev(String lev) {this.lev = lev;}
	public int getPoint() {return point;}
	public void setPoint(int point) {this.point = point;}
	
	@Override
	public String toString() {
		return "GolferVO [id=" + id + ", password=" + password + ", name=" + name + ", age=" + age + ", hcp=" + hcp
				+ ", gender=" + gender + ", homeclub=" + homeclub + ", birthday=" + birthday + ", phone=" + phone
				+ ", adress=" + adress + ", lev=" + lev + ", point=" + point + "]";
	}
	
} // GolferVO
