//import
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.*;
import java.io.BufferedWriter;
import java.io.File;  
import java.io.FileInputStream;  
import java.io.FileOutputStream;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.io.PrintWriter;  
import java.io.FileWriter;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.Random;

public class game extends Application {
    public static void main(String[] args) throws IOException{
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws IOException{

        //初始化狀態(0為未擁有)
        int P_hp = 13;//角色HP
        int P_san = 60;//角色理智值
        int insane = 0;//瘋狂狀態
        int check = 60;//判定基礎值
        int flashlight = 0;//手電筒擁有狀態
        int key = 0;//鑰匙擁有狀態
        int attendant = 0;//服務員跟隨狀態
        int pt;//骰子點數

        //判定範例
        pt = roll();
        checking("智商判定",pt,0,check);


        //封面
        //說明
        //車廂7
        //車廂6
        //車廂5
        //車廂4
        //車廂3
        //車廂2
        //車廂1
        //GE
        //BE
    }
    //擲骰
    public static int roll(){
        Random rd = new Random();
        int pt = rd.nextInt(99) + 1;
        return pt;
    }

    //判定
    private void checking(String 判定項目,int pt,int bouns,int check) {
        System.out.print(判定項目+": "+pt);
        int temp = check + bouns;
        if(pt <= check+bouns){
            System.out.println("<="+temp);
            System.out.println("判定成功");
        }
        else{
            System.out.println(">"+temp);
            System.out.println("判定失敗");
        }
    }
}

