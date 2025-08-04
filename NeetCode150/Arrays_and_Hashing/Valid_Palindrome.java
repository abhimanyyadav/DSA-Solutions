class Solution {
    public boolean isPalindrome(String s) {
        // Step 1: Normalize the string
        String stu = s.trim().toLowerCase();

        int left = 0;
        int right = stu.length() - 1;

        // Step 2: Use two pointers
        while (left < right) {
            // Skip non-alphanumeric characters from the left
            while (left < right && !Character.isLetterOrDigit(stu.charAt(left))) {
                left++;
            }

            // Skip non-alphanumeric characters from the right
            while (left < right && !Character.isLetterOrDigit(stu.charAt(right))) {
                right--;
            }

            // Step 3: Compare characters
            if (stu.charAt(left) != stu.charAt(right)) {
                return false;
            }

            // Move both pointers inward
            left++;
            right--;
        }

        // All characters matched
        return true;
    }
}
