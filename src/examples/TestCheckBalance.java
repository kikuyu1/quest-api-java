package examples;

import questapi.CheckBalance;

/**
 * Created by nderitu on 7/27/16.
 */
public class TestCheckBalance  {

    public static void main(String[] args){
        CheckBalance balance = new CheckBalance("username", "your key");
        balance.check();
    }
}
