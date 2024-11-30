package decorator.jdk;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

public class Main {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    // Пример из JDK - система ввода вывода

    FileInputStream fis = new FileInputStream("/objects.gz");
    BufferedInputStream bis = new BufferedInputStream(fis);
    DataInputStream dis = new DataInputStream(fis);
    ZipInputStream zis = new ZipInputStream(fis);
    GZIPInputStream gis = new GZIPInputStream(bis);
    ObjectInputStream ois = new ObjectInputStream(gis);
    Object someObject = ois.readObject();
  }
}
