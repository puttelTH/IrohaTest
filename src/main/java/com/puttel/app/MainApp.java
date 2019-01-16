package com.puttel.app;

import com.puttel.app.iroha.IrohaApi;

public class MainApp {
    IrohaApi api;

    public MainApp(){
        api = new IrohaApi();
        api.getAccount("admin@test");
    }
}
