package blockchain;
import java.io.UnsupportedEncodingException;
import java.security.*;

public class ApplyHash {

	public String applyHashingAlgorithm(String input) {

		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			byte[] hash = md.digest(input.getBytes("UTF-8"));
			String hex = javax.xml.bind.DatatypeConverter.printHexBinary(hash);
			return hex;
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}

}

