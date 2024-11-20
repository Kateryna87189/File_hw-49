import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ВВедіть назву файлу або папки: ");
        String inputName = scanner.nextLine();

        File file = new File(inputName);

        if (file.exists()){
            if (file.isFile()){
                System.out.println(inputName + " - це файл.");
                System.out.println("Розмір файлу: "+ file.length()+" байтів");
            }else if (file.isDirectory()){
                System.out.println(inputName + " -це папка" );
                System.out.println("Вміст папки: ");
                File [] files = file.listFiles();
                if (files != null){
                    for (File f:files){
                        System.out.println(f.getName());
                    }
                }else {
                    System.out.println("Папка пуста");
                }
            }
        }else {
            System.out.println(inputName + " в цій директорії проєкту не існує...");
        }
    }
}