package com.sansoft.filemetadata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.util.Scanner;

@SpringBootApplication
public class FileMetadataApplication {

    public static void main(String[] args) {
        SpringApplication.run(FileMetadataApplication.class, args);

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String strPath = input.nextLine();

        File path = new File(strPath);

        System.out.println("getName: " + path.getName());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getPath: " + path.getPath());
        System.out.println("getStorageSpace: " + path.getUsableSpace()/1073741824 + "GB");

        input.close();
    }

}
