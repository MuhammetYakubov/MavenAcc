package Data;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestData {

    @Test
    public void m() throws IOException {
        Properties p = new Properties();
        String path = "test.properties";
        FileInputStream file = new FileInputStream(path);
        p.load(file);
        System.out.println(p.getProperty("username"));
        System.out.println(p.getProperty("password"));
        System.out.println(p.getProperty("color"));
        System.out.println(p.getProperty("size"));
    }
}
