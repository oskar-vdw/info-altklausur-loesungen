package ws21;

import java.util.Arrays;

public class histogramm {

    public static int[] histogrammMethode(int[] a) {
        int max_age = 0;
        for(int i=0; i<a.length; i++){
            if(a[i]>max_age){
                max_age = a[i];
            }
        }
        int[] histogrammArray = new int[(max_age + 1)];

        for(int i=0; i<a.length; i++){
            histogrammArray[a[i]] += 1;
        }
        return histogrammArray;


    }

    public static void main(String[] args){
        int[] testArray = {1,6,2,9,3,2,1};
        int[] histogrammArray = histogrammMethode(testArray);

        System.out.println(Arrays.toString(histogrammArray));
    }

}