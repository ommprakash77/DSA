import java.util.ArrayList;
public class PrintSubset {
    public static void printsubsets(ArrayList<Integer>subset){
        for(int i=0;i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void findsubsets(int n,ArrayList<Integer>subset){
        if(n==0){
            printsubsets(subset);
            return;

        }
        findsubsets(n-1,subset);
        subset.add(n);
        findsubsets(n-1,subset);
        subset.remove(subset.size()-1);
    }

    public static void main(String[] args) {
        int n=3;
        findsubsets(n,new ArrayList<Integer>());
    }
}
