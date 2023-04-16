/***
 e.g. 9 => 9
 e.g. 99 => 9 * 2 = 18
 e.g. 999 => 9 * 3 = 27
 e.g. 9999 => 9 * 4 = 36

 1,000,000 max number

 */
class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int tmp = highLimit;
        int mapNr = 9;
        while (tmp != 0) {
            mapNr += 9;
            tmp /= 10;
        }
        int[] map = new int[mapNr];
        for (int i = lowLimit; i <= highLimit; i++) {
            int nr = i;
            int tmpNr = 0;
            while (nr != 0) {
                tmpNr += nr % 10;
                nr /= 10;
            }
            map[tmpNr]++;
        }

        int counter = 0;
        for (int i = 0; i < map.length; i++) {
            if (counter < map[i]) { counter = map[i]; }
        }

        return counter;
    }
}