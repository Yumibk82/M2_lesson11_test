import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
public class StackList {
    public static void main(String[] args) {
        System.out.println("Please input size of a array ");
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("input element of array "+i);
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        LinkedList<Integer> stack;
        stack = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        System.out.println(stack);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=stack.pop();
        }
        System.out.println(stack);
        System.out.println(Arrays.toString(arr));
    }

}
