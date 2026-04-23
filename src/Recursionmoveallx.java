public class Recursionmoveallx {
    public static void moveAllx(String str,int idx,int count,String newstring){
        if(idx==str.length()){
            for(int i=0;i<count;i++){
                newstring +='x';
            }
            System.out.println(newstring);
            return;
        }
        char currchar=str.charAt(idx);
        if(currchar=='x') {
            count++;
            moveAllx(str, idx + 1, count, newstring);
        }else{
            newstring+=currchar;
            moveAllx(str, idx + 1, count, newstring);
        }
    }

    public static void main(String[] args) {
        String str="axbcxxd";
        moveAllx(str,0,0,"");
    }
}
