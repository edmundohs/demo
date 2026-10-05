module com.ucv.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.ucv.demo to javafx.fxml;
    exports com.ucv.demo;
}