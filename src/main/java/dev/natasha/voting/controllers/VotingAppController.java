package dev.natasha.voting.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class VotingAppController {
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
