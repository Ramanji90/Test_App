package utils;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Utils {

	public static String encoder(String pass)
	{
       Encoder encoder = Base64.getEncoder();
       String encodedPass = encoder.encodeToString(pass.getBytes());
       return encodedPass;
	}
	
	public static byte[] decoder(String encodedpass)
	{
		//decoder tt
       Decoder decoder = Base64.getDecoder();
       byte[] decodedPass = decoder.decode(encodedpass.getBytes());
       return decodedPass;
	}

}
