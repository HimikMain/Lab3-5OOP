package sample.ui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;
import sample.weapon.weapon.Weapon;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class XCell extends ListCell<Weapon> {
    public static Weapon changeWeapon = null;
    HBox hbox = new HBox();
    Label type = new Label("");
    Label name = new Label("");
    Label speed = new Label("");
    Pane pane = new Pane();
    Button del = new Button("x");
    Button change = new Button("change");

    public XCell() {
        super();
        hbox.getChildren().addAll(type, name, speed, pane, change, del);
        HBox.setHgrow(pane, Priority.ALWAYS);
        change.setOnAction(event -> {
            try {
                changeWeapon = getItem();
                Parent root = FXMLLoader.load(new File("D:\\C#Лабы\\Lab3-5OOP\\out\\production\\OOP_Lab3\\sample\\change.fxml").toURI().toURL());
                Stage stage = new Stage();
                stage.setTitle("Change");
                stage.setScene(new Scene(root, 330, 145));
                stage.show();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        });
        del.setOnAction(event -> getListView().getItems().remove(getItem()));
    }

    @Override
    protected void updateItem(Weapon item, boolean empty) {
        super.updateItem(item, empty);
        setText(null);
        setGraphic(null);

        if (item != null && !empty) {
            type.setText(item.getWeaponType() + "   ");
            name.setText(item.getWeaponModel() + "   ");
            speed.setText("range = " + item.getRange());
            setGraphic(hbox);
        }
    }
}