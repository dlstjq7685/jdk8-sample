package com.ysd.hash;

import com.ysd.start;

import java.math.BigInteger;
import java.security.MessageDigest;

public class Basic implements start {

    public Basic(){

    }

    private String getSHA256(String message){

        String hash = null;

        try{
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            digest.reset();
            digest.update(message.getBytes("utf-8"));
            hash = String.format("%064x",new BigInteger(1,digest.digest()));
        } catch (Exception e){

        }
        return hash;
    }

    private String getSHA512(String message){

        String hash = null;

        try{
            MessageDigest digest = MessageDigest.getInstance("SHA-512");
            digest.reset();
            digest.update(message.getBytes("utf-8"));
            hash = String.format("%0128x",new BigInteger(1,digest.digest()));
        } catch (Exception e){

        }
        return hash;
    }


    @Override
    public void run() {
        String testMessage = "this is hash generator test";

        System.out.println(testMessage);
        System.out.println("---------------------------------------------------");
        System.out.println(getSHA256(testMessage));
        System.out.println("---------------------------------------------------");
        System.out.println(getSHA512(testMessage));

    }
}
