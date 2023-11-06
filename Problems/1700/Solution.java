/**
 students = [1,1,1], sandwiches = [0,1,1]

 Time complexity: O(n)
 Space complexity: O(n)

 */
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        ArrayList<Integer> s = new ArrayList<>();
        ArrayList<Integer> w = new ArrayList<>();
        int[] tmp = new int[2];
        for (int i = 0; i < students.length; i++) {
            s.add(students[i]);
            w.add(sandwiches[i]);
            tmp[students[i]]++;
        }
        while (
                s.size() != 0 &&
                        !(s.get(0) != w.get(0) && (tmp[0] == 0 || tmp[1] == 0))
        ) {
            if (s.get(0) == w.get(0)) {
                tmp[s.get(0)]--;
                s.remove(0);
                w.remove(0);
            } else {
                s.add(s.get(0));
                s.remove(0);
            }
        }

        return s.size();
    }
}