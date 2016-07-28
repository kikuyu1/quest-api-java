package examples;

import questapi.AddContactToMarketing;

/**
 * Created by nderitu on 7/27/16.
 */
public class TestAddContactToMarketing {

    public static void main(String[] args){
        AddContactToMarketing addContactToMarketing = new AddContactToMarketing("your key", "your key", "list_id", "name", "phone");
        addContactToMarketing.add();
    }
}
