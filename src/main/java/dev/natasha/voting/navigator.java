package dev.natasha.voting;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;

public class navigator {
    /**
     * Returns a scene from an FXML file path.
     * @param name The name of the FXML file to load
     * @return The built scene from FXML.
     */
    public static Scene getScene(String name) throws IOException {
        var fxmlLoader = new FXMLLoader(VotingApp.class.getResource(name));
        return new Scene(fxmlLoader.load());
    }

}
