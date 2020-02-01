package code.wars;

import java.util.stream.Stream;

public class ShortestWord {
    public static void main(String[] args) {
	System.out.println(findShort("bitcoin take over the world maybe who knows perhaps"));
    }

    public static int findShort(String s) {
	return Stream.of(s.split(" ")).mapToInt(t -> t.length()).min().orElse(0);
    }
}
