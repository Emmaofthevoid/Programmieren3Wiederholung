package FileIO.Uebung18;

import java.io.*;
import java.util.ArrayList;

public class AddressManager {
    ArrayList<Address> listOfAddresses;

    public AddressManager() {
        this.listOfAddresses = new ArrayList<>();
    }

    public void add(Address address) {
        listOfAddresses.add(address);
    }

    public void exportToCsv(String path, String separator) throws AddressExportException, AddressExportFileAlreadyExistsException {
        File newFile = new File(path);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        if (newFile.exists()) {
            throw new AddressExportFileAlreadyExistsException("File already exists");
        }

        try {
            fileWriter = new FileWriter(newFile);
            bufferedWriter = new BufferedWriter(fileWriter);

            for (Address a :
                    listOfAddresses) {
                bufferedWriter.write(a.getFirstName() + separator + a.getLastName() + separator + a.getMobilNumber() + separator + a.getEmail());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                throw new AddressExportException("FAIL");
            }
        }
    }

    public void loadFromCsv(String path, String separator) throws AddressLoadException, AddressLoadWrongFormatException {
        FileReader fileReader;
        BufferedReader bufferedReader;

        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            ArrayList<Address> newArr = new ArrayList<>();

            while ((line = bufferedReader.readLine()) != null) {

                String[] temp = line.split(separator);
                if (temp.length != 4) {
                    throw new AddressLoadWrongFormatException("4 spalten erwartet");
                }
                newArr.add(new Address(temp[0], temp[1], temp[2], temp[3]));

                System.out.println(newArr);
            }
        } catch (IOException e) {
            throw new AddressLoadException("FAIL");
        }
    }
}
