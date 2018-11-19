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
		places.sort(null);
		for (Place p : places) {
			System.out.println(p.getLocation() + " " + p.getVisits() + " " + p.getVisitDate());
		}
	}
}

class Place implements Comparable<Place> {
	private String location;
	private Date visitDate;
	private Integer visits;

	public Place(String location) {
		this.location = location;
		visitDate = new Date();
		visits = Integer.valueOf(1);
	}

	public Integer getVisits() {
		return visits;
	}

	public void setVisits(Integer visits) {
		this.visits = visits;
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
		return o.visits.compareTo(this.visits);
	}
}
