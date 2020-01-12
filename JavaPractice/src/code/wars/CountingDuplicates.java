package code.wars;

public class CountingDuplicates {

    public static void main(String[] args) {
	System.out.println(duplicateCount("Indivisibilities"));
    }

    public static int duplicateCount(String text) {
        var lowerCaseText = text.toLowerCase();
	return (int) lowerCaseText.chars().filter(t -> lowerCaseText.indexOf(t) != lowerCaseText.lastIndexOf(t)).distinct().count();
    }

}
