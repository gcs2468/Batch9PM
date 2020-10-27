package Practiceprograms;

import java.util.HashMap;
import java.util.Map;

public class NonrepeatingChars {


    public static char getNonRepeatedFirstChar(String str){
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
            if (entry.getValue()==1){
                c1 = entry.getKey();
                break;
            }
        }
        return c1;
    }

    public static void getAllNonRepeatedCharsCount(String str){
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char c : str.toCharArray()){
            if(hm.containsKey(c)){
                hm.put(c, hm.get(c)+1);

            }else{
                hm.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : hm.entrySet()){
            if (entry.getValue()==1){
                System.out.println(entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        //System.out.println(getNonRepeatedFirstChar("abcabz"));
        getAllNonRepeatedCharsCount("abcabz");
    }



}
