package chapter15;

import java.io.File;

public class FilenameFilterTest
{

    public static void main(String[] args)
    {
        File file = new File(".");

        String[] filenames = file.list((dir, name) -> name.endsWith(".java") || new File(name).isDirectory());
        //String[] filenames = file.list((dir, name) -> name.endsWith(".java") || dir.isDirectory());

        for (String filename : filenames)
        {
            System.out.println(filename);
        }

    }
}
