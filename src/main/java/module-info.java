module com.example.dirtyauth {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dirtyauth to javafx.fxml;
    exports com.example.dirtyauth;
}