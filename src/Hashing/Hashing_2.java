package Hashing;

import java.util.Scanner;

public class Hashing_2 {
    public static void main(String[] args) {

        //Original String
        String s = "abcdabefc";

        // Pre Computing
        int hash[] = new int[25];
        for(int i = 0 ; i < s.length();i++){
            hash[s.charAt(i) - 'a'] += 1;
        }

        Scanner sc = new Scanner(System.in);
        int query = sc.nextInt();

       while (query>0){
           System.out.println("Enter the Character");
           Character c = sc.next().charAt(0);

           //Fetching
           System.out.println(hash[c - 'a']);
           query--;
       }
    }
}
