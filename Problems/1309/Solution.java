class Solution {
	public String freqAlphabets(String s) {
		s = s.replace("10#", "j");
		s = s.replace("11#", "k");
		s = s.replace("12#", "l");
		s = s.replace("13#", "m");
		s = s.replace("14#", "n");
		s = s.replace("15#", "o");
		s = s.replace("16#", "p");
		s = s.replace("17#", "q");
		s = s.replace("18#", "r");
		s = s.replace("19#", "s");
		s = s.replace("20#", "t");
		s = s.replace("21#", "u");
		s = s.replace("22#", "v");
		s = s.replace("23#", "w");
		s = s.replace("24#", "x");
		s = s.replace("25#", "y");
		s = s.replace("26#", "z");
		s = s.replace("1", "a");
		s = s.replace("2", "b");
		s = s.replace("3", "c");
		s = s.replace("4", "d");
		s = s.replace("5", "e");
		s = s.replace("6", "f");
		s = s.replace("7", "g");
		s = s.replace("8", "h");
		s = s.replace("9", "i");
		return s;
	}
}