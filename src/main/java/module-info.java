module sio.pretp {
    requires javafx.controls;
    requires javafx.fxml;


    opens sio.pretp to javafx.fxml;
    exports sio.pretp;
}