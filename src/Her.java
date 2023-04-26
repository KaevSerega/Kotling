import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Her {
    public static int[] remove(int[] a, int index) {
        if (a == null || index < 0 || index >= a.length) {
            return a;
        }

        List<Integer> result = IntStream.of(a)    // IntStream
                .boxed()
                .collect(Collectors.toList());
        result.remove(index);

        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
    public static void main(String[] args) {

        int[] ser = new int[8];
        String[]name = new String[4];
        ser[0]=0;
        ser[4]=124553;
        String j= "гондон";
        int des=1;
        for(int i=0;i< name.length;i++){

            name[i]=j+" " +i;
            System.out.print(name[i]+" ");

        }
        for(int i=0;i<8;i++){

            ser[i]=des+i;
            System.out.print(ser[i]+" ");


        }
        List<String> fruits = new ArrayList<>();
        //fruits.add(fruits);
        //its.remove(2);
        System.out.println(fruits+"это тут");




        //System.out.println(ser[0]);
        //System.out.println(Arrays.asList(ser));
       // for (int i = 1; i < 8; i++) {
       //     ser[i]=i;
       //     System.out.println(i);
       //     System.out.printf("Ученик №%d: оценка %d%n", (i + 1), ser[i]);
       // }

    }
}