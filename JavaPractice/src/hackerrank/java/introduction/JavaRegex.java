package hackerrank.java.introduction;

public class JavaRegex {
    public static void main(String[] args) {
	System.out.println("666.666.23.23".matches(new JavaRegex.MyRegex().pattern));
    }

    static class MyRegex {
	String pattern = "(([0-9]{0,2}|[0-1][0-9]{0,2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]{0,2}|[0-1][0-9]{0,2}|2[0-4][0-9]|25[0-5])";
    }
}


