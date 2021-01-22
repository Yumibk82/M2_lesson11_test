import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
public class StackString {
    public static void main(String[] args) {
        LinkedList<String> stack = new LinkedList<>();
        String str = "I love you more than i can say";
        String word = "";
        String[] words = str.split("\\s");
        for (String w : words) {
            System.out.println(w);
        }
        for (int i = 0; i < words.length; i++) {
            stack.push(words[i]);
        }
        System.out.println(stack);
        for (int i = 0; i < words.length; i++) {
            words[i] = stack.pop();
        }
        System.out.println(Arrays.toString(words));
    }
}
