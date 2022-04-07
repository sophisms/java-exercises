package test;

import java.util.ArrayList;
import java.util.List;
// Subtasks
// 1. receives number N
// 2. makes list from 1 to N
// 3. N % 4 = 0, return Lion
// 4. N % 13 = 0 True, return Camel
// 5. (N % 4 = 0) && (N % 13 = 0) return LionCamel
// 6. else, return N as string

public class Sequences {

    // Returns true if number is wholly divisible by divisor with no remainder.
    public static boolean isDivisible(int number, int divisor) {
        return number % divisor == 0;
    }

	public static List<String> sequence(int N) {
        List<String> results = new ArrayList<String>();
        // Add your code here
        for(int i = 1; i < N; i++){
          results[i] = i+1;
        }
        System.out.println(results);
        return results;
	}

    public static void main(String[] args) {
        for (String s : sequence(100)) {
            System.out.println(s);
        }
    }
}
