public class StringFormatName {
        public static void main(String[] args) {

            String str = "oMm PrAkAsH dAs";

            str = str.toLowerCase();

            String result = "";

            String[] words = str.split(" ");

            for (String word : words) {
                result = result + Character.toUpperCase(word.charAt(0))
                        + word.substring(1) + " ";
            }

            System.out.println(result);
        }
    }

