package code.wars;

import java.time.LocalDate;

public class CenturyFromYear {
    public static void main(String[] args) {
	System.out.println("Current century: " + century(LocalDate.now().getYear()));
    }

    public static int century(int number) {
	return number % 100 == 0 ? number / 100 : number / 100 + 1;
    }

}
