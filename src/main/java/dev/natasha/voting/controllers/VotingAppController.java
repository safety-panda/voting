package dev.natasha.voting.controllers;

import dev.natasha.voting.objects.Election;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;
import dev.natasha.voting.VotingApp;
import dev.natasha.voting.navigator;
import dev.natasha.voting.objects.Election;

import java.io.IOException;

public class VotingAppController {
    private Election election = Election.getInstance();

    @FXML
    private Label labelText;

    @FXML
    private MenuItem homeTab;

    @FXML
    protected void onHomeButtonClick() throws IOException {
        var stage = (Stage) labelText.getScene().getWindow();
        stage.setScene(navigator.getScene("welcome-view.fxml"));
        stage.setTitle("Voting App");
    }

    @FXML
    protected void onVoterButtonClick() throws IOException {
        var stage = (Stage) labelText.getScene().getWindow();
        stage.setScene(navigator.getScene("voter-view.fxml"));
        stage.setTitle("Voter View");
    }

    @FXML
    protected void onRegisterVoter() throws IOException {
        // code
    }

    @FXML
    protected void onVoteInElection() throws IOException {
        var stage = (Stage) labelText.getScene().getWindow();
        stage.setScene(navigator.getScene("voting-view.fxml"));
        stage.setTitle("Voting View");
    }

    @FXML
    protected void onAuditorButtonClick() throws IOException {
        var stage = (Stage) labelText.getScene().getWindow();
        stage.setScene(navigator.getScene("results-view.fxml"));
        stage.setTitle("Auditor View");
    }

    @FXML
    protected void onAdministratorButtonClick() throws IOException {
        var stage = (Stage) labelText.getScene().getWindow();
        stage.setScene(navigator.getScene("results-view.fxml"));
        stage.setTitle("Administrator View");
    }

    @FXML
    private Label candidateSelectionText;

    @FXML
    protected void onCandidateOneButtonClick() {
        election.voteForCandidateOne();
        candidateSelectionText.setText("You voted for Candidate One!");
    }

    @FXML
    protected void onCandidateTwoButtonClick() {
        election.voteForCandidateTwo();
        candidateSelectionText.setText("You voted for Candidate Two!");
    }

    @FXML
    private Label resultsText;

    @FXML
    protected void onResultsButtonClick() {
        resultsText.setText(election.getElectionResult());
    }
}
