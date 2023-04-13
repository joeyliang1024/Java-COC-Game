package coc.final_project;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import java.util.Random;

import java.io.IOException;

public class scene4Controller {
    String checkType = "";
    int pt = 0;
    int bonus = 0;
    int check = 60;
    int num = 0;
    boolean man = true;
    boolean success = false;
    @FXML
    ImageView normal;
    @FXML
    ImageView hurt;
    @FXML
    ImageView crazy;
    @FXML
    ImageView crazyHurt;
    @FXML
    ImageView attendant;
    @FXML
    Button 判定;
    @FXML
    Button 詢問情報;
    @FXML
    Button 救治男人;
    @FXML
    Button 帶他走;
    @FXML
    Button 不帶他走;
    @FXML
    Text text;
    @FXML
    AnchorPane 男人;

    @FXML
    public void OnBackwardPressed() throws IOException {
        COC.currentStage.setScene(COC.sceneBE);//GG
    }
    @FXML
    public void OnForwardPressed() throws IOException {
        COC.currentStage.setScene(COC.sceneThree);//車廂三
    }
    @FXML
    public void OnHealPressed() throws IOException {
        text.setText("請骰急救判定");
        判定.setVisible(true);
        checkType = "急救判定";
        判定.setText("急救判定");
        num = 1;
        救治男人.setVisible(false);
    }
    @FXML
    public void OnBringPressed() throws IOException {
        text.setText("你帶上了男人");
        男人.setVisible(false);
        //帶上男人
    }
    @FXML
    public void OnNotBringPressed() throws IOException {
        text.setText("你將一名受傷的男人獨自留在了車廂裡");
        男人.setVisible(false);
        //不帶上男人
    }
    @FXML
    public void OnAskPressed() throws IOException {
        text.setText("男人跟你說:「我被一種人形的怪物襲擊了，我腳上的傷就是由此而來，我隨身攜帶的背包也在逃跑時落在了隔壁車廂，駕駛室的鑰匙也在裡面，我們快點把電車停下來逃跑吧，拜託幫幫我。」他有些語無倫次地說道。");
        if(man) {
            男人.setVisible(true);
            詢問情報.setText("查看情報");
            man = false;
        }
    }
    @FXML
    public void OnCheckPressed() throws IOException {
        pt = roll();
        success = checking(checkType,pt,bonus,check);
        判定.setVisible(false);
        if(success){
            if(num == 1){
                text.setText("男人緩緩醒來，看來你的急救十分有效，他醒來了，但看起來還有些驚魂未定。");
                詢問情報.setVisible(true);
                attendant.setVisible(true);
            }
        }
        else {
            if(num == 1){
                text.setText("你的急救功力還不夠熟練，你一翻操作下來，除了導致你滿手鮮血以外別無所用。");
            }
        }
    }
    //擲骰
    public static int roll(){
        Random rd = new Random();
        int pt = rd.nextInt(99) + 1;
        return pt;
    }

    //判定
    private boolean checking(String 判定項目,int pt,int bonus,int check) {
        int temp = check + bonus;
        if(pt <= check+bonus){
            text.setText(判定項目+": "+pt+"<="+temp+'\n'+"判定成功");
            return true;
        }
        else{
            text.setText(判定項目+": "+pt+"<="+temp+'\n'+"判定失敗");
            return false;
        }
    }
}
