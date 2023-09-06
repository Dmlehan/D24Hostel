package com.d24.manage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class AppInitializer extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/view/dashboard_form.fxml"))));
        stage.setTitle("D24 Hostel Management System");
        stage.getIcons().add(new Image("asset/icon/icon1.png"));
        stage.show();
    }

    public static void main(String[] args) {

        launch();
    }
}