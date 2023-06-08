module com.example.aqa_tms_gui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.aqa_tms_gui to javafx.fxml;
    exports com.example.aqa_tms_gui;
}