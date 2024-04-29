import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main main = new Main();
        main.playRandomWordGame();
    }

    private void playRandomWordGame(){
        String[] words = {"apple", "orange", "lemon",
                "banana", "apricot", "avocado" ,
                "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon",
                "leak", "kiwi", "mango",
                "mushroom", "nut", "olive",
                "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};
        final int MAX_SYMBOL_COUNT = 15;

        long seed = System.currentTimeMillis();
        Random rnd = new Random(seed);
        Scanner scanner = new Scanner(System.in);
        String userWord;
        char[] workInProgress = new char[MAX_SYMBOL_COUNT];

        String word = words[Math.abs(rnd.nextInt()) % words.length];
        System.out.println("I thought of a word, you need to guess it!");

        do{
            for (int i = 0; i < MAX_SYMBOL_COUNT; i++){
                if (i < word.length()) {
                    char wordCh = word.charAt(i);
                    char wipCh = workInProgress[i];
                    if (wordCh == wipCh)
                        System.out.print(wordCh);
                    else
                        System.out.print('#');
                }
                else{
                    System.out.print('#');
                }
            }

            System.out.println();
            System.out.print("Input your word: ");
            userWord = scanner.nextLine();

            for (int i = 0; i < Math.min(word.length(), userWord.length()); i++){
                if (word.charAt(i) == userWord.charAt(i)){
                    workInProgress[i] = userWord.charAt(i);
                }
            }
        }
        while (!word.equals(userWord));
        scanner.close();
        System.out.printf("Congratulations! Hidden word is %s!", word);
    }
}
