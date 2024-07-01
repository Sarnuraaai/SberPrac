public class Main
{
	public static void main(String[] args) {
	    final int amount = 10;
	    final int max_range = 100;
	    int max = 0;
	    int sum = 0;
	    int[] array = new int[amount];
	    for(int i = 0; i < amount; ++i){
	        array[i] = (int) (Math.random() * max_range);
	        sum += array[i];
	        //System.out.print(array[i] + " ");
	        
	        if (array[i] > max){
	            max = array[i];
	        }

	    }
	    
	    System.out.println("\nMaximum: " + max);
	    System.out.println("Average: " + sum/amount);
	    
	}
}