import java.util.Arrays;

public class googl {
    public static String[] delete(String[] original, int index) {
        String[] result = new String[original.length - 1];



        for (int i =0; i < original.length; i++) {
            if(i != index){
                var newIndex = i < index ? i : i - 1;
                result[newIndex] = original[i];
            }


        }


        //System.out.println(Arrays.toString(result));


        return result;

    }

    public static void main(String[] args) {
        String[] kh = {"1", "2", "3","4", "5"};


        String [] index  = delete(kh, 1);
        System.out.println(Arrays.toString(index));

        // String[] text = new String[10];
        // String[] text2 = new String[10];
        // for (int i = 0; i < text.length; i++) {
        //     text[i] = "fd" + i;
//
//
        //     System.out.print(text[i] + " ");
//
        // }
        // System.out.println();
        //for (int i = 0; i < text.length; i++) {
        //    text2[i] = text[i];
        //    if (i != 3|i != 5) {
        //        continue;
        //    } else {
        //        System.out.print(text2[i] + " ");
        //    }
        //}System.out.println(Arrays.toString(text2));

    }
}
