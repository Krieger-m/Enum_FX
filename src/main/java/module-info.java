module com.example.enum_fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.enum_fx to javafx.fxml;
    exports com.example.enum_fx;
}