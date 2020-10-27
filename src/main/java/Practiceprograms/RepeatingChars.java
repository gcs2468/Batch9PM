package Practiceprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class RepeatingChars {


    public static void getRepeatedCharsCount(String str){
        HashMap<Character, Integer> hm = new HashMap<>();
        char c1='\u0000';
        for(char c : str.toCharArray()){
            if(hm.containsKey(c)){
                hm.put(c, hm.get(c)+1);

            }else{
                hm.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : hm.entrySet()){
            //if (entry.getValue()==1){
                System.out.println(entry.getKey()+" :: "+entry.getValue());
            //}
        }
    }

    public static void getRepeatedStringsCount(String str){
        TreeMap<String, Integer> hm = new TreeMap<>();
        for(String s : str.replace(".","").replace(",","").split(" ")){
            if (hm.containsKey(s)){
                hm.put(s, hm.get(s)+1);
            } else {
                hm.put(s, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : hm.entrySet()){
            System.out.println(entry.getKey()+" :: "+entry.getValue());
        }
    }

    public static void main(String[] args) {

        //getRepeatedCharsCount("abcabz");
        //getRepeatedStringsCount("Here are some JUnit test cases to test each of this method. We test different kind of inputs, one which contains duplicates, and other which doesn't contains duplicates. Since program has not defined what to do in case of empty String, null String and what to return if only contains duplicates, you are feel free to do in a way which make sense. Read more: https://javarevisited.blogspot.com/2014/03/3-ways-to-find-first-non-repeated-character-String-programming-problem.html#ixzz66OL7anp7");
    }



}
