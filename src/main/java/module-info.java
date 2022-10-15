module com.example.inheritanceofmyfamily {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.inheritanceofmyfamily to javafx.fxml;
    exports com.example.inheritanceofmyfamily;
}