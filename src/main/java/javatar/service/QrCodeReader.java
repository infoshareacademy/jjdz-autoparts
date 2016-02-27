package javatar.service;

import com.google.zxing.*;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.QRCodeReader;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class QrCodeReader {
    public static String readQRCode() {

        System.out.println("Wprowadź ścieżkę do pliku z QR kodem:");
        String filePath = System.console().readLine();
        File file = new File(filePath);
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

        QRCodeReader reader = new QRCodeReader();
        try {
            result = reader.decode(bitmap);
            return result.getText();
        } catch (NotFoundException e) {

            e.printStackTrace();
        } catch (ChecksumException e) {

            e.printStackTrace();
        } catch (FormatException e) {

            e.printStackTrace();
        }

        return null;
    }

    public static void main(String[] args) throws IOException, NotFoundException {

        System.out.println(readQRCode());
    }


}