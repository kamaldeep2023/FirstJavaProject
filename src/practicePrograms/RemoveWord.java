package practicePrograms;

public class RemoveWord {
	
	String sentence = "Hello Welcome To Java";
	String[] removedSentence= new String[sentence.length()];
	

	public void removeSecondCharacter() {
		
		String[] sentenceArray = sentence.split(" ");
		
		for(int i=0;i<sentenceArray.length;i++)
		{
			
			removedSentence[i]= sentenceArray[i].substring(0,1)+sentenceArray[i].substring(2);
			
			System.out.print(removedSentence[i] + " ");
			
		}
		
	
}
}