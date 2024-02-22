package ch3;

public class R_3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String answerString = "when an empty list is created, both head and tail reference to null.\n"
				+ "If the addFirst method is executed, the both head and tail will be referencing to the same node.\n"
				+ "And then if the removeFirst method is executed, the head will be null and the size goes back to 0\n"
				+ "but we need to change tail to null also otherwise, if you remove line 51 and 52, tail is still referencing\n"
				+ "to the removed node.\n"
				+ "Technically, it doesn't make the program worse since every method starts with checking\n"
				+ "if the list is empty based on the 'size' attribute so even though the tail is still pointing to some node.\n"
				+ "the number of elements in the list is reflected by the 'size' attribute.";
		
		System.out.println(answerString);
	}

}
