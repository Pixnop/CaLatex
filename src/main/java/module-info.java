module com.example.calatex {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calatex to javafx.fxml;
    exports com.example.calatex;
}