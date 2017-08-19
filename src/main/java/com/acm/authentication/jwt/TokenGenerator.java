package com.acm.authentication.jwt;

import java.util.HashMap;
import java.util.Map;

import com.auth0.jwt.JWTSigner;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.JWTVerifyException;

public class TokenGenerator 
{

	final static String issuer = "https://kpp.kipstor.net";
	final static String secret = "ij8UdaYo";

	public static Token createToken(String username) 
	{
		long iat = System.currentTimeMillis() / 1000l;
		long exp = iat + 60L;

		final JWTSigner signer = new JWTSigner(secret);
		final HashMap<String, Object> claims = new HashMap<String, Object>();
		claims.put("iss", issuer);
		claims.put("exp", exp);
		claims.put("iat", iat);
		claims.put("user", username);

		String jwt = signer.sign(claims);

		return new Token(username, jwt);
	}

	public static boolean verify(String token) 
	{
		try 
		{
			JWTVerifier verifier = new JWTVerifier(secret);
			Map<String, Object> claims = verifier.verify(token);
			return true;
		} 
		catch (Exception e) 
		{
			return false;
		}
	}

}
