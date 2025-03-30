# BTAUzdevums

## Praktiskā uzdevuma palaišanas instrukcija

Lai palaistu uzdevumu, datorā ir jābūt instalētai šādai programmatūrai:
- Git
- Java 8 (JDK 1.8)
- Maven
- Programmatūras izstrādes vide (piem. IntelliJ IDEA, Eclipse IDE)
- Google Chrome

## Palaišanas soļi:

1. Ir jāizvēlas mape datorā, kurā glabāt projektu. Datorā jāatver terminālis un attiecīgajā mapē jāpalaiž sekojošā git komanda:

`git clone git@github.com:J70705/BTAUzdevums.git`

Izvēlētajā mapē izveidosies apakšmape "BTAUzdevums".

2. Atver programmatūras izstrādes vidē mapi BTAUzdevums. Lai testus varētu palaist, Maven ir nepieciešams lejupielādēt visas pakotnes, kas nepieciešamas projekta palaišanai. Piemēram, IntelliJ IDEA vidē tas notiks automātiski, atverot mapi BTAUzdevums, šim progresam var sekot līdzi apakšējā statusa joslā.

Alternatīva iespēja ir terminālī ieiet BTAUzdevums mapē un tur palaist komandu `mvn clean install`.

3. Lai palaistu testus, programmatūras izstrādes vidē jāatver projekts un jāpalaiž `BTATest.java` fails, kurš atrodas `src/main/java` direktorijā. Testi izpildīsies Google Chrome pārlūkprogrammā.
