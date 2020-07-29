package practice.java.designpattern;

public class BuilderExample {

    public static void main(String[] args) {
	Person person = new Person.Builder("Albin", "Perez").addSurName("Ortiz").build();
    }

    static class Person {
	private String name;
	private String lastName;
	private String surName;

	private Person(Builder builder) {
	    name = builder.name;
	    lastName = builder.lastName;
	    surName = builder.surName;
	}

	static class Builder {
	    private String name;
	    private String lastName;
	    private String surName;

	    public Builder(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	    }

	    public Builder addSurName(String surName) {
		this.surName = surName;
		return this;
	    }

	    public Person build() {
		return new Person(this);
	    }
	}
    }
}
