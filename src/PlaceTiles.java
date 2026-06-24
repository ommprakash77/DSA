public class PlaceTiles {
    public static int placeTiles(int n, int m) {

        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }

        //Vertically
        int vertplacements = placeTiles(n - m, m);

        //Horrizentally
        int horplacements = placeTiles(n - 1, m);
        return vertplacements+horplacements;
    }

        public static void main(String[]args){
            int n=3,m=3;
            System.out.println(placeTiles(n,m));
        }
    }

