package com.example.springboot.user.demo.Service;

import com.example.springboot.user.demo.Test.User;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.Random;

@Service

public class UserService {
/*
    public void givenUsingPlainJava_whenGeneratingRandomStringUnbounded_thenCorrect() {
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);

        String generatedString = new String(array, Charset.forName("UTF-8"));


        System.out.println(generatedString);
    }
*/
private String generateRandomId() {
    SecureRandom secureRandom = new SecureRandom();
    String randomId = new BigInteger(32, secureRandom).toString();
    return randomId;

}
    public String randomfile( User user , int count) {
      //List<User> user = filename(count);
        String randomId = generateRandomId();
        user.setFirstname(randomId);
        user.setAvatar(randomId);
        user.setCity(randomId);
        user.setCompany(randomId);
        user.setEmail(randomId);
        user.setBirthDate(randomId);
        user.setJobposition(randomId);
        user.setCountry(randomId);
        user.setMobile(randomId);
        user.setUsername(randomId);
        return user.getAvatar() + " "+ user.getCity()+" "+user.getBirthDate()+" "+user.getCompany()+""+
                user.getFirstname()+""+user.getJobposition()+""+user.getEmail()+""+user.getUsername()+""+user.getMobile()+
                "" +user.getCountry();



    }

    public ByteArrayResource Filename(int count) {
    }
