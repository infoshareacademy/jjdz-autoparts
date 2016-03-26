package javatar.service;

import javatar.model.Car;

import java.io.IOException;
import java.util.Scanner;

public class ReadingUserInput {

    public ReadingUserInput() {
    }

    public int Hello() {
        String message = "Wybierz metodę wprowadzania w wprowadź odpowiednią cyfrę:\r\n1. Aztec 2d code\r\n2. Na podstawie serii pytań";
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        while (answer != 1 && answer != 2) {
            System.out.println(message);
            answer = scanner.nextInt();
        }
        return answer;

    }

    public String GetSessionKey() {
        String message = "Wprowadź kod sesji z aplikacji";
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        while (answer.isEmpty()) {
            System.out.println(message);
            answer = scanner.nextLine();
        }
        return answer;

    }

    public Car CreateCar(int answer) throws IOException {
        CarIdentification carFinder = new CarIdentification();
        if (answer == 2) {
            return carFinder.FindingCarManagement();

        } else if (answer == 1) {

            JsonParserAztecCode carFromAtenaApi = new JsonParserAztecCode(GetSessionKey());
            Car answerAztec = carFromAtenaApi.getUserCarData(carFromAtenaApi.getUserCar());
            return carFinder.FindingCarByQCCodeAnswear(answerAztec);

        }
        return null;

    }
}
