import com.automationanywhere.botcommand.GetFileSize;
import com.automationanywhere.botcommand.data.impl.NumberValue;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGetFileSize{

    @Test
    public void TestGetFileSizeDetails(){
        String filePath = "src/main/resources/icons/sample.svg";

        GetFileSize getFileSize = new GetFileSize();

        NumberValue output =getFileSize.action(filePath);
        System.out.println(output);

        Assert.assertEquals(output.getAsDouble(), 5027.0);
    }
}