/**
 * 
 */
package ortiz.perez.albin.finalx;

/**
 * @author apobits@gmail.com
 *
 */
public class ArrayListHolderUser {

    private final ArrayListHolder people;

    public ArrayListHolderUser() {
	people = new ArrayListHolder();
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
	ArrayListHolderUser user = new ArrayListHolderUser();
	user.people.add(1, "Albin");
	System.out.println(user.people.get(1));

    }

}
