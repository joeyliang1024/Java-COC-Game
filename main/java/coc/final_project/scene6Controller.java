package coc.final_project;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.io.IOException;
public class scene6Controller {
    int back = 0;
    @FXML
    ImageView 電車圖;
    @FXML
    ImageView normal;
    @FXML
    ImageView hurt;
    @FXML
    ImageView crazy;
    @FXML
    ImageView crazyHurt;
    @FXML
    ImageView flashLight;
    @FXML
    Button 幸運判定;
    @FXML
    Text text;

    @FXML
    public void OnBackwardPressed() throws IOException {
        if(back==0) {
            COC.currentStage.setScene(COC.sceneSeven);//車廂七
            back = 1;
        }
        else if(back==1) {
            COC.currentStage.setScene(COC.sceneBE);//GG
        }
    }
    @FXML
    public void OnForwardPressed() throws IOException {
        COC.currentStage.setScene(COC.sceneFive);//車廂五
    }
    @FXML
    public void OnPaperPressed() throws IOException {
        text.setText("紙條上寫著：「只管前進吧 已經沒有退路了」");
    }
    @FXML
    public void OnFigurePressed() throws IOException {
        電車圖.setVisible(true);
    }
    @FXML
    public void OnLuckyPressed() throws IOException {
        int luck = 0;
        luck = (int)(Math.random()*10);
        if(luck<=5){
            flashLight.setVisible(true);
            text.setText("你在椅子上發現手電筒");
        }
        幸運判定.setVisible(false);
    }
    @FXML
    public void OnPhotoPressed() throws IOException{
        電車圖.setVisible(false);
    }
}
