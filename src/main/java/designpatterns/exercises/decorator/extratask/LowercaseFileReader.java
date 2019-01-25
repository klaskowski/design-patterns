package designpatterns.exercises.decorator.extratask;

import java.io.*;

public class LowercaseFileReader extends FilterInputStream {

    protected LowercaseFileReader(InputStream in) {
        super(in);
    }

    public static void main(String[] args) {
        int c;
        try {
            InputStream in =
                    new LowercaseFileReader(
                    new BufferedInputStream(
                            new FileInputStream("README.md")));
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase((char) c));
    }

    public int read(byte[] b, int offset, int len) throws IOException {
        int result = super.read(b, offset, len);
        for (int i = offset; i < offset + result; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }
        return result;
    }
}
