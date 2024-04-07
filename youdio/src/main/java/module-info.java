module com.shinzuu.youdio {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.shinzuu.youdio to javafx.fxml;
    exports com.shinzuu.youdio;
}
