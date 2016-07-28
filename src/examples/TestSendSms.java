package examples;

import questapi.SendSms;

import java.util.ArrayList;

/**
 * Created by nderitu on 7/27/16.
 */
public class TestSendSms {



    public static void main(String[] args){
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("+25472...");
        numbers.add("+25474...");

        SendSms sms = new SendSms("username", "your key", "sender id", numbers, "message");
        //sms.send();

    }
}
