package com.intuit.application.createjsonforintuitassignment.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;


@Service
public class CustomerService {

	 	
	
	public String processedCardNum(String cardNum) {
		
		Pattern PATTERN = Pattern.compile("[0-9]+");

        String message = cardNum;
        Matcher matcher = PATTERN.matcher(message);
        String maskingChar = "*";
        StringBuilder finalMask = new StringBuilder(maskingChar);

        while (matcher.find()) {
            String group = matcher.group();
            int groupLen = group.length();

            if(groupLen>4){
                for(int i=0; i<=group.length()-4; i++){
                    finalMask.append(maskingChar);
                }
                finalMask.append(group.substring(groupLen-4));
            }
            message = message.replace(group, finalMask);
        }
        return message;

		
		
		
	}
	
	

}
