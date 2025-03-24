import BTATestMethods.BTATestMethods;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;

public class BTATest {
    @Test
    public static void main() {
        open("https://www.bta.lv");//1. Atver BTA lapu
        BTATestMethods.Solis2();
        BTATestMethods.Solis3();
        BTATestMethods.Solis4();
        BTATestMethods.Solis5();
        BTATestMethods.Solis6();
        BTATestMethods.Solis7();
        BTATestMethods.Solis8();
        BTATestMethods.Solis9();
        BTATestMethods.Solis10();
        BTATestMethods.Solis11();
        BTATestMethods.Solis12();
        BTATestMethods.Solis13();
    }
}