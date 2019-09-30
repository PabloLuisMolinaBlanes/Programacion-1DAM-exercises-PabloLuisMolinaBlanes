public class Exercise02 {
	public static void main(String[] args) {
		System.out.println("Please, input a hour (not including minutes on your input, just a numerical value");
		int timeValue = Integer.parseInt(System.console().readLine());
		if (timeValue >= 6 && timeValue <= 12) {
			System.out.println("Good morning");
		} else if (timeValue >= 13 && timeValue <= 20) {
		       System.out.println("Good afternoon");
		} else {
	 		System.out.println("Good night");
		}
	}
}	
