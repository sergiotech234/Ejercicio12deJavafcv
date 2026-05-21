package org.example;

// Importación de clases necesarias de JavaFX
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// Clase principal que hereda de Application
public class Main extends Application {

    // Método que inicia la interfaz gráfica
    @Override
    public void start(Stage stage) {

        // Etiqueta que indica al usuario qué debe escribir
        Label lblDireccion = new Label("Ingrese una dirección:");

        // Campo de texto para introducir la dirección
        TextField txtDireccion = new TextField();

        // Texto guía dentro del campo
        txtDireccion.setPromptText("Ejemplo: Calle Mayor 10");

        // Creación del botón
        Button btnConfirmar = new Button("Confirmar");

        // Evento que ocurre al pulsar el botón
        btnConfirmar.setOnAction(e -> {

            // Guarda el texto escrito en una variable
            String direccion = txtDireccion.getText();

            // Comprueba que el campo no esté vacío
            if (!direccion.isEmpty()) {

                // Ventana emergente informativa
                Alert alert = new Alert(Alert.AlertType.INFORMATION);

                // Título de la ventana
                alert.setTitle("Confirmación");

                // Cabecera vacía
                alert.setHeaderText(null);

                // Mensaje mostrado
                alert.setContentText(
                        "Dirección ingresada: " + direccion
                );

                // Muestra la ventana y espera
                alert.showAndWait();

            } else {

                // Ventana emergente de advertencia
                Alert alert = new Alert(Alert.AlertType.WARNING);

                // Título
                alert.setTitle("Advertencia");

                // Sin cabecera
                alert.setHeaderText(null);

                // Mensaje de aviso
                alert.setContentText(
                        "Ingrese una dirección."
                );

                // Mostrar ventana
                alert.showAndWait();
            }
        });

        // VBox organiza elementos verticalmente
        // El número 10 indica separación entre componentes
        VBox root = new VBox(
                10,
                lblDireccion,
                txtDireccion,
                btnConfirmar
        );

        // Añade márgenes internos alrededor del VBox
        root.setPadding(new Insets(15));

        // Crear escena con tamaño 350x180
        Scene scene = new Scene(root, 350, 180);

        // Título de la ventana
        stage.setTitle("Formulario Dirección");

        // Asigna la escena a la ventana
        stage.setScene(scene);

        // Mostrar ventana
        stage.show();
    }

    // Método principal que inicia la aplicación
    public static void main(String[] args) {
        launch();
    }
}
