public class Main {
    private static int[] weight = new int[10];
    private static int [] secondWeight = new int [5];
    public static void main(String[] args) {
       weight[0] = 10;
       weight[1] = 12;
       weight[2] = 14;
       weight[3] = 16;
       weight[4] = 18;
       weight[5] = 20;
       weight[6] = 11;
       weight[7] = 13;
       weight[8] = 15;
       weight[9] = 17;
        for (int i = 0; i < weight.length; i++) {
            System.out.println(weight[i]);
        }
        System.out.println();
        for (int i = 0; i < weight.length; i++) {
            if (weight[i] % 2 == 0) {
                weight[i]++;
            }
            System.out.println(weight[i]);
        }
        System.out.println();
        secondWeight[0] = 0;
        secondWeight[1] = 0;
        secondWeight[2] = 0;
        secondWeight[3] = 0;
        secondWeight[4] = 0;
        int index = 0;
        for (int i = 3; i <=7 ; i++) {
            secondWeight[index] = weight[i];
            System.out.println(secondWeight[index]);
            index++;
        }
    }
}