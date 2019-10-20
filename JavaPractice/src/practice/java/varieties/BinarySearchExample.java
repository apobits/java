/**
 * 
 */
package practice.java.varieties;

/**
 * @author aposo
 *
 */
public class BinarySearchExample {
	
	private static int counter;
	private static int counterV2;

	private static boolean binarySearchIterative(int[] numbers, int number) {

		int left = 0, right = numbers.length - 1, count = 0;

		while (left < right) {
			System.out.println(++count);
			int mid = (left + right) / 2;
			if (number < numbers[left] || number > numbers[right]) {
				return false;
			}

			if (number >= numbers[left] && number <= numbers[mid + 1]) {
				if (number == numbers[left] || number == numbers[mid]) {
					return true;
				} else {
					right = mid;
				}
			} else if (number >= numbers[mid] && number <= numbers[right]) {
				if (number == numbers[mid] || number == numbers[right]) {
					return true;
				} else {
					left = mid;
				}
			}

		}

		return false;

	}

	private static boolean binarySearch(int[] numbers, int number, int left, int right) {
		counter++;
		if(number<numbers[left]||number>numbers[right]) {
			return false;
		}else if (left == right) {
			return number == numbers[left];
		}
		
		int mid = (left + right) / 2;
		if (number >= numbers[left] && number <= numbers[mid]) {
			if (number == numbers[left] || number == numbers[mid]) {
				return true;
			} else {
				return binarySearch(numbers, number, left, mid);
			}
		}else if (number >= numbers[mid + 1] && number <= numbers[right]) {
			if(number== numbers[mid+1]||number== numbers[right]) {
				return true;
			}else {
				return binarySearch(numbers, number, mid+1, right);
			}
		}

		return false;
	}
	
	private static boolean binarySearchV2(int[] numbers, int number, int left, int right) {
		counterV2++;
		if(number<numbers[left]||number>numbers[right]) {
			return false;
		}
		
		int mid = (left + right) / 2;
		if(number==numbers[mid]) {
			return true;
		}else if(number<=numbers[mid]) {
			return binarySearchV2(numbers, number, left, mid);
		}else {
			return binarySearchV2(numbers, number, mid+1, right);
		}

	}

	public static void main(String[] args) {

		var numbers = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//		System.out.println(binarySearchIterative(numbers, 2));
		System.out.println(binarySearch(numbers, 9, 0, numbers.length-1));
		System.out.println(binarySearchV2(numbers, 9, 0, numbers.length-1));
		
		System.out.println("counter: "+counter);
		System.out.println("counterV2: "+ counterV2);

	}

}
