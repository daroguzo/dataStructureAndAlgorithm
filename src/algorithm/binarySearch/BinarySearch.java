package algorithm.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,6,7,8,10,15,17};
        int target = 15;
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.solution(arr, target));
    }

    private int solution(int[] arr, int target) {
        int left = 0, right = arr.length - 1, mid;

        while (left <= right) {
            mid = (left + right) / 2;

            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
