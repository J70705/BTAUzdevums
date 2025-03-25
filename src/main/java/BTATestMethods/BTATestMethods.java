package BTATestMethods;

import java.time.Duration;
import BTASelectors.BTASelectors;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class BTATestMethods {
    public static void Solis2(){
        $(BTASelectors.sikdatnes).click(); //Piekrīt sīkdatnēm
        $(BTASelectors.celojumi).click(); //2. Pārvietojas uz ceļojuma polišu iegādi
    }
    public static void Solis3(){
        $(BTASelectors.galamerkis).click(); //Nospiež "Ceļojuma galamērķis" pogu
        $(BTASelectors.mekletValstis).click();//Nospiež "Izvēlies valstis"
        $(BTASelectors.pievienotValsti).click(); //Nospiež "Pievienot valsti"
        $(BTASelectors.valstsMeklesana).click();
        $(BTASelectors.valstsMeklesana).setValue("Indija"); //Ieraksta meklēšanas lodziņā "Indija"
        $(BTASelectors.Indija).click(); //Nospiež "Indija"
        $(BTASelectors.apstiprinatValsti).click(); //3. Nospiež "Apstiprināt"
    }
    public static void Solis4(){
        $(BTASelectors.galamerkaTeksts).shouldHave(exactText("Visa pasaule")); //4. Pārbauda, vai ceļojuma galamērķis ir "Visa pasaule"
    }
    public static void Solis5(){
        $(BTASelectors.apdrosinasanasTekstaSekcija).scrollIntoView(false); //Ritina lapu uz leju līdz apakšējai sekcijai, lai redzētu pārējās izvēlnes
        $(BTASelectors.celojumuAktivitates).click();
        $(BTASelectors.paaugstinataRiskaAktivitates).click(); //5. Nomaina aktivitātes uz "Paaugstināta riska aktivitātēm"
    }
    public static void Solis6(){
        $(BTASelectors.aktivitatesTeksts).shouldHave(exactText("Ar paaugstināta riska aktivitātēm")); //6. Pārbauda, vai aktivitāte nomainīta
    }
    public static void Solis7(){
        $(BTASelectors.sanemtPiedavajumu).click(); //7. Nospiež uz "Saņemt piedāvājumu"
    }
    public static void Solis8(){
        $(BTASelectors.programmuSekcija).shouldBe(visible, Duration.ofSeconds(30)); //Gaida, līdz programmas ir redzamas (gaidīšanas laiks - 30 sekundes)
        executeJavaScript("window.scrollTo(0, (document.body.scrollHeight/2.5))"); //Ritina lapu uz lapas vidu, lai varētu nospiest pogu
        try { //Pauze, lai varētu nospiest pogu
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        $(BTASelectors.optimalaisPlans).scrollIntoView(false);
        $(BTASelectors.optimalaisPlans).scrollIntoView(false);
        $(BTASelectors.optimalaisPlans).scrollIntoView(false);
        $(BTASelectors.optimalaisPlans).click(); // 8. Izvēlas Optimālo -> Turpināt
    }
    public static void Solis9(){
        $(BTASelectors.aizsardzibasForma).shouldBe(visible, Duration.ofSeconds(30)); //Gaida, līdz tiek parādīta forma
        $(BTASelectors.aisardzibasFormasDetalas).shouldBe(visible); //Pārbauda, vai ir parādīta forma par papildu aizsardzību
        $(BTASelectors.manaPolise).shouldBe(visible); //Pārbauda, vai ir redzama "Mana polise"
        $(BTASelectors.optimalaPolisesCena).shouldBe(visible); //Pārbauda, vai ir norādīta optimālās polises cena
        $(BTASelectors.kopejaPolisesSumma).shouldBe(visible); //9. Pārbauda, vai ir norādīta kopējā summa
    }
    public static void Solis10(){
        $(BTASelectors.labotDatusPoga).click(); //Nospiež uz "Labot datus"
        $(BTASelectors.apdrosinajumaSummasIzvelne).click(); //Nospiež uz "Apdrošinājuma summa" izvēlnes
        $(BTASelectors.summa2000EUR).click(); //Izvēlas 2000 EUR summu
        $(BTASelectors.polisesPogaApstiprinat).click(); //10. Nospiež "Apstiprināt"
    }
    public static void Solis11(){
        $(BTASelectors.pasriskaSumma).shouldHave(exactText("Pašrisks 2000 €")); //11. Pārbauda, vai ir nomainījusies summa
    }
    public static void Solis12(){
        $(BTASelectors.turpinatPecAizsardzibas).scrollIntoView(false);
        $(BTASelectors.turpinatPecAizsardzibas).click(); //12.Nospiež pogu "Turpināt"
    }
    public static void Solis13(){
        $(BTASelectors.celotajuDatuSekcija).shouldBe(visible, Duration.ofSeconds(30));

        $(BTASelectors.celotajaVardaLauks).shouldBe(visible); //13. Pārbauda, vai visi 3 lauki ir redzami un tukši
        $(BTASelectors.celotajaVardaLauks).shouldBe(empty);

        $(BTASelectors.celotajaUzvardaLauks).shouldBe(visible);
        $(BTASelectors.celotajaUzvardaLauks).shouldBe(empty);

        $(BTASelectors.celotajaPersonasKodaLauks).shouldBe(visible);
        $(BTASelectors.celotajaPersonasKodaLauks).shouldBe(empty);
    }
}