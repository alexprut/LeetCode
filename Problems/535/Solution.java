import java.security.*;

public class Codec {
	protected HashMap<String, String> map = new HashMap<>();

	// Encodes a URL to a shortened URL.
	public String encode(String longUrl) {
		map.put(md5(longUrl), longUrl);
		return md5(longUrl);
	}

	// Decodes a shortened URL to its original URL.
	public String decode(String shortUrl) {
		if (map.containsKey(shortUrl)) {
			return map.get(shortUrl);
		}
		return "";
	}

	public String md5(String md5) {
		try {
			java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
			byte[] array = md.digest(md5.getBytes());
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < array.length; ++i) {
				sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
			}
			return sb.toString();
		} catch (java.security.NoSuchAlgorithmException e) {
		}
		return "";
	}
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));