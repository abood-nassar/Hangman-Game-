import java.util.Scanner;

public class HangMan extends Game{
    private String word;
    private String hint;
    private int numOfTrials = 0;
    private static final int MAX_TRIALS = 5;

    public HangMan(String description, String word, String hint){
        super(description);
        this.word = word;
        this.hint = hint;
    }
    
    @Override
    public void play(){
        Scanner input=new Scanner(System.in);
        System.out.println("\nHint :"+hint+"\n");
        char[] str= word.toCharArray();
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i)!= ' ')
                str[i] = '-';
        }
        System.out.println(str);
        for (int i = MAX_TRIALS; i > 0; i--) {
            System.out.println("You Have "+i+" trials left\nEnter your letter");
            String guess=input.nextLine();
            if(guess.length()!=1)
                throw new RuntimeException();
            if(guess.charAt(0)== '#')
                break;
            for (int j = 0; j < word.length(); j++) {
                if(word.charAt(j) == guess.charAt(0) )// if it was the same letter (lower ==lower)|| (upper==upper)
                    str[j]= guess.charAt(0);
                else if(word.charAt(j) == guess.charAt(0)+32 )//word.charAt(j)(lower case) == guess.charAt(0)(upper case)
                    str[j]= word.charAt(j);
                else if(word.charAt(j) == guess.charAt(0)-32 )//word.charAt(j)(upper case) == guess.charAt(0)(lower case)
                    str[j]= word.charAt(j);
                
            }
             System.out.println(str);
            numOfTrials++;
        }
        System.out.println("========================\nEnter your guess");
         String str1=input.nextLine();
        if(str1.equalsIgnoreCase(word)){
            points=30-5*numOfTrials;
            System.out.println("You won with "+points+" points");
        }
        else 
            System.out.println("You lost\nThe answer is "+word);
        status=true;
    }
}
