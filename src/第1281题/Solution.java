package 第1281题;


class Solution {
    public int subtractProductAndSum(int n) {
        int m = 0;
        int sum = 0;
        int product = 1;
        while (n > 0) {
            m = n % 10;
            sum = sum + m;
            product = product * m;
            n = n / 10;
        }
        System.out.println(sum);
        System.out.println(product);
        return product - sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.subtractProductAndSum(4421);
        System.out.println(i);
    }
}