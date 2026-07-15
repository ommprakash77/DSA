public class RecursionArrayisAP {

        public static boolean isAP(int[] arr, int idx, int diff) {

            if (idx == arr.length - 1) {
                return true;
            }

            if (arr[idx + 1] - arr[idx] == diff) {
                return isAP(arr, idx + 1, diff);
            } else {
                return false;
            }
        }

        public static void main(String[] args) {

            int[] arr = {2,5,6};

            int diff = arr[1] - arr[0];

            System.out.println(isAP(arr, 0, diff));
        }
    }

