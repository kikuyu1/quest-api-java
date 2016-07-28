package examples;

import questapi.ScheduleSMS;

/**
 * Created by nderitu on 7/27/16.
 */
public class TestSceduleSMS {

    public static void main(String[] args){

        ScheduleSMS sms = new ScheduleSMS("username", "your key", "sender id", "+25472..", "message","2017-07-27 11:11:04");
        sms.schedule();

    }
}
