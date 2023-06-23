import java.util.ArrayList;

public class diceGame {
    static ArrayList<String> getDiceResult(int currentValue,int endValue){
        //Termination case
       if(currentValue==endValue){
        ArrayList<String> list= new ArrayList<>();
        list.add("");
        return list;
       }
       //case to not traverse the arraylist when value exceeds endvalue
       if(currentValue>endValue){
        ArrayList<String> list= new ArrayList<>();
        return list;
       }
       ArrayList <String> finalResult=new ArrayList<>(); 
       for(int dice=1;dice<=6;dice++){
        int newValue=currentValue+dice;
        ArrayList<String> list=getDiceResult(newValue, endValue);
        for(String s:list){
            finalResult.add(dice+s);
        }
       }
       return finalResult;
    }
    public static void main(String[] args) {
        ArrayList <String> result=getDiceResult(5, 5);
        System.out.println(result);
        ArrayList <String> r=new ArrayList<>();
        r.add("a");
        r.add("b");
        System.out.println(r);
    }
}
