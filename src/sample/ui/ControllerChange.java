package sample.ui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import sample.weapon.parametrs.Range;
import sample.weapon.parametrs.LightWeapon;
import sample.weapon.weapon.*;

public class ControllerChange {
    @FXML
    Text t_info;

    @FXML
    Button btn_change;

    @FXML
    RadioButton radio_engine1;
    Range range1 = LightWeapon.getParametrs();

    @FXML
    RadioButton radio_engine2;
    Range range2 = LightWeapon.getParametrs();

    @FXML
    TextField tf_model;

    @FXML
    public void initialize() {
        Weapon current = XCell.changeWeapon;

        t_info.setText(current.getWeaponType() + "   " + current.getWeaponModel()
                + "   " + "range = " + current.getRange());

        ToggleGroup group = new ToggleGroup();
        radio_engine1.setToggleGroup(group);
        radio_engine2.setToggleGroup(group);

        if (current.getRange().equals("1"))
            radio_engine1.setSelected(true);
        else
            radio_engine2.setSelected(true);

        tf_model.setText(current.getWeaponModel());

        btn_change.setOnMousePressed(event -> {
            String model = tf_model.getText();
            if (model != null) {
                Range range = range1;
                if (radio_engine2.isSelected())
                    range = range2;
                current.setWeaponModel(model);
                current.setRange(range);
                XCell.changeWeapon = null;

                Stage stage = (Stage) btn_change.getScene().getWindow();
                stage.close();

            }
        });
    }
}
