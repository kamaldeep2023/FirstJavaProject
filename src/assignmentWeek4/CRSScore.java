package assignmentWeek4;

import java.util.Scanner;

public class CRSScore {

	String[] education = { "PhD", "Masters", "Bachelor", "3Years" };
	int[] educationPoints = { 25, 23, 22, 21 };
	int[] age = { 18 - 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47 };
	int[] agePoints = { 12, 11, 10, 9, 8, 07, 06, 05, 04, 03, 02, 01 };
	String[] ieltsModule = { "Listening", "Speaking", "Reading", "Writing" };
	int educationScore;
	double ieltsReadSpeakWritePoints;
	double listeningPoints;
	int experiencePoints;
	String experienceLevel;
	int ageScore;
	double crsScore;
	int adapScore;

	Scanner sc = new Scanner(System.in);

	void educationScore(String studyDone) {
		for (int i = 0; i < education.length; i++) {
			if (studyDone.equals(education[i])) {
				educationScore = educationPoints[i];
			}
		}
	}

	void experienceScore() {
		switch (experienceLevel) {
		case "4-5Years":
			experiencePoints = 13;
			break;
		case "6YearsorMore":
			experiencePoints = 15;
		}
	}

	void ageScore(int ageEntered) {
		if(ageEntered>=18 || ageEntered<=35)
		{
			ageScore=12;
		}
		for (int i = 1; i < age.length; i++) {
			if (ageEntered == age[i]) {
				ageScore = agePoints[i];
			}

		}
	}

	double ieltsListening(double listeningScore) {

		if (listeningScore > 8) {
			listeningPoints = 6;
		} else {
			if (listeningScore == 7.5) {
				listeningPoints = 5;
			}
		}
		return listeningPoints;
	}

	double ieltsSpeakReadWrite() {

		for (int i = 1; i < ieltsModule.length; i++) {
			System.out.println("Enter your scores for " + ieltsModule[i]);
			double score = sc.nextDouble();

			if (score > 7) {
				ieltsReadSpeakWritePoints += 6;
			} else {
				if (score == 6.5) {
					ieltsReadSpeakWritePoints += 5;
				}
			}

		}
		return ieltsReadSpeakWritePoints;
	}

	int adapdability() {
		System.out.println(
				"Do you have a relative  in Canada(Parents, Grand Parents, Brother, Sister, Aunt, Uncle, Nephew or Niece) who is a Canadian Citizen or PR holder?");
		boolean isRelative = sc.nextBoolean();
		if (isRelative) {
			adapScore += 5;
		}
		System.out.println("Have you studied in Canada for atleast 2 years (Y/N)");
		boolean isStudyCanada = sc.nextBoolean();
		if (isStudyCanada) {
			adapScore += 5;
		}
		System.out.println("Have you studied in Canada for atleast 2 years at NOC 0, A, B (Y/N)");
		boolean isStudyNoc = sc.nextBoolean();
		if (isStudyNoc) {
			adapScore += 10;
		}

		return adapScore;

	}

	void finalCrsScore() {
		crsScore = educationScore + experiencePoints + ageScore + adapScore + listeningPoints
				+ ieltsReadSpeakWritePoints;
		System.out.println("Total Points you have scored: " + crsScore);
		
		if(crsScore>67)
		{
			System.out.println("You qualify to submit an Expression of Interest (EOI) to Immigration Canada");
		}
		else
		{
			System.out.println("You do not qualify to submit an Expression of Interest (EOI) to Immigration Canada");
		}
	}

}
