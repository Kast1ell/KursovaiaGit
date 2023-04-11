package com.marketing;

import com.marketing.DataBase.Utilities.UtilityUser;
import com.marketing.DataBase.pojoes.Users;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class RegistryCont implements Initializable {
    public TextField LoginField;
    public TextField PasswordField;
    public Label option;

    public RegistryCont() throws IOException {

    }

    @Override
    public void initialize(URL url, ResourceBundle resources) {

    }

    public void onButtonRegClick(ActionEvent actionEvent) {
        String UserLogin = LoginField.getText();
        String UserPassword = PasswordField.getText();
        UtilityUser usr = new UtilityUser();
        List<Users> lstOfUsers = usr.findLogin(UserLogin);
        if (lstOfUsers.get(0).getLogin().equals(UserLogin) && (lstOfUsers.get(0).getPassword().equals(UserPassword))) {
            option.setText("Nice!!");
        }
    }

    public void onButtonRegClick2(ActionEvent actionEvent) {
    }
}
