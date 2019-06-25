/**
 * 
 */
package practice.java.serialization;

import java.io.Serializable;

/**
 * @author apobits@gmail.com
 *
 */
@SuppressWarnings("serial")
public class Person implements Serializable {

//this property should only be used when saving the serialized object, when not persisting use @SuppressWarnings("serial")
//	private static final long serialVersionUID = 1L;

	private String name;

	private String lastName;

	private String surName;

	private Integer height;

	private Integer weight;

	private Integer age;

	private String color;

	private String nationality;

	private Boolean isTeenager;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Boolean getIsTeenager() {
		return isTeenager;
	}

	public void setIsTeenager(Boolean isTeenager) {
		this.isTeenager = isTeenager;
	}

	private PhoneWrapper phoneWrapper;

	public PhoneWrapper getPhoneWrapper() {
		return phoneWrapper;
	}

	public void setPhoneWrapper(PhoneWrapper phoneWrapper) {
		this.phoneWrapper = phoneWrapper;
	}

}
