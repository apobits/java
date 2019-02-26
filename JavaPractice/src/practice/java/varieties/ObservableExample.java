/**
 * 
 */
package practice.java.varieties;

import java.util.Observable;
import java.util.Observer;

/**
 * @author apobits@gmail.com
 *
 */
public class ObservableExample {

	static class Person extends Observable {

		Observer observer;

		private String name;

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			// setChanged() and notifyObservers must be called in this strictly order for
			// the update method of the observer to be notified
			setChanged();
			System.out.println("Is changed: " + hasChanged());
			// if notifyObservers with parameter is used, this parameter will be passed as
			// the second parameter of the update method
			notifyObservers(name);
			this.name = name;

			System.out.println("Number of observers: " + countObservers());
			System.out.println("Is changed: " + hasChanged());
			// delete observer
			deleteObserver(observer);
			System.out.println("Number of observers: " + countObservers());
		}

		public Person(String name) {
			this.name = name;
			observer = new PersonObserver();
			addObserver(observer);
		}

	}

	static class PersonObserver implements Observer {

		@Override
		// first parameter is the Object being observed
		// the second parameter is the argument passed in the notifyObservers, if no
		// parameter was sent then null is obtained
		public void update(Observable o, Object arg) {

			System.out.println("Name " + ((Person) o).getName() + " is being changed to " + arg);
		}

	}

	public static void main(String[] args) {
		Person person = new Person("Alvin");
		person.setName("Albin");

	}

}
