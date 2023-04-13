package coc.final_project;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.io.IOException;

public class scene3Controller {
    //有無帶上男人
    boolean man=false;
    //有無找到鑰匙
    boolean key1=false;
    //有無詢問資訊
    boolean ask=false;
    @FXML
    Button finding;
    @FXML
    Button persuade;
    @FXML
    Button Persuademan;
    @FXML
    Button findsuitcase;
    @FXML
    Button Observe;
    @FXML
    Text text;
    @FXML
    Button backward;
    @FXML
    ImageView key;


    @FXML
    public void OnBackwardPressed() throws IOException {
        COC.currentStage.setScene(COC.sceneBE);//GG
    }
    @FXML
    public void OnForwardPressed() throws IOException {
        COC.currentStage.setScene(COC.sceneTwo);//車廂二
    }

    //翻找行李
    @FXML
    public void OnfindsuitcasePress() throws IOException{
        if(man==true){
            text.setText("男子走到一個黑色側背包前拿出了鑰匙:「我找到我的背包，我們可以去停下電車了，\n" +
                    "我來負起責人讓我拿著鑰匙吧。」");
            findsuitcase.setVisible(false);
            Persuademan.setVisible(true);
        }
        else{
            Observe.setVisible(true);
            findsuitcase.setVisible(false);
            text.setText("請做觀察判定");
        }
    }
    //說服男人
    @FXML
    public void OnPersuademanPress() throws IOException{
        Persuademan.setVisible(false);
        persuade.setVisible(true);
    }
    //說服判定
    @FXML
    public void OnPersuadePress() throws IOException{
        int persuade = 0;
        persuade = (int)(Math.random()*10);
        if(persuade<5){
            key1=false;
            text.setText("男子拒絕將鑰匙給你。");
        }
        else{
            key1=true;
            text.setText("男子被你說服後將鑰匙交給了你。");
            key.setVisible(true);
        }
    }

    //觀察判定
    @FXML
    public void OnobservePress() throws IOException {
        int observe = 0;
        int success =0;
        observe = (int)(Math.random()*100);
        if(ask==true){
            success=70;}
        else{success=50;}

        if(observe < success){
            key1=true;
            text.setText("你找到了男子落下的包，包裡裝著一把鑰匙。");
            Observe.setVisible(false);
            key.setVisible(true);
        }
        else{
            key1=false;
            text.setText("你沒發現特別的東西");
            finding.setVisible(true);
            Observe.setVisible(false);
        }
    }

    //仔細翻找
    @FXML
    public void OnfindingPress() throws IOException {
        key1=true;
        text.setText("在經過了一段時間的尋找你終於找到了一個黑色的側背包，裡面裝著鑰匙，\n" +
                "就在這時你聽到了車廂後方傳來了叭哩叭哩的聲響，你回頭看去，\n" +
                "那是一張大嘴正在啃蝕著後半截的車廂，一陣恐慌從心底襲來，你的腦子只剩下了逃離兩個字。");
        backward.setVisible(false);
        finding.setVisible(false);
        key.setVisible(true);

    }
}
