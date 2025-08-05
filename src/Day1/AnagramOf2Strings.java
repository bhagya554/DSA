package Day1;

import java.util.HashMap;

public class AnagramOf2Strings {
    public static void main(String[] args) {
        String s1 = args[0];
        String s2 = args[1];

        System.out.println("Anagram ?? " + anagram(s1,s2));
    }

    private static boolean anagram(String s1, String s2) {

        if(s1==null || s2==null){
            return false;
        }
        else if(s1.length()!=s2.length()){
            return false;
        }
        else{
            HashMap<Character,Integer>  hm = new HashMap<>();
            for(char c1:s1.toCharArray()){ //t-1 e-0 s-0 best
                hm.put(c1,hm.getOrDefault(c1,0)+1);
            }

            for(char c2:s2.toCharArray()){
                if(!(hm.containsKey(c2))||hm.get(c2)==0){
                    return false;
                }
                else{
                    hm.put(c2,hm.get(c2)-1);
//                    // not required as we are checking for hm.get(c2)==0 in if condition
//                    if(hm.get(c2)<0){
//                        return false;
//                    }
                }
            }
            for(int i:hm.values()){
                if(i!=0){
                    return false;
                }
            }

        }
        return true;

    }
}
