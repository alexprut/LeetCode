class Solution {
	public String defangIPaddr(String address) {
		String defanged = "";
		for (int i = 0; i < address.length(); i++) {
			if (address.charAt(i) == '.') {
				defanged += "[.]";
			} else {
				defanged += address.charAt(i);
			}
		}
		return defanged;
	}
}