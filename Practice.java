//package GitPractice;

public class Practice{
    public static void main(String[] args) {
        System.out.println("First Java File");
        

        int[] arr = {3, 8, 14, 21, 27, 35, 42, 49, 56, 63, 71, 78, 84, 91, 97};

        int target = 3;

        int left = 0;
        int right = arr.length - 1;

        while( left <= right ){

            int mid = left + (right - left) / 2;

            if( arr[mid] == target ){
                System.out.println("Target present at : "+mid);
                break;
            }

            else if( target > arr[mid] ){
                left = mid +1;
            }
            else {
                right = mid -1;
            }
        }


     hw(5);
        
    }

   public static void hw( int n ){
    if( n == 0 ){
        //System.out.println("Hello world");
        return ;
    }
    System.out.println("Hello world");
    hw( n - 1);
   }
}