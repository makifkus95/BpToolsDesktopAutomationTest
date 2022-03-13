import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.Step;
import org.example.BpToolsPage;
import org.junit.Assert;

public class BpToolsTest {
    BpToolsPage bpToolsPage;

    public BpToolsTest(){
        bpToolsPage = new BpToolsPage();
    }

    @Step("Bp-Tools uygulaması açılır.")
    public void initializeBpToolsApplication()  {
        bpToolsPage.initializeBpToolsApplication();
    }

    @Step("Yeni version uyarısı alınır, Tamam'a tıklanır.")
    public void clickPopupOk()  {
        bpToolsPage.clickPopupOk();
    }

    @Step("Cipher sekmesi altında <cipher> methodu açılır.")
    public void selectSection(String cipher)  {
        bpToolsPage.clickCipher();
        bpToolsPage.selectCipherSection();
    }

    @Step("Algorithm <algorithm> seçilir.")
    public void selectAlgorithm(String algorithm)  {
        bpToolsPage.selectAlgorithm();
    }

    @Step("Mode <mode> seçilir.")
    public void selectMode(String mode)  {
        bpToolsPage.selectMode();
    }

    @Step("Data Input <datainput> seçilir.")
    public void selectDataInput(String datainput)  {
        bpToolsPage.selectDataInput();
    }

    @Step("Key alanına <key> yazılır.")
    public void setKey(String key)  {
        bpToolsPage.setKey(key);
    }

    @Step("Data alanına <data> yazılır.")
    public void setData(String data)  {
        bpToolsPage.setData(data);
    }

    @Step("IV alanına <iv> yazılır.")
    public void setIv(String iv)  {
        bpToolsPage.setIv(iv);
    }

    @Step("Encrypt butonuna tıklanır.")
    public void clickEncrypt()  {
        bpToolsPage.clickEncrypt();
    }

    @Step("Encrypted Data ile dosya içeriği karşılaştırlır.")
    public void compareEncrypt()  {
        String text = bpToolsPage.getTesxtFile();
        Assert.assertTrue("Dosya içerikleri aynı değil",bpToolsPage.compare(text));
    }

    @AfterScenario
    public void quit(){
        bpToolsPage.quid();
    }
}
