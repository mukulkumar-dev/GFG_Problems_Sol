class Solution {
    public static ArrayList<Integer> primeFac(int n) {
        // code here
        ArrayList<Integer> factors = new ArrayList<>();
        
        if (n % 2 == 0) {
            factors.add(2);
            while (n % 2 == 0) {
                n /= 2;
            }
        }

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                factors.add(i);
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        if (n > 2) {
            factors.add(n);
        }

        return factors;
    }
}