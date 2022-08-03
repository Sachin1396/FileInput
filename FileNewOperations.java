import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.stream.IntStream;

public class FileNewOperations {

    public static void main(String[] args) {
        File fo = new File("D:SachinShetty.txt");
        try {

            if (fo.createNewFile()) {
                System.out.println("file created successfully");
            } else {
                System.out.println("file already exist");
            }
        }
        catch(Exception e){
            System.out.println("error");

            }
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the path for the directory");
        String path = scanner.next();
        System.out.println("enter the directory name u want to create");
        path = path+scanner.next();
        File fo1 = new File(path);
        boolean directory = fo1.mkdir();
        if(directory){
            System.out.println("directory created ");
        }
        else {
            System.out.println("directory exists already");
        }
        for(int i=1;i<5;i++){

            File f1 = new File(path);
        }
        }

    }

