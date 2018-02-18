package aes.crypto;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.security.auth.kerberos.EncryptionKey;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.Crypt;
public class Test{
public static void main(String[] args) throws InvalidKeyException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, BadPaddingException, IllegalBlockSizeException, UnsupportedEncodingException {
	Crypto c = new Crypto();
	String ne = c.encrypt("mayank");
	System.out.println(ne);
	String a = c.decrypt(ne);
	System.out.println(a);
}

}
