import java.util.Scanner;


public class Main5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		int seed1 = Integer.parseInt(a);
		int seed2 = Integer.parseInt(b);
		Player player1 = new Player("성규", new WinningStrategy(seed1));
		Player player2 = new Player("영구", new ProbStrategy(seed2));
		for (int i=0; i< 10000; i++){
			Hand nextHand1 = player1.nextHand();
			Hand nextHand2 = player2.nextHand();
			if(nextHand1.isStrongThan(nextHand2)){
				System.out.println("Winner:" + player1);
				player1.win();
				player2.lose();
			} else if (nextHand2.isStrongThan(nextHand1)){
				System.out.println("Winner:" + player2);
				player1.lose();
				player2.win();
			} else{
				System.out.println("Even...");
				player1.even();
				player2.even();
			}
		}
		System.out.println("Total result:");
		System.out.println(player1.toString());
		System.out.println(player2.toString());
	}

}
