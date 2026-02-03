package Hashing;

import java.util.Scanner;

public class Hashing_1 {
    public static void main(String[] args) {

        //Original Array
        int[] arr = {1,2,1,3,2};

        //Hash Array
        int[] hash = new int[13];
        for(int i=0 ; i< arr.length;i++){
            // Pre Storing
            hash[arr[i]] += 1 ;
        }

        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        while(q>0){
            int num = sc.nextInt();
            // Fetching
            System.out.println(hash[num]);
            q--;
        }
    }
}
