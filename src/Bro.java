//
//import java.util.Arrays;
//
//
//class googl {
//    public static String[] delete(String[] original, int index) {
//        String[] result = new String[original.length - 1];
//
//        for (int i = 0; i < original.length - 1; i++) {
//            if (i != index) {
//                //result[i] = original[i];
//                int newIndex = i < index ? i : i - 1;
//                result[newIndex] = original[i];
//                return result;
//            }
//        }
//
//
//        class Bro {
//            public static void main(String[] args) {
//                String[] str = {"0", "1", "2", "3"};
//                String[] str2 = delete(str, 1);
//
//                System.out.println(Arrays.toString(str2));
//            }
//        }
//        return result;
//    }
//
//}