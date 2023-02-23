import java.util.HashMap;
import java.util.Map;

public class MapReview {

    public static void main (String[]args){
        Map<Integer,String >map =new HashMap<>();

        map.put(1,"Mike");
        map.put(2,"Johny");
        map.put(3,"Thomas");
        System.out.println(map.get(2));

        System.out.println(findFirstNonRepeating(" dava devevaper"));
    }


    public static Character findFirstNonRepeating(String str){
        Map<Character,Integer >map=new HashMap<>();
       int count;
       //counting chars and putting values in the hasMap
       for(Character ch:str.toCharArray()){
           if (map.containsKey(ch)){
               count=map.get(ch);
               map.put(ch,count+1);
           }else map.put(ch,1);

       }
       //strating from String check if char count equals 1
for (Character ch:str.toCharArray()){
    if (map.get(ch)==1)
        return ch;
}
return Character.MIN_VALUE;

    }

}
