import java.util.Scanner;

public class gameStart {
	public static void main(String[] args) {
		//Variables
		int Health = 100;
		String Name;
		int Option;
		Scanner sc = new Scanner(System.in);

		//Introduction 
		System.out.println("You awake dazed and confused after you and the Oracle drank all of the grog in the tavern! \n What is your name?");
		Name = sc.nextLine();

		System.out.println("\n ======================================================================\n ");
		System.out.println("Town Child:" + Name + " THE DRAGONS ARE ATTATCKING! THE NO MASK POLICY HAS UPSET THEM! WE NEED TO PROTECT THE FORT!");
		System.out.println(Name + ": *Burps* Hush child don't the dragons know the coronaspell has run rampent all over ReadingLand");
		System.out.println("==============================================================================================================");
		System.out.println("What do you do?\n 1. Run to the gates and protect the fort\n 2. Have a Nap\n 3. Tell the child he's delusional ");
		Option = sc.nextInt();

		switch (Option) {
		case 1:
			Run();
			break;
		case 2:
			Nap();
			break;
		case 3:
			Health = Delusional(Health);
			break;
		default:
			break;
		}

		System.out.println("Your health is test:" + Health);




	}

	public static void Run() {

	}

	public static void Nap() {
		System.out.println("You can protect the town another day... *You preceed to fall asleep*");
		System.out.println("The Dragons burn down the fort wiht you inside.....");
		Death();
	}

	public static int Delusional(int Health) {
		System.out.println("You tell the child that they're delusional!");
		System.out.println("The child screams with a blazing fury and attacks you \n -50 HP");
		Health -= 50;
		System.out.println("Your health is now :" + Health);
		return Health;
	}

	public static void Death() {
		System.out.println("You have lost all of your health and you died!");
		System.out.println("================== Game Over =================");
	}

}

