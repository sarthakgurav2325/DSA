class solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int result = 0;

        for (int num : nums) {
            if ((num & 1) == 0) { // check even
                result |= num;    // OR operation
            }
        }

        return result;
    }

    public static void main(String[] args) {
        solution sol = new solution();
        int[] nums = {1, 2, 3, 4, 5, 6};
        int result = sol.evenNumberBitwiseORs(nums);
        System.out.println("Bitwise OR of even numbers: " + result);
    }
}