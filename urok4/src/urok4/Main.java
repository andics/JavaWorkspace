package urok4;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
public class Main {
    private static final String OUTPUT_FILE = "C:\\Users\\cpt2egi\\Desktop\\JavaOutputTest.txt";
    public static void main(String[] args) {
        Chovek ppl=new Chovek("gosho",14,true);
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(OUTPUT_FILE))) {
            out.writeObject(ppl);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(OUTPUT_FILE));
        // read and print what we wrote before
        System.out.println("" + ((Chovek) ois.readObject()).getAge());
        ois.reset();
        System.out.println("" + ((Chovek) ois.readObject()).getPol());
        ois.reset();
        System.out.println("" + ((Chovek) ois.readObject()).getAge());
        } catch (IOException e) {
        	e.printStackTrace();
        } catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    }
}
