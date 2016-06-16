package javatar.service;

import java.util.Scanner;

public class ReadingUserInput {

    public ReadingUserInput() {
    }

    private static Scanner userInput = new Scanner(System.in);

    public int Hello() {
        String message = "Wybierz metodę wprowadzania w wprowadź odpowiednią cyfrę:\r\n1. Kod sesji z aplikacji Atena Aztec Reader\r\n2. Na podstawie serii pytań";
        System.out.println(message);
        int answer = userInput.nextInt();
        while (answer != 1 && answer != 2) {
            System.out.println(message);
            answer = userInput.nextInt();
        }
        return answer;

    }

    String GetSessionKey() {
        String message = "Wprowadź kod sesji z aplikacji";
        String answer = userInput.nextLine();
        while (answer.isEmpty()) {
            System.out.println(message);
            answer = userInput.nextLine();
        }
        return answer;

    }

//    public Car CreateCar(int answer) throws IOException {
//        CarIdentification carFinder = new CarIdentification();
//        if (answer == 2) {
//            return carFinder.FindingCarManagement();
//
//        } else if (answer == 1) {
//
//            GetJsonFromAtenaApi carFromAtenaApi = new GetJsonFromAtenaApi(GetSessionKey());
//            Car answerAztec = carFromAtenaApi.getUserCarData(carFromAtenaApi.getUserCar());
//            return carFinder.FindingCarByAztecCodeAnswer(answerAztec);
//
//        }
//        return null;
//
//    }
}
