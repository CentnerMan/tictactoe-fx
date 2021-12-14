module ru.vlsv.tictactoefx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires eu.hansolo.tilesfx;

    opens ru.vlsv.tictactoefx to javafx.fxml;
    exports ru.vlsv.tictactoefx;
}