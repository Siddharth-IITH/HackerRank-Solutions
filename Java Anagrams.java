import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {

        //Create a HashMap to store frequency of characters
        java.util.HashMap<Character, Integer> map= new java.util.HashMap<>();

        //Add character frequency from string 'a'
        for (Character c : a.toCharArray()){
            c=java.lang.Character.toLowerCase(c);
           int count = map.containsKey(c) ? map.get(c) : 0;
            map.put(c, count + 1);
            }
        
        //subtract character frequency from map using string 'b'
        for (Character c : b.toCharArray()){
            c=java.lang.Character.toLowerCase(c);
           int count = map.containsKey(c) ? map.get(c) : 0;
            map.put(c, count - 1);
            }
        
        //check if every frequency is zero which means every character has equal freq in both strings
        for ( int i:map.values()){
            if (i!=0){
                return false;
            }
        }
        
    return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
