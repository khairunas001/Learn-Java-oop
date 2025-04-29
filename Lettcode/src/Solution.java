import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Membuat hashmap untuk menyimpan angka dan indeksnya
        HashMap<Integer, Integer> map = new HashMap<>();

        // Looping array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // angka yang dibutuhkan supaya jumlah jadi target

            // Cek apakah complement sudah ada di hashmap
            if (map.containsKey(complement)) {
                // Jika ada, kembalikan indeks dari complement dan indeks saat ini
                return new int[] { map.get(complement), i };
            }

            // Simpan angka saat ini ke hashmap
            map.put(nums[i], i);
        }

        // Jika tidak ketemu (sesuai constraints, ini tidak akan terjadi)
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = solution.twoSum(nums, target);

        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
    }
}
