package javatar.service;

import com.google.zxing.*;
import com.google.zxing.aztec.AztecReader;
import com.google.zxing.common.HybridBinarizer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AztecCodeReader {


    public static String ReadPath(){
        System.out.println("Wprowadź ścieżkę do pliku z kodem Aztec:");
        String filePath;
        Scanner scanIn = new Scanner(System.in);
        filePath = scanIn.nextLine();
        scanIn.close();
        return filePath;
    }

    public  static String readAztecCode(File file) {
        boolean fileExists = file.exists();
        if (fileExists) {
            BufferedImage image = null;
            BinaryBitmap bitmap = null;
            Result result = null;
            try {
                image = ImageIO.read(file);
                int[] pixels = image.getRGB(0, 0, image.getWidth(), image.getHeight(), null, 0, image.getWidth());
                RGBLuminanceSource source = new RGBLuminanceSource(image.getWidth(), image.getHeight(), pixels);
                bitmap = new BinaryBitmap(new HybridBinarizer(source));
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (bitmap == null)
                return null;

            AztecReader reader = new AztecReader();
            try {
                result = reader.decode(bitmap);
                return result.getText();
            } catch (NotFoundException e) {

                e.printStackTrace();
            } catch (FormatException e) {

                e.printStackTrace();
            }
        } else {
            return ("Błędna ścieżka do pliku");
        }

        return null;
    }

//    public static void AllegroCategoryObject(String[] args) throws IOException, NotFoundException {
//
//        System.out.println(readAztecCode(ReadPath()));
//    }


}