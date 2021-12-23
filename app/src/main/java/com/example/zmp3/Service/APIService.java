package com.example.zmp3.Service;

public class APIService {

    private static String base_url="https://pharmacopoeial-tria.000webhostapp.com/Sever/";
   // private static String base_url="https://redirts.000webhostapp.com/Server/";
    public static Dataservice getService(){
        return APIRetrofitClient.getClient(base_url).create(Dataservice.class);
    }
}
