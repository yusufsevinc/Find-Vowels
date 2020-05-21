import java.util.Arrays;
import java.util.Scanner;

public class FindVowels {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        numberOfVowels();

   }
   public static void numberOfVowels() {
        System.out.print("Text entry: ");
        String text = input.nextLine();
        int numbera = 0, numbere = 0, numberu = 0, numbero = 0, numberi = 0;
        
        for (int i = 0; i < text.length(); i++) {

            switch (text.charAt(i)) {
                case 'a':
                    numbera++;
                    break;
                case 'A':
                    numbera++;
                    break;
                case 'E':
                    numbere++;
                    break;
                case 'e':
                    numbere++;
                    break;
                case 'u':
                    numberu++;
                    break;
                case 'U':
                    numberu++;
                    break;
                case 'o':
                    numbero++;
                    break;
                case 'O':
                    numbero++;
                    break;
                case 'i':
                    numberi++;
                    break;
                case 'I':
                    numberi++;
                    break;
            }//end ofswitch

        }//end for
        int[] arrayCharNumber = new int[]{numbera, numbere, numberu, numbero, numberi};
        
            System.out.println("A ve a " + arrayCharNumber[0] +" tane var.\n"
                    + "E ve e " + arrayCharNumber[1] +" tane var.\n"
            + "O ve o " + arrayCharNumber[3] +" tane var.\n"
                    + "U ve u " + arrayCharNumber[2] +" tane var.\n"
                            + "I ve i " + arrayCharNumber[4] +" tane var.\n" );
            System.out.println(Arrays.toString(arrayCharNumber));
            
     }//end   numberOfVowels
}//end  class
