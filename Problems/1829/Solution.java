/**
 OR / XOR
 0 0 => 0 / 0
 1 1 => 1 / 0
 1 0 => 1 / 1
 0 1 => 1 / 1

 4 bits
 |
 10101100
 0011

 Time complexity: O(n*k)

 00 => (11)
 01 => 01 => (10)
 01 => 00 => (11)
 11 => 11 => (00)

 3 bits
 |
 (2) 0010 => (101 - 5)
 (3) 0011 => 0001 => (110 - 6)
 (4) 0100 => 0101 => (010 - 2)
 (7) 0111 => 0010 => (101 - 5)
 */
class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int currentVal = 0;
        int max = (1 << maximumBit) - 1;
        int res[] = new int[nums.length];

        for(int e : nums) currentVal ^= e;

        for(int i = 0; i < nums.length; i++){
            res[i] = currentVal ^ max;
            currentVal ^= nums[nums.length - i - 1];
        }
        return res;
    }
}