package assignmentWeek4;
import java.util.Scanner;
public class CRSScoreMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CRSScore crscalculate = new CRSScore();
		
		System.out.println("Enter your education level: ");
		crscalculate.educationScore(sc.next());
		
		System.out.println("Enter your experience in years. 4-5 Years Or 6 Years or More");
		crscalculate.experienceLevel=sc.nextInt();
		crscalculate.experienceScore();
		
		System.out.println("Enter your age in years: ");
		crscalculate.ageScore(sc.nextInt());
		
		System.out.println("Enter your IELTS score for Listening");
		crscalculate.ieltsListening(sc.nextDouble());
		
		crscalculate.ieltsSpeakReadWrite();
		
		crscalculate.adapdability();
		
		crscalculate.calculateCrsScore();
		
	}

}
