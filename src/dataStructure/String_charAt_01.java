package dataStructure;

public class String_charAt_01 {
    public static void main(String[] args) {
        String nums1 = "123";
        String nums2 = "888";
        System.out.println(new String_charAt_01().solve(nums1, nums2));
    }

    private String solve(String nums1, String nums2) {
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        int length1 = nums1.length() - 1;
        int length2 = nums2.length() - 1;

        while (length1 >= 0 || length2 >= 0) {
            int n1 = 0, n2 = 0;
            if (length1 >= 0) {
                n1 = nums1.charAt(length1) - '0';
            }
            if (length2 >= 0) {
                n2 = nums2.charAt(length2) - '0';
            }
            int sum = n1 + n2 + carry;
            carry = sum / 10;
            sb.append(sum % 10);
            length1--;
            length2--;
        }
        if (carry != 0) {
            sb.append(carry);
        }

        return sb.reverse().toString();
    }

}
