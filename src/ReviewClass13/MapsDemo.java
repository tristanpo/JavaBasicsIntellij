package ReviewClass13;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {
    public static void main(String[] args) {

        HashMap<Integer,String>personInfo=new HashMap<>();
        personInfo.put(111111,"Manana");
        personInfo.put(12352,"Salim");
        personInfo.put(456665,"Gulden");
        personInfo.put(8458566,"Pot");
        personInfo.put(84695,"Eric");
        for(Map.Entry<Integer,String>entry:personInfo.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getClass());
        }
    }
}
