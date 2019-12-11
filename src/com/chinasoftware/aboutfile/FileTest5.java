package com.chinasoftware.aboutfile;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.EmptyFileFilter;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

/**
 * @author: DX
 * @date: 2019/12/11 15:25
 */
public class FileTest5 {
    public static void main(String[] args) {
        Collection<File> files = FileUtils.listFiles(new File("E:\\IdeaProjects\\learn\\vav"), EmptyFileFilter.NOT_EMPTY,null);
        for (File file : files){
            System.out.println(file.getAbsolutePath());
        }
        System.out.println("***********************************hhh*******************************************************");
        files = FileUtils.listFiles(new File("E:\\IdeaProjects\\learn\\vav"),EmptyFileFilter.NOT_EMPTY, DirectoryFileFilter.INSTANCE);

        for (File file : files){
            System.out.println(file.getAbsolutePath());
        }
        System.out.println("******************************************************************************************");

        try {
            FileUtils.copyFile(new File(""),new File(""));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
