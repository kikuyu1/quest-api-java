package examples;

import questapi.GetMarketingLists;

/**
 * Created by nderitu on 7/27/16.
 */
public class TestGetMarketingLists {

    public static void main(String[] args){
        GetMarketingLists lists = new GetMarketingLists("username", "your key");
        lists.get();

    }
}
