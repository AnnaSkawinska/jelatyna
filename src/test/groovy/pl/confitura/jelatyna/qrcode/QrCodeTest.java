package pl.confitura.jelatyna.qrcode;

import net.glxn.qrgen.core.image.ImageType;
import net.glxn.qrgen.javase.QRCode;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class QrCodeTest {

    @Test
    @Ignore
    public void name() throws IOException {
        byte[] bytes = QRCode.from("zoqxIVPsL0da0XYobEWjrXi4qtwG5jZnzfsDVntkc0Xagbz2VMLwzPdgvYZsCk").to(ImageType.PNG).withSize(250,250).stream().toByteArray();
        Path path = Paths.get("/users/margielm/jelatyna/qrcode.png");
        Files.write(path, bytes);

    }
}