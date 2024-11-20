import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // Створюємо папку \temp
        File tempDir = new File("temp");
        if (!tempDir.exists()){
            tempDir.mkdir();
        }
           // Створюємо файл \temp\input.txt
        File inputFile = new File(tempDir + "input.txt");
        try (FileWriter writer = new FileWriter(inputFile)){
            Scanner scanner = new Scanner(System.in);
            StringBuilder userInput = new StringBuilder();
            System.out.println("Введіть рядки тексту (для завершення введіть 'exit'):");

            while (true){
                String input = scanner.nextLine();
                if ("exit".equalsIgnoreCase(input)){
                    break;
                }
                writer.write(input + System.lineSeparator());
                userInput.append(input).append(System.lineSeparator());
            }
            // Виводимо увесь введений користувачем текст
            System.out.println("Введений текс: ");
            System.out.println(userInput.toString());
        }catch (IOException e){
            System.out.println("Помилка прироботі з файлом " + e.getMessage());
        }
    }
}
