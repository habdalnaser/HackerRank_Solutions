import java.util.Arrays;

public class Solution {
    static int[] cutTheSticks(int[] arr) {
        Arrays.sort(arr);
        int temp[] = new int [arr.length];
        int index = 0, count = 0;
        do{
            count = 0;
            int shortest = 0, current = 0;
            for(int i = 0;i<arr.length;i++){
                if(current == 0 && arr[i] != 0){
                    current = arr[i];
                }
                if(current != 0){
                    arr[i]-=current;
                    count++;
                }
            }
            if(count!=0){
                temp[index] = count;
                index++;
            }
        }while(count != 0);
        int [] result = Arrays.stream(temp).filter(i -> i>0).toArray();
        return result;
    }
}
