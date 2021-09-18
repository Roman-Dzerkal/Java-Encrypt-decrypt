module self.project.javaencryptdecrypt {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens self.project.javaencryptdecrypt to javafx.fxml;
    exports self.project.javaencryptdecrypt;
}