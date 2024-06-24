import java.util.*;

public class DsaProblems {

    int[][] merge(int[][] intervals){

        if(intervals.length <= 1){
            return intervals;
        }

        Arrays.sort(intervals,Comparator.comparingInt(i -> i[0]));
        List<int[]> result = new ArrayList<>();

        int[] newInterval = intervals[0];
        result.add(newInterval);

        for(int[] interval:intervals){

            if(interval[0] <= newInterval[1]){

                newInterval[1] = Math.max(interval[1],newInterval[1]);
            }
            else {

                newInterval = interval;
                result.add(newInterval);
            }
        }
        return result.toArray(new int[result.size()][]);

    }




    public static void smallestnumber(int n){

        //        Given a positive Integer return a smallest number s such that product
//        of digit of s is equal to n
        System.out.println("Smallest number");

        StringBuilder sb = new StringBuilder();
        for(int div = 9;div>=2;div--){

            while (n % div == 0){
                n /= div;
                sb.insert(0,div);
            }
        }
        System.out.println(sb);

    }

    public void sum3(int[] values,int target){

        Arrays.sort(values);

        for(int i =0;i<values.length;i++){

            if(i == 0 || values[i] != values[i + 1]){

                int j = i + 1;
                int k = values.length - 1;
                int tar = target - values[i];
                while (j < k){
                    if(values[j] + values[k] == tar){
                        System.out.println("Sum found " + values[i] + values[j] + values[k]);
                        while (j < k && values[j] == values[j + 1]) j++;
                        while (j < k && values[k] == values[k - 1]) k--;
                        j++;
                        k--;
                    }
                    else if(values[j] + values[k] < tar){
                        j++;
                    }
                    else {
                        k--;
                    }
                }
            }
        }
    }

    public static void matrix180(int[][] matrix){

        System.out.println("before 180");
        for(int[] arr:matrix){
            for(int number:arr){
                System.out.print(number);
                System.out.print(" ");
            }
            System.out.println();
        }

        for(int i =0;i<matrix.length;i++){
            for(int j = i + 1;j<matrix[0].length;j++){
                int temph = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temph;
            }
        }

        int left = 0,right = matrix[0].length - 1;
        while (left < right){
            for(int i =0;i<matrix.length;i++){
                int temph = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temph;
            }
            left ++;
            right--;
        }

        System.out.println("after 180");
        for(int[] arr:matrix){
            for(int number:arr){
                System.out.print(number);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void find_first_last(int[] number,int target){

        int left = 0,right = number.length - 1;
        int first = -1;
        while (left<= right){

            int mid = (left + right) / 2;
            if(number[mid] == target ){
                first = mid;
                right = mid - 1;
            }
            else if(number[mid] < target){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        System.out.println("First occurance" + first);

        left = 0;
        right = number.length - 1;
        int last = -1;
        while (left <= right){

            int mid = (left+right)/2;
            if(number[mid] == target){
                last = mid;
                left= left + 1;
            }
            else if(number[mid] < target){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }

        }
        System.out.println("last occurance" + last);


    }

    public static void binarySearch(int[] number,int target){

        int left = 0,right = number.length-1;
        while (left <= right){
            int mid = left + right / 2;
            if(number[mid] == target){
                System.out.println("Number Found" + mid);
            }
            else if(number[mid] <= target){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
    }
    public static int findMin(int[] number){

        int left = 0;
        int right = number.length - 1;

        if(number[left] < number[right]){
            return number[left];
        }

        while (left <= right){
            int mid = left + (right - left) / 2;

            if(mid >0 && number[mid]< number[mid - 1]){
                return mid;
            }
            if (mid < number.length - 1 && number[mid] > number[mid + 1]){
                right = mid + 1;
            }
            if(number[mid]>= number[left]){
                left = left + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void binarySearch_with_index(int[] number,int left,int right,int target){

//        int left = 0,right = number.length-1;
        while (left <= right){
            int mid = left + right / 2;
            if(number[mid] == target){
                System.out.println("Number Found" + mid);
            }
            else if(number[mid] <= target){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
    }
    public static void search_matrix_binary(int[][] number,int target){

        int i = 0;
        int j = number.length - 1;
        while (i <number.length && j>=0){
            if(number[i][j] == target){
                System.out.println("Number found");
                break;
            }
            else if(number[i][j] < target){
                i ++;

            }
            else {
                j --;
            }
        }
    }

    public static void swap2elements(int[] number){

        int i = 0,j = 0;
        while (i<number.length){
            if(number[i] == 0){
                int temp = number[i];
                number[i] = number[j];
                number[j] = temp;
                i++;
                j++;
            }
            else {
                i++;
            }

        }
        System.out.println(Arrays.toString(number));
    }

    public static void swap012(int[] number){

        int  i = 0,j = 0,k = number.length - 1;
        while (i<=k){

            if(number[i] == 0){

                int temph = number[i];
                number[i] = number[j];
                number[j] = temph;
                i++;
                j++;
            }
            else if (number[i] == 1){
                i++;
            }
            else {
                int temph = number[i];
                number[i] = number[k];
                number[k] = temph;
                k--;
            }
        }
    }

    public static void countsort(int[] number){

        int n = number.length;
        int max = number[0];

        for(int i =1;i<number.length;i++){
            max = Math.max(max,number[i]);
        }

        int[] fi = new int[max + 1];
        for(int i = 0;i<n;i++){
            fi[number[i]]++;
        }
        for(int i = 1;i<fi.length;i++){
            fi[i] = fi[i] + fi[i - 1];
        }

        int[] ans = new int[n];
        for(int i = n-1;i>=0;i--){
            int pos = fi[number[i]];
            ans[pos - 1] = number[i];
            fi[number[i]]--;
        }

        System.out.println(Arrays.toString(number));
    }


    public static void count_sort_dates(String[] arr,int range,int div,int mod){

        int n = arr.length;
        int[] p  = new int[range + 1];

        for(int i =0;i<n;i++){
            p[(Integer.parseInt(arr[i])/div) % mod]++;
        }

    }

    public static void count_sort_algorithm(int[] number){

        int max = Arrays.stream(number).max().getAsInt();
        int min = Arrays.stream(number).min().getAsInt();
        int range = max - min + 1;

        int[] count = new int[range];
        Arrays.fill(count,0);

        for(Integer num:number){
            count[num - min]++;
        }
        for(int i =1;i<count.length;i++){
            count[i] += count[i - 1];
        }


        System.out.println(Arrays.toString(count));

    }

    public static void maxSubArraySum(int[] number,int target){

        int minLenWindow = Integer.MAX_VALUE;
        int currSum = 0;

        int low = 0;
        int high = 0;
        while (high < number.length){
            currSum += number[high];
            high++;

            while (currSum > target){
                int currentWindowSize = high - low;
                minLenWindow = Math.min(minLenWindow,currentWindowSize);

                currSum -= number[low];
                low ++;

            }
        }
    }
    public static int lengthOfLongestSubstring(String s){

        int left = 0;
        int right = 0;
        int max = 0;
        Set<Character> seen = new HashSet<>();
        while (right<s.length()){
            char c = s.charAt(right);
            if(seen.add(c)){
                max = Math.max(max,right - left + 1);
                right ++;
            }
            else {
                while (s.charAt(left)!= c){
                    seen.remove(s.charAt(left));
                    left ++;

                }
                seen.remove(c);
                left ++;

            }
        }
        return max;
    }






}