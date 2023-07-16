import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ToolsInformationReader {

    private ArrayList<Tools> itemsList; 
    FileReader fileReader;
    BufferedReader bufferedReader;

    public ToolsInformationReader(){

    itemsList = new ArrayList<Tools>();

    try {
      fileReader = new FileReader("C:\\Users\\NITRO 5\\eclipse-workspace\\RentalSystem\\src\\Tools");
      bufferedReader = new BufferedReader(fileReader);
      String line;
      while ((line = bufferedReader.readLine()) != null) {

        if (line.trim().isEmpty()) {
          continue;
        }
        String[] split = line.split("\\|");
        if (split.length >= 4) {
          String itemName = split[0];
          String itemImage = split[1];
          String itemDate = split[2];
          String itemDescription = split[3];
          String itemStatus = split[4];
          Tools item = new Tools(itemName , itemImage, itemDate, itemDescription, itemStatus);
          itemsList.add(item);
        }
      }
      bufferedReader.close();
      fileReader.close();
    } catch (IOException | ArrayIndexOutOfBoundsException e) {
      e.printStackTrace();
    }

   }

    public ArrayList<Tools> getItemsList() {
        return itemsList;
    }

}
