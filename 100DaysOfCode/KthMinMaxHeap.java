import java.util.Collections;
import java.util.PriorityQueue;

public class KthMinMaxHeap {
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,7,6,3,91,8,11,58,26};
        int k =3;

        PriorityQueue<Integer> nums = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            nums.add(arr[i]);
        } 
        for (int i = k; i < arr.length; i++) {
            if (nums.peek()<arr[i]) {
                nums.remove(nums.peek());
                nums.add(arr[i]);
            }
        }
        PriorityQueue<Integer> nums1 = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < k; i++) {
            nums1.add(arr[i]);
        } 
        for (int i = k; i < arr.length; i++) {
            if (nums1.peek()>arr[i]) {
                nums1.remove(nums1.peek());
                nums1.add(arr[i]);
            }
        }
        System.out.println(k+"rd largest element is: "+nums.peek());
        System.out.println(k+"rd smallest element is: "+nums1.peek());
    }
}