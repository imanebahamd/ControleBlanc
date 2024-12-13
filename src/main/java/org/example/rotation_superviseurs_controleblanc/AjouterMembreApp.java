package org.example.rotation_superviseurs_controleblanc;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AjouterMembreApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setHgap(10);
        grid.setVgap(10);

        TextField nomField = new TextField();
        TextField prenomField = new TextField();
        TextField emailField = new TextField();
        TextField phoneField = new TextField();

        grid.add(nomField, 1, 0);
        grid.add(prenomField, 1, 1);
        grid.add(emailField, 1, 2);
        grid.add(phoneField, 1, 3);

        Button insererButton = new Button("Insérer");
        grid.add(insererButton, 1, 4);


        insererButton.setOnAction(e -> {
            String identifiant = java.util.UUID.randomUUID().toString();
            String nom = nomField.getText();
            String prenom = prenomField.getText();
            String email = emailField.getText();
            String phone = phoneField.getText();

            Membre membre = new Membre(identifiant, nom, prenom, email, phone);
            MembreDao membreDao = new MembreDaoImpl();
            membreDao.inserer(membre);
            System.out.println("Membre inséré : " + membre);
        });

        primaryStage.setScene(new Scene(grid, 300, 250));
        primaryStage.setTitle("Ajouter un membre");
        primaryStage.show();
    }

    public static void main(String[] args) {

        MembreDaoImpl membreDao = new MembreDaoImpl();

        // Charger les membres depuis le fichier CSV
        membreDao.chargerListeMembre("src/main/resources/membres.csv");

        // Afficher les membres
        membreDao.afficherMembres();
        launch(args);


    }
}
