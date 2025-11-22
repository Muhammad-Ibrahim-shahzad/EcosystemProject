module com.ecosystem.ecosystemproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ecosystem.ecosystemproject to javafx.fxml;
    exports com.ecosystem.ecosystemproject;
}