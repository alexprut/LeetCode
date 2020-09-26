/*
swap last to first
insert front max

*/

class Solution {
	public int[] deckRevealedIncreasing(int[] deck) {
		LinkedList<Integer> l = new LinkedList<>();
		Arrays.sort(deck);
		for (int i = deck.length - 1; i >= 0; i--) {
			if (l.size() > 0) {
				l.addFirst(l.pollLast());
			}
			l.addFirst(deck[i]);
		}
		for (int i = 0; i < deck.length; i++) {
			deck[i] = l.get(i);
		}

		return deck;
	}
}