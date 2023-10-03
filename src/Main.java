import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        dataParse dP = new dataParse();
        inputValues iV = new inputValues();
        String newFileName = null;
        fileWrite fW = new fileWrite();

        HashMap<String, Object> data = dP.parsInputData();
        while (data.size() != 6) {
            try {
                throw new DateException();
            } catch (DateException e) {
                data = dP.parsInputData();
            }
            newFileName = data.get("lastName") + ".txt";
            StringBuilder sb = new StringBuilder();
            for (String str : data.keySet()) {
                sb.append(data.get(str));
                sb.append(" ");
            }

            System.out.println(data);
            String filePath = newFileName;
            System.out.println(filePath);
            fW.filesWrite(String.valueOf(sb), filePath); // Вызывается метод класса WriteFile для записи в файл

        }
    }
}


