package dev.natasha.voting.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import dev.natasha.voting.VotingApp;
import dev.natasha.voting.navigator;

import java.io.IOException;

public class VotingAppController {
    @FXML
    private Label labelText;

    @FXML
    protected void onVoterButtonClick() throws IOException {
        var stage = (Stage) labelText.getScene().getWindow();
        stage.setScene(navigator.getScene("voting-view.fxml"));
        stage.setTitle("Voting View");
    }

    @FXML
    protected void onAuditorButtonClick() {}

    @FXML
    protected void onAdministratorButtonClick() {}

    @FXML
    private Label candidateSelectionText;

    @FXML
    protected void onCandidateOneButtonClick() {
        candidateSelectionText.setText("You voted for Candidate One!");
    }

    @FXML
    protected void onCandidateTwoButtonClick() {
        candidateSelectionText.setText("You voted for Candidate Two!");
    }
}
