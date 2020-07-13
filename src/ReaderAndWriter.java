import java.io.*;
import java.util.ArrayList;

public class ReaderAndWriter {
    String filePath = "contact.txt";
    File file = new File(filePath);

    public void writeFile(ArrayList<Contact> contacts) throws IOException {

        FileOutputStream fos = new FileOutputStream(file);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(contacts);
        oos.flush();
        oos.close();
        bos.close();
        fos.close();
        System.out.println("Write to file completely!");
        Menu.showMenu();
    }

    public ArrayList<Contact> readFile(ArrayList<Contact> contacts) throws IOException {

        FileInputStream fis = null;
        BufferedInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
            ois = new ObjectInputStream(bis);
            contacts = (ArrayList<Contact>) ois.readObject();
            for (Contact contact: contacts) {
                System.out.println(contact);
            }
        } catch (ClassNotFoundException | NullPointerException e) {
            e.printStackTrace();
        } finally {
            assert ois != null;
            ois.close();
//            bis.close();
//            fis.close();
        }
        System.out.println("Read from file completely!");
        Menu.showMenu();
        return contacts;

    }
}
