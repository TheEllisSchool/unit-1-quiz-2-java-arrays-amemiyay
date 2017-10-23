import javax.swing.JOptionPane;

public class quiz2 {

	public static void main(String[] args) {
		int [] array = {7, 8, 2, 20, 3, 2};
		int sorted = array.length;
		while (sorted > 0) {
			int max = array[0];
			int maxindex = 0;
			for (int i = 0; i < sorted; i++) {
				if (array[i] > max) {
					max = array[i];
					maxindex =i;
				}
			}
			// move it to the end
			int hold = array[sorted - 1];
			array[sorted - 1] = max;
			array[maxindex] = hold;
			
			//update sorted variables
			sorted--;
		}
		//print sorted array
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		//Find range and print
		int range = array[array.length-1] - array[0];
		System.out.println("The range is: " + range);

	}

}
