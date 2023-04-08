package controllers;
//import spiffyUrlManipulator;
import models.Id;

import javax.json.JsonString;
import javax.swing.*;
import java.net.HttpURLConnection;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient;
import java.io.IOException;

public class ServerController {
    private String rootURL = "http://zipcode.rocks:8085/ids";

    private ServerController svr = new ServerController();

    private ServerController() {}

    public ServerController shared() {
        return svr;
    }

    public JsonString idGet() {
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