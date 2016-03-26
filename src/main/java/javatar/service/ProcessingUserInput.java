package javatar.service;

import javatar.model.Car;

import java.io.IOException;

public class ProcessingUserInput {

    public Car CreateCar(int answer) throws IOException {
        ReadingUserInput userInput = new ReadingUserInput();
        CarIdentification carFinder = new CarIdentification();
        if (answer == 2) {
            return carFinder.FindingCarManagement();

        } else if (answer == 1) {

            JsonParserAztecCode carFromAtenaApi = new JsonParserAztecCode(userInput.GetSessionKey());
            Car answerAztec = carFromAtenaApi.getUserCarData(carFromAtenaApi.getUserCar());
            return carFinder.FindingCarByQCCodeAnswear(answerAztec);

        }
        return null;

    }
}
