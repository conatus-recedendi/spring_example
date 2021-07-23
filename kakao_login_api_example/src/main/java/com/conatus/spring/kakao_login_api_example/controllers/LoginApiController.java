
/*
package com.conatus.spring.kakao_login_api_example.controllers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.json.JSONObject;

@RestController
public class LoginApiController {
	@GetMapping(value="/")
	public String home() {
		return "Hello World";
	}

	@RequestMapping(value = "/login/{access_token}", method=RequestMethod.GET)
	public String getAccessToken(@PathVariable String access_token) throws Exception {
		URL url = new URL("https://kapi.kakao.com/v2/user/me");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestProperty("Authorization", "Bearer " + access_token);
		con.setRequestMethod("GET");

		BufferedReader in = new BufferedReader(
			new InputStreamReader(con.getInputStream()));

		String inputLine;
		StringBuffer content = new StringBuffer();
		while ((inputLine = in.readLine()) != null)
			content.append(inputLine);
		in.close();
		con.disconnect();

		// "https://kapi.kakao.com/v2/user/me" \
  		// -H "Authorization: Bearer {ACCESS_TOKEN}" \
  		// -d 'property_keys=["kakao_account.email"]'
		JSONObject jObject = new JSONObject(content.toString());
		// TODO: only return the accont_email. 
		return (jObject.toString());
	}
}

*/