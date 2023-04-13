package coc.final_project;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.io.IOException;
import java.util.Random;

public class bad_end {
    statue statue = new statue();
    @FXML
    ImageView BE;
    @FXML
    Text text;
    @FXML
    public void OnFinishPressed() throws IOException {
        COC.currentStage.close();
    }
}
