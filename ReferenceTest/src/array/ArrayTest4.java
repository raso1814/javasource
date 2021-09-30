package array;

public class ArrayTest4 {

	public static void main(String[] args) {

		int score[] = { 78, 65, 95, 88, 36, 45, 25, 47, 87, 43 };

		// Æò±Õ = ÇÕ°è / °³¼ö(score.length)

		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum = sum + score[i]; // sum+=score[i];
		}

		System.out.printf("ÇÕ°è : %d Æò±Õ : %.2f\n", sum, (double)sum/score.length);
	
		sum=0;
		for(int i : score) {
			sum+=i;
		}
	
		System.out.printf("ÇÕ°è : %d Æò±Õ : %.2f", sum, (double)sum/score.length);
	}
	
	

}
