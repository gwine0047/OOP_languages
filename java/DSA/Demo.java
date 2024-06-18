import java.util.Random;
public class Demo
{
        public static void main(String[] args)
        {
                int[] nums = {2, 4, 6, 8,12,13,16,19,22,25,26,29,31};
                int target = 16;

                int result = binarySearch(nums, target);
                // binary search using a recursive function
                int result1 = binarySearch1(nums, target, 0, nums.length-1);
                int result2 = linearSearch(nums, target);


                if(result1 != -1)
                    System.out.println("Element found at index: " + result1);
                else
                    System.out.println("Element not found");
        }

        public static int linearSearch(int[] nums, int target)
        {
            int steps = 0;
            for(int i = 0; i < nums.length; i++)
            {
                steps++;
                if(nums[i] == target)
                {
                    System.out.println("The number of steps taken by Linear search: "+ steps);
                    return i;
                }
            }
            return -1;
        }

        public static int binarySearch(int[] nums, int target)
        {
            int steps = 0;
            int left = 0; //starting point
            int right = nums.length - 1; //ending point

            while (left <= right)
            {
                steps++;
                int mid = (left + right)/2;
                if(nums[mid] == target)
                {
                    System.out.println("The number of steps taken by Bianrysearch: "+ steps);
                    return mid;
                }
                else if (nums[mid] < target)
                {
                    left = mid + 1;
                }
                else
                {
                    right = mid - 1;
                }
            }
            return -1;
        }

        public static int binarySearch1(int[] nums, int target, int left, int right)
        {
            // You can alternatively allot left to 0 and right to length-1

            if(left <= right)
            {
                int mid = (left+right)/2;
                if(nums[mid] == target)
                    return mid;
                else if(nums[mid] < target)
                    return binarySearch1(nums, target, mid+1, right);
                else
                    return binarySearch1(nums, target, left, mid-1);
            }
            return -1;
        }
}  