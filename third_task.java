public class Main
{
    private static boolean check (int number, int del, int step){
        if (number < 4){
            return true;
        }
        if(number%2 == 0 || number % 3 == 0){
            return false;
        }
        if(del*del <= number){
            if (number % del == 0){
                return false;
            }
            else{
                del += step;
                step ^= 6;
                return check(number, del, step);
            }
        }
        return true;
    }
    
	public static void main(String[] args) {
	    System.out.print("Simple numbers: ");
	    for (int number = 2; number <= 100; ++number){
	        if (check(number,5,2)){
	            System.out.print(number + " ");
	        }
	    }
	}
}