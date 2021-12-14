package ru.vlsv.tictactoefx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import ru.vlsv.tictactoefx.tools.Tools;

import static ru.vlsv.tictactoefx.tools.Tools.randomInt;

public class HelloController {

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText(Integer.toString(randomInt(1, 5)));
    }
}