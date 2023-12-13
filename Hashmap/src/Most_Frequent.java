import java.util.*;
public class Most_Frequent {
    public static void main(String[] args) {
        Map<Integer, Integer> mp = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 4, 2, 5, 1, 4, 4, 6, 4, 4, 4, 4, 6, 2, 2, 2, 3};

        for(var e : arr){
            if(!mp.containsKey(e)) mp.put(e,1);
            else mp.put(e,mp.get(e)+1);
        }
        int maxFreq = -1;
        int ansKey = -1;
        for(var e : mp.entrySet()){
            if(maxFreq < e.getValue()){
                maxFreq = e.getValue();
                ansKey = e.getKey();
            }
        }

        System.out.println(ansKey);

    }
}