import java.util.Scanner;

public class ClosestMinMaxSize {
    public static int minMaxCount(int[] array)
    {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        int latestMini=-1;
        int latestMaxi=-1;
        int result=Integer.MAX_VALUE;
        for (int i=0; i<array.length;i++){
            if(array[i]==min){
                latestMini=i;
                if (latestMaxi >= 0) {
                    result = Math.min(result, i - latestMaxi + 1);
                }
            }if(array[i]==max){
                latestMaxi=i;
                if (latestMini >= 0) {
                    result = Math.min(result, i - latestMini + 1);
                }
            }

        }
        return result;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size=scanner.nextInt();
        int[] array =new int[size];
        for(int i=0;i<size;i++){
            array[i]=scanner.nextInt();
        }
        System.out.println(minMaxCount(array));
    }
}
