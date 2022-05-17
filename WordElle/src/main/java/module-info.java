module com.example.wordelle {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.wordelle to javafx.fxml;
    exports com.example.wordelle;
}