import java.util.HashMap;

public class MapsAndSubMaps {


    public static void main(String[] args) {
        HashMap<String, String> map1 = new HashMap<String, String>();

        map1.put("a", "A");
        map1.put("b", "B");
//        map1.put("c", "C");


        HashMap<String, String> map2 = new HashMap<String, String>();


        map2.put("a", "A");
        map2.put("b", "B");
        map2.put("c", "D");
        System.out.println(isSubMap(map1, map2));


    }

    public static boolean isSubMap(HashMap<String, String> hashMap, HashMap<String, String> hashMap1){


        if(hashMap.isEmpty()){
            return true;
        }

        int count = 0 ;
        for (String i : hashMap.keySet()) {
            for(String j : hashMap1.keySet())
                if(i.equals(j) && hashMap.get(i).equals(hashMap1.get(j))){
                count++;
                }

        }
        if(count == hashMap.size()){
        return true;
        }

        return false;



    }
}
