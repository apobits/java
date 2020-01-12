package code.wars;

public class Dubstep {

    public static void main(String[] args) {
	System.out.println(SongDecoder("RWUBWUBWUBLWUB"));
    }

    public static String SongDecoderOld(String song) {
	var words = song.split("WUB");
	StringBuilder stringBuilder = new StringBuilder();
	for (int i = 0; i < words.length; i++) {
	    if (!words[i].equals("WUB") && !words[i].equals("")) {
		stringBuilder.append(words[i]);
		if (i + 1 != words.length) {
		    stringBuilder.append(" ");
		}
	    }
	}
	return stringBuilder.toString();
    }

    public static String SongDecoder(String song) {
	return song.replaceAll("WUB", " ").trim();
    }

}
