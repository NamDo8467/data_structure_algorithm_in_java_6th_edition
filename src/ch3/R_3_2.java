package ch3;
import java.util.Random;
import java.util.Arrays;
public class R_3_2 {
	public static void randomRemove(int [] array) {
		int length = array.length;
		boolean terminate = false;
		Random random = new Random();
		int r = 0;
		while(terminate == false) {
			r = random.nextInt(0, length);
			array[r] = 0;
			for(int i = 0; i<array.length;i++){
				if(array[i] != 0) {
					terminate = false;
					break;
				}else {
					terminate = true;
				}
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {1,2,3,4,5};
		System.out.println("Before randomRemove: ");
		System.out.println(Arrays.toString(array));
		randomRemove(array);
		System.out.println();
		System.out.println("After randomRemove: ");
		System.out.println(Arrays.toString(array));
	}

}
