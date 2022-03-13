package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BpToolsPage extends MainPage{

    public void clickCipher(){
        driver.findElement(sctCipher).click();
        wait(1);
    }

    public void selectCipherSection(){
        driver.findElement(cboAes).click();
        wait(1);
    }

    public void selectAlgorithm(){
        driver.findElement(rdoAes128).click();
        wait(1);
    }

    public void selectMode(){
        driver.findElement(rdoCbc).click();
        wait(1);
    }

    public void selectDataInput(){
        driver.findElement(rdoAscii).click();
        wait(1);
    }

    public void setKey(String key)  {
        driver.findElement(txtKey).clear();
        driver.findElement(txtKey).sendKeys(key);
        wait(1);
    }

    public void setData(String data){
        driver.findElement(txtData).click();
        driver.findElement(txtData).clear();
        driver.findElement(txtData).sendKeys(data);
        wait(1);
    }

    public void setIv(String iv){
        driver.findElement(txtIv).clear();
        driver.findElement(txtIv).sendKeys(iv);
        wait(1);
        driver.quit();
    }
}
