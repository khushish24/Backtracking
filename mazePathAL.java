import java.util.ArrayList;

public class mazePathAL {
    static ArrayList<String> getMazePath(int currentRow,int currentCol,int endRow,int endCol){
        if(currentRow==endRow&&currentCol==endCol){
            ArrayList <String> result=new ArrayList<>(); 
            result.add("");
            return result;
        }
        if(currentRow>endRow||currentCol>endCol){
            ArrayList <String> result=new ArrayList<>();
            return result;
        }
        ArrayList <String> finalResult=new ArrayList<>(); 
        //move to the right
        ArrayList <String> rightResult=getMazePath(currentRow, currentCol+1, endRow, endCol);
        for(String s:rightResult){
            finalResult.add("R"+s);
        }
        //move towards down
        ArrayList <String> downResult=getMazePath(currentRow+1, currentCol, endRow, endCol);
        for(String s:downResult){
            finalResult.add("D"+s);
        }
        return finalResult;
    }
    public static void main(String[] args) {
         ArrayList <String> result=getMazePath(0,0,2,2);
        System.out.println(result);
    }
}
