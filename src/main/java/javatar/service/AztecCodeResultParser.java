package javatar.service;

import javatar.model.Car;

public class AztecCodeResultParser {

    public static  void /*Car */CreateCar (String qrResult){

        String[] token = qrResult.split(";");
        for (int i = 0; i < token.length; i++) {
            System.out.println(token[i]);

        }
     //   return null;
    }

    public static void main(String[] args) {

        CreateCar("Marka:Opel;Model:Vectra;Silnik:12KM;Rocznik:2010");

    }
}
