import java.util.HashSet;
public class RecursionUniqueSubsequences {
    public static void uniquesubsequences(String str,int idx,String newstring, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newstring)) {
                return;
            } else {
                System.out.println(newstring);
                set.add(newstring);
                return;
            }
        }
        char currchar = str.charAt(idx);
        //to be
        uniquesubsequences(str, idx + 1, newstring+currchar,set);
        //or not to be
        uniquesubsequences(str, idx + 1, newstring,set);
    }

    public static void main(String[] args) {
        String str="aaa";
        HashSet<String> set=new HashSet<>();
        uniquesubsequences(str,0," ",set);
    }

    }

