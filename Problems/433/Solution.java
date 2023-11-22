/**
 Time Complexity: O()
 Space Complexity: O()
 */
class Solution {
    String endGene;
    HashSet<String> set = new HashSet<>();

    public int minMutation(String startGene, String endGene, String[] bank) {
        set.add(startGene);
        for (int i = 0; i < bank.length; i++) { set.add(bank[i]); }
        this.endGene = endGene;

        return visit(0, startGene);
    }

    public int visit(int c, String startGene) {
        if (startGene.equals(endGene)) { return c; }
        set.remove(startGene);
        int min = -1;
        char[] genes = new char[] {'A', 'C', 'G', 'T'};
        for (int i = 0; i < startGene.length(); i++) {
            for (int j = 0; j < genes.length; j++) {
                String newGene = startGene.substring(0, i) + genes[j] + startGene.substring(i + 1, startGene.length());
                if (set.contains(newGene)) {
                    int newC = visit(c + 1, newGene);
                    if (newC != -1) {
                        if (min == -1) {
                            min = newC;
                        } else {
                            min = Math.min(min, newC);
                        }
                    }
                }
            }
        }

        return min;
    }
}