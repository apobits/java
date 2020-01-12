package code.wars;

public class DisemvowelTrolls {
    public static String disemvowel(String str) {
	return str.replaceAll("[aeiouAEIOU]+", "");
    }

    public static void main(String[] args) {
	System.out.println(disemvowel("This website is for losers LOL!"));
    }
}
