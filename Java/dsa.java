package Java;

import java.util.ArrayList;

public class dsa {// day 10

    public ArrayList<Integer> peakElement(int[] arr){
        int len = arr.length;
        ArrayList<Integer> neibours = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            int a = (i - 1) < 0 ? 0 : arr[i-1];
            int b = (i + 1) >= len ? 0 : arr[i+1];
            if (arr[i] < a ) neibours.add(a);
            if ( arr[i] < b ) neibours.add(b);
        }
        return  neibours;
    }

    public int greaterThanAverage(int[] arr){
        int count = 0;
        int average = 0;
        for (int i : arr)
             average += i;
        average /= arr.length;
        for(int i: arr)
             if (i > average) count++;
        return count;
    }
    public ArrayList<Integer> lesserThanItselfCount (int[] arr){
        ArrayList<Integer> counts = new ArrayList<>();
        for (int i: arr){
            int count = 0;
            for (int j :arr)
                if ( i > j) count++;
            counts.add(count);
        }
        return counts;
    }
    public ArrayList<Integer> lesser_Than_Itself_Count_SingleLoop (int[] arr){
        ArrayList<Integer> counts = new ArrayList<>();
        int left = -1;
        int right = 0 ;
        int len = arr.length;
        int count = 0;
        while (right < len ){
            ++left;
            if (left >= len){
                left = 0 ;
                counts.add(count);
                count =0;
                right++;
            }
            if (right >= len) break;

            if (arr[right] > arr[left]) count++;
        }
        return counts;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        dsa a = new dsa();
        System.out.println(a.peakElement(arr));
        System.out.println("Greater Than Average: "+a.greaterThanAverage(arr));
        System.out.println("Lesser Than itself: "+a.lesserThanItselfCount(arr));
        System.out.println("lesser_Than_Itself_Count_SingleLoop: "+a.lesser_Than_Itself_Count_SingleLoop(arr));

    }


    
}


