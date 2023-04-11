package com.marketing;

import com.marketing.RegistryCont;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class Start extends Application {



    @Override
    public void start(Stage stage) throws IOException, SQLException {

        FXMLLoader fxmlLoader1 = new FXMLLoader(RegistryCont.class.getResource("Registry.fxml"));
        Scene scene1 = new Scene(fxmlLoader1.load(), 500, 200);
        stage.setTitle("Hello!");
        stage.setScene(scene1);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

