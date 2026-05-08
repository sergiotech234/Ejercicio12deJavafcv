package org.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        // Etiqueta
        Label lblDireccion = new Label("Ingrese una dirección:");

        // Campo de texto
        TextField txtDireccion = new TextField();
        txtDireccion.setPromptText("Ejemplo: Calle Mayor 10");

        // Botón
        Button btnConfirmar = new Button("Confirmar");

        // Evento del botón
        btnConfirmar.setOnAction(e -> {

            String direccion = txtDireccion.getText();

            if (!direccion.isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Confirmación");
                alert.setHeaderText(null);
                alert.setContentText("Dirección ingresada: " + direccion);
                alert.showAndWait();
            } else {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Advertencia");
                alert.setHeaderText(null);
                alert.setContentText("Ingrese una dirección.");
                alert.showAndWait();
            }
        });

        // Layout
        VBox root = new VBox(10, lblDireccion, txtDireccion, btnConfirmar);
        root.setPadding(new Insets(15));

        // Escena
        Scene scene = new Scene(root, 350, 180);

        stage.setTitle("Formulario Dirección");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}