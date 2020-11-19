package decorator.ioDecorator;

import java.io.*;

/**
 * @author liudeng
 * @date 2020/11/19 上午10:45
 * @since
 **/
public class Test {
    public static void main(String[] args) {
        int c;
        try {
            InputStream inputStream = new LowerCaseInputStream(new BufferedInputStream(
                    new FileInputStream("/Users/liudeng/Desktop/test.txt")
            ));
            while ((c = inputStream.read()) >= 0) {
                System.out.print((char)c);
            }
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
