package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class Hashing_3 {
    public static void main(String[] args) {
        int [] arr = {1,2,1,3,12,2};

        // Pre computing
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0 ; i<arr.length ; i++ ){
            int key = arr[i];
            if(mp.containsKey(key)){
                int frequency = mp.get(key);
                frequency++;
                mp.put(key,frequency);
            } else{
                mp.put(key,1);
            }
        }

        Scanner sc = new Scanner(System.in);
        int query = sc.nextInt();

        while(query>0){
            System.out.println("Enter the no you want:");
            int no = sc.nextInt();
            if (mp.containsKey(no)){
                int value = mp.get(no);
                System.out.println(value);
            } else{
                System.out.println(0);
            }
            query--;
        }
    }
}


// I am specifying int where it requires only Integer
// How I am able to use the same sc