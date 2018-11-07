/**
 * 
 */
package practice.java.test;

import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author aposo
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList<Place> places = new LinkedList<>();
		try (Scanner scanner = new Scanner(System.in)) {
			String command = "Execute";
			while (!(command = scanner.next()).equalsIgnoreCase("exit")) {
				Place place = new Place(command);
				int index = places.lastIndexOf(place);
				if (index != -1) {
					Place temp = places.get(index);
					temp.setVisits(temp.getVisits() + 1);
				} else {
					places.add(place);
				}
			}
		}
		places.sort((s, t) -> s.getVisits() - t.getVisits());
		System.out.println(places.getLast().getLocation() + " " + places.getLast().getVisits());
	}
}

class Place implements Comparable<Place> {
	private String location;
	private Date visitDate;
	private int visits;

	public int getVisits() {
		return visits;
	}

	public void setVisits(int visits) {
		this.visits = visits;
	}

	public Place(String location) {
		this.location = location;
		visitDate = new Date();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.location.equals(((Place) obj).location);
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getVisitDate() {
		return visitDate;
	}

	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}

	@Override
	public int compareTo(Place o) {
		// TODO Auto-generated method stub
		return location.compareTo(o.location);
	}
}
