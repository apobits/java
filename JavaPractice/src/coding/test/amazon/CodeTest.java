package coding.test.amazon;

import java.util.*;

public class CodeTest {

    public static void main(String[] args) {
	System.out.println(topNCompetitorsImproved(6, 2,
			Arrays.asList("newshop", "shopnow", "afshion", "fashionbeats", "mymarket", "tcellular"), 6,
			Arrays.asList("newshop is providing good services in the city; everyone should use newshop",
					"best services by newshop", "fashionbeats has great services in the city",
					"i am proud to have fashionbeats", "mymarket has awesome services",
					"thanks newshop for the quick delivery")));

	//	List<List<Integer>> grid = new ArrayList<>();
	//	grid.add(Arrays.asList(0, 1, 1, 0, 1));
	//	grid.add(Arrays.asList(0, 1, 0, 1, 0));
	//	grid.add(Arrays.asList(0, 0, 0, 0, 1));
	//	grid.add(Arrays.asList(0, 1, 0, 0, 0));
	//	System.out.println(minimumHours(4, 5, grid));
    }

    public static ArrayList<String> topNCompetitors(int numCompetitors, int topNCompetitors, List<String> competitors,
		    int numReviews, List<String> reviews) {
	HashMap<String, Integer> data = new HashMap<>();
	ArrayList<String> orderCompetitors = new ArrayList<>();
	HashMap<Integer, TreeSet<String>> order = new HashMap<>();
	for (String review : reviews) {
	    for (String competitor : competitors) {
		if (review.contains(competitor)) {
		    data.merge(competitor, 1, (t, u) -> t + u);
		    break;
		}
	    }
	}

	for (Map.Entry<String, Integer> entry : data.entrySet()) {
	    order.merge(entry.getValue(), new TreeSet<>(Arrays.asList(entry.getKey())), (t, u) -> {
		t.addAll(u);
		return t;
	    });
	}

	TreeSet<Integer> orderNew = new TreeSet<Integer>((t, u) -> u - t);
	orderNew.addAll(order.keySet());
	orderNew.forEach(t -> orderCompetitors.addAll(order.get(t)));

	return new ArrayList<>(orderCompetitors.subList(0, topNCompetitors));

    }

    public static ArrayList<String> topNCompetitorsImproved(int numCompetitors, int topNCompetitors,
		    List<String> competitors, int numReviews, List<String> reviews) {
	HashMap<String, Integer> competitorsCounter = new HashMap<String, Integer>();
	for (String review : reviews) {
	    for (String competitor : competitors) {
		if (review.contains(competitor)) {
		    competitorsCounter.merge(competitor, 1, (t, u) -> t + u);
		    break;
		}
	    }
	}
	TreeMap<Integer, List<String>> topNCompetitorsMapping = new TreeMap<Integer, List<String>>(Comparator.reverseOrder());
	for (Map.Entry<String, Integer> entry : competitorsCounter.entrySet()) {
	    topNCompetitorsMapping.merge(entry.getValue(), Arrays.asList(entry.getKey()), (t, u) -> {
		t.addAll(u);
		return t;
	    });
	}

	ArrayList<String> result = new ArrayList<String>();
	topNCompetitorsMapping.keySet().forEach(t -> result.addAll(topNCompetitorsMapping.get(t)));

	return new ArrayList<>(result.subList(0, topNCompetitors));
    }

    static int minimumHours(int rows, int columns, List<List<Integer>> grid) {
	int array[][] = new int[grid.size()][];
	int counter = 0;
	for (List<Integer> column : grid) {
	    array[counter] = new int[column.size()];
	    for (int i = 0; i < column.size(); i++) {
		array[counter][i] = column.get(i);
	    }
	    counter++;
	}

	int newCounter = 0;
	while (!complete(array)) {
	    newCounter++;
	    for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array[i].length; j++) {
		    if (array[i][j] == 1) {
			try {
			    array[i - 1][j] = 1;
			} catch (ArrayIndexOutOfBoundsException e) {
			    //because of time limitation
			}
			try {
			    array[i + 1][j] = 1;
			} catch (ArrayIndexOutOfBoundsException e) {
			    //because of time limitation
			}
			try {
			    array[i][j - 1] = 1;
			} catch (ArrayIndexOutOfBoundsException e) {
			    //because of time limitation
			}
			try {
			    array[i][j + 1] = 1;
			} catch (ArrayIndexOutOfBoundsException e) {
			    //because of time limitation
			}
		    }
		}
	    }
	}
	return newCounter;
    }

    private static boolean complete(int[][] array) {
	boolean flag = true;
	for (int i = 0; i < array.length; i++) {
	    for (int j = 0; j < array[i].length; j++) {
		if (array[i][j] == 0) {
		    return false;
		}
	    }
	}
	return flag;
    }

}
