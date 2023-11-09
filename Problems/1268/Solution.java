/**
 Time complexity: O(n*m)
 Space complexity: O(n)
 */
class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> res = new ArrayList<>();
        PriorityQueue<String> q = new PriorityQueue<>((s1,s2) -> s1.compareTo(s2));
        for (int i = 1; i <= searchWord.length(); i++) {
            String tmp = searchWord.substring(0, i);
            for (int j = 0; j < products.length; j++) {
                if (products[j].startsWith(tmp)) {
                    q.offer(products[j]);
                }
            }

            List<String> r = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                if (q.peek() != null) {
                    r.add(q.poll());
                }
            }
            q.clear();
            res.add(r);
        }

        return res;
    }
}