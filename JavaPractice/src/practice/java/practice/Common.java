package practice.java.practice;

public class Common {
    static StringBuilder stringBuilder = new StringBuilder();

    public static void printSomething() {

	try {
	    stringBuilder.append("Hello");
	    Thread.sleep(1000);
	    stringBuilder.append("there");
	    Thread.sleep(1000);
	    stringBuilder.append("how");
	    Thread.sleep(1000);
	    stringBuilder.append("are");
	    Thread.sleep(1000);
	    stringBuilder.append("you");
	    Thread.sleep(1000);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
	System.out.println(stringBuilder);
    }

    //    public static int getNext(){
    //
    //    }

}
