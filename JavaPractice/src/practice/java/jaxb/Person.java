/**
 * 
 */
package practice.java.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author apobits@gmail.com
 *
 */
@XmlRootElement
public class Person implements Serializable {

    private String name;

    private String lastName;

    private String surName;

    private Integer height;

    private Integer weight;

    private Integer age;

    private String color;

    private String nationality;

    private Boolean isTeenager;

    private List<String> teeth;

    public Person() {
	teeth = new ArrayList<>();
	teeth.add("1");
	teeth.add("2");
	teeth.add("3");
	teeth.add("4");
	teeth.add("5");
    }

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

    /**
     * @return the teeth
     */
    public List<String> getTeeth() {
	return teeth;
    }

    /**
     * @param teeth
     *            the teeth to set
     */
    public void setTeeth(List<String> teeth) {
	this.teeth = teeth;
    }

    @Override
    public String toString() {
	// TODO Auto-generated method stub
	return name + " " + lastName + " " + surName;
    }

}
