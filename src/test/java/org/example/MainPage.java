package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class MainPage extends WiniumDireverElements {

    DesktopOptions option;
    WiniumDriver driver;

    public void wait(int miliseconds) {

        int secodns = miliseconds * 1000;
        try {
            Thread.sleep(secodns);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void initializeBpToolsApplication() {
        option = new DesktopOptions();
        option.setApplicationPath("C:\\Program Files\\EFTlab\\BP-Tools\\bin\\bp-ccalc.exe");
        driver = null;
        try {
            driver = new WiniumDriver(new URL("http://localhost:9999"), option);
            wait(5);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public void clickPopupOk(){
        driver.findElement(btnPopupOk).click();
        wait(1);
    }

    public void clearElements(By by){
        String a = driver.findElement(by).getText();
        int i = 0;
        while(i < a.length()){
            driver.findElement(by).clear();
            i++;
        }
    }

    public String getTesxtFile(){
        BufferedReader reader = null;
        try {
            File file = new File(".\\\\Tools\\\\Encrypt-Data");
            reader = new BufferedReader(new FileReader(file));
            String textFile = reader.readLine();
            return textFile;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
