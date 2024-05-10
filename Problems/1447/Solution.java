//
class Solution {
    public List<String> simplifiedFractions(int n) {
        List<String> res = new ArrayList<>();
        for (int nom = 1; nom < n; nom++) {
            for (int den = 2; den <= n; den++) {
                if (gcd(nom,den) == 1 && nom < den) {
                    res.add("" + nom + "/" + den);
                }
            }
        }

        return res;
    }

    private int gcd(int i, int j) {
        if (j == 0) {
            return i;
        }
        return gcd(j, i%j);
    }
}