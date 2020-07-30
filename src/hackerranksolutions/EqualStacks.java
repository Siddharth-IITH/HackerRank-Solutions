/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerranksolutions;

/**
 *
 * @author siddharthgupta
 */
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class EqualStacks {

    /*
     * Complete the equalStacks function below.
     */
    static int equalStacks(int[] h1, int[] h2, int[] h3) {
        
        Stack<Integer> s1=new Stack();
        Stack<Integer> s2=new Stack();
        Stack<Integer> s3=new Stack();
        
        int popped=0;
        
        int s1_sum=0,s2_sum=0,s3_sum=0;
        
        for (int i =h1.length-1; i>=0; i-- ){
            s1.push(h1[i]);
            s1_sum+=h1[i];
        }
        
        for (int i =h2.length-1; i>=0; i-- ){
            s2.push(h2[i]);
            s2_sum+=h2[i];
        }
        
        for (int i =h3.length-1; i>=0; i-- ){
            s3.push(h3[i]);
            s3_sum+=h3[i];
        }

        while (true){
            if(s1_sum==s2_sum && s2_sum ==s3_sum){
                return s1_sum;
                
            }
            if (s1_sum>s2_sum){
                //s1sum is big
                if (s1_sum>s3_sum){
                    //s1_sum is big
                     popped=s1.pop();
                    s1_sum-=popped;


                }else{
                    //s3_sum is big
                    popped=s3.pop();
                    s3_sum-=popped;
                }
            }else{
                //s2sum is big
                if(s2_sum>s3_sum){
                    //s2sum is big
                    popped=s2.pop();
                    s2_sum-=popped;

                }
                else{
                    //s3_sum is big
                     popped=s3.pop();
                    s3_sum-=popped;
                }

            }
        }



        // System.out.println("stack1: "+s1 + " sum: "+s1_sum);
        // System.out.println("stack2: "+s2+ " sum: "+s2_sum);
        // System.out.println("stack3: "+s3+ " sum: "+s3_sum);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] n1N2N3 = scanner.nextLine().split(" ");

        int n1 = Integer.parseInt(n1N2N3[0].trim());

        int n2 = Integer.parseInt(n1N2N3[1].trim());

        int n3 = Integer.parseInt(n1N2N3[2].trim());

        int[] h1 = new int[n1];

        String[] h1Items = scanner.nextLine().split(" ");

        for (int h1Itr = 0; h1Itr < n1; h1Itr++) {
            int h1Item = Integer.parseInt(h1Items[h1Itr].trim());
            h1[h1Itr] = h1Item;
        }

        int[] h2 = new int[n2];

        String[] h2Items = scanner.nextLine().split(" ");

        for (int h2Itr = 0; h2Itr < n2; h2Itr++) {
            int h2Item = Integer.parseInt(h2Items[h2Itr].trim());
            h2[h2Itr] = h2Item;
        }

        int[] h3 = new int[n3];

        String[] h3Items = scanner.nextLine().split(" ");

        for (int h3Itr = 0; h3Itr < n3; h3Itr++) {
            int h3Item = Integer.parseInt(h3Items[h3Itr].trim());
            h3[h3Itr] = h3Item;
        }

        int result = equalStacks(h1, h2, h3);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}

