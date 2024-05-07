module com.example.demojavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens com.example.demojavafx to javafx.fxml;
    exports com.example.demojavafx;
}