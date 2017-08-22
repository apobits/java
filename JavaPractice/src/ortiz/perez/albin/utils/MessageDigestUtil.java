/**
 * 
 */
package ortiz.perez.albin.utils;

import java.math.BigInteger;
import java.security.MessageDigest;

/**
 * @author Administrador
 *
 */
public class MessageDigestUtil {

	public static BigInteger getHashValue(String algorithm, String value) {
		BigInteger convertedValue = null;
		try {
			MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
			convertedValue = new BigInteger(messageDigest.digest(value.getBytes()));
		} catch (Exception e) {
			System.out.println(e);
		}

		return convertedValue;
	}
	
	public static void main(String args[]){
		
		System.out.println(getHashValue("MD5", "12345678").toString(16));
	}

}
