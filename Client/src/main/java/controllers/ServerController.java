package controllers;
//import spiffyUrlManipulator;
import models.Id;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.SingleClientConnManager;
import org.apache.http.util.EntityUtils;

import javax.json.JsonString;
import javax.swing.*;
import java.io.IOException;


public class ServerController {
    private String rootURL = "http://zipcode.rocks:8085/ids";

    private HttpClient client = new DefaultHttpClient();

    private ServerController svr = new ServerController();


    public ServerController() {}

    public ServerController shared() {
        return svr;
    }

    public JsonString idGet() throws IOException {
        HttpUriRequest newRequest = new HttpGet(rootURL);
        HttpResponse response = client.execute(newRequest);
        String json = EntityUtils.toString(response.getEntity());
        // url -> /ids/
        // send the server a get with url
        // return json from server
//                {
//                    "userid": " ",
//                "name": "defect",
//                "github": "defect-account"
//},
        return null;
    }
    public JsonString idPost(Id id) {

        // url -> /ids/
        // create json from Id
        // request
        // reply
        // return json
        return null;
    }
    public JsonString idPut(Id id) {
        // url -> /ids/
        return null;
    }


}

// ServerController.shared.doGet()