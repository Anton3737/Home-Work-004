import java.util.Scanner;

public class Translator { //27.05.2022
    public static void main(String[] args) {
        System.out.println("Доступні слова: Сонячно,Хмарно,Шторм,Вітряно,Дощ,Туман,Снігопад,Мороз,Град,Буревій,Спека,Ясно,Піщана буря");
        Scanner word = new Scanner(System.in);
        System.out.println("Введіть слово про погоду для перекладу: ");
        String Weather = word.nextLine();
        String str = "Переклад з UA на EN: ";
        switch (Weather) {
            case "Сонячно":
                System.out.println(str + "Sunny");
                break;
            case "Хмарно":
                System.out.println(str + "Cloudy");
                break;
            case "Шторм":
                System.out.println(str + "Thunderstorm");
                break;
            case "Вітряно":
                System.out.println(str + "Windy");
                break;
            case "Дощ":
                System.out.println(str + "Rain");
                break;
            case "Туман":
                System.out.println(str + "Fog");
                break;
            case "Снігопад":
                System.out.println(str + "Snowfall");
                break;
            case "Мороз":
                System.out.println(str + "Frost");
                break;
            case "Град":
                System.out.println(str + "Hail");
                break;
            case "Буревій":
                System.out.println(str + "Hurricane");
                break;
            case "Спека":
                System.out.println(str + "Hot");
                break;
            case "Ясно":
                System.out.println(str + "Clear");
                break;
            case "Піщана буря":
                System.out.println(str + "Sandstorm");
                break;
            default:
                System.out.println("Нажаль такого слова ще не додано до словника");
        }
    }
}
//Сонячно,Хмарно,Шторм,Вітряно,Дощ,Туман,Снігопад,Мороз,Град,Буревій,Спека,Ясно,Піщана буря