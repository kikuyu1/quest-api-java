package questapi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

/**
 * Created by nderitu on 7/27/16.
 */
public class AddContactToMarketing {
    private String url = "http://account.questdesigners.com/API/?action=add_to_list";
    private String username;
    private String api_key;
    private String list_id;
    private String name;
    private String phone;

    public AddContactToMarketing() {

    }

    public AddContactToMarketing(String username, String api_key, String list_id, String name, String phone) {
        this.username = username;
        this.api_key = api_key;
        this.list_id = list_id;
        this.name = name;
        this.phone = phone;
    }

    public void add(){
        String final_url = makeUrl();

        try {
            URL obj = new URL(final_url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();

            // optional default is GET
            con.setRequestMethod("GET");

            //add request header
            con.setRequestProperty("User-Agent", "Mozilla/5.0");

            int responseCode = con.getResponseCode();
            System.out.println("\nSending 'GET' request to URL : " + final_url);
            System.out.println("Response Code : " + responseCode);

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            //print result
            System.out.println(response.toString());
        }catch (Exception e){
            System.out.println(e);
        }

    }

    private String makeUrl(){
        if(username == null)
            throw new IllegalArgumentException("username cannot be null");
        if (api_key == null)
            throw  new  IllegalArgumentException("Api key cannot be null");
        if (list_id == null)
            throw new IllegalArgumentException("List_id cannot be null");
        if (name == null)
            throw new IllegalArgumentException("you have not supplied any name");
        if (phone == null)
            throw new  IllegalArgumentException("phone cannot be null");

        String u = url+"&username="+username+"&api_key="+api_key+"&list_id="+list_id+"&name="+name+"&phone="+phone;
        System.out.println(u);
        return u;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getApi_key() {
        return api_key;
    }

    public void setApi_key(String api_key) {
        this.api_key = api_key;
    }

    public String getList_id() {
        return list_id;
    }

    public void setList_id(String list_id) {
        this.list_id = list_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
