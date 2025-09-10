import java.util.*;

class Solution {

    public int m = (int)1e9 + 7;

    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        Stack<Integer> st  = new Stack<>();

        int[] smallerright = new int[n];
        int[] smallerleft = new int[n];

        // Find next smaller element to the right
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                smallerright[st.pop()] = i;
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            smallerright[st.pop()] = n;
        }

        // Find previous smaller element to the left
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                smallerleft[st.pop()] = i;
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            smallerleft[st.pop()] = -1;
        }

        long totalsum = 0;
        for (int i = 0; i < n; i++) {
            long left = i - smallerleft[i];
            long right = smallerright[i] - i;
            long numberOfSubarray = (left * right) % m;
            totalsum = (totalsum + (numberOfSubarray * arr[i]) % m) % m;
        }
    return (int)totalsum ;
    }
}