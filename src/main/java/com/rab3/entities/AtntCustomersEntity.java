package com.rab3.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "atntcustomers")

public class AtntCustomersEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;

	@Column(name = "Name")
	private String name;

	@Column(name = "ContactName")
	private String contactName;

	@Column(name = "Address")
	private String address;

	@Column(name = "City")
	private String city;

	@Column(name = "Zip_code")
	private Integer zip_Code;

	@Column(name = "Country")
	private String country;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getZip_Code() {
		return zip_Code;
	}

	public void setZip_Code(Integer zip_Code) {
		this.zip_Code = zip_Code;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "AtntCustomersEntity [Id=" + Id + ", name=" + name + ", contactName=" + contactName + ", address="
				+ address + ", city=" + city + ", zip_Code=" + zip_Code + ", country=" + country + "]";
	}

}
