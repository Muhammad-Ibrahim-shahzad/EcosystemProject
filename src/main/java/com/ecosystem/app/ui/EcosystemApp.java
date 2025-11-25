package com.ecosystem.app.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EcosystemApp extends Application {

    @Override
    public void start(Stage stage){

        MainView root = new MainView();
        Scene scene = new Scene(root,800,600);
        stage.setTitle("Ecosystem Simulator");
        stage.show();
    }
}
