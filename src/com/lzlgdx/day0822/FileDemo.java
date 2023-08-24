package com.lzlgdx.day0822;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/22 上午 09:39
 * @since jdk1.0
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {
        /*String pathname="D:"+File.separator+"file.txt";
        //建议直接写分隔符
        File file=new File(pathname);
        System.out.println(file.createNewFile());
        System.out.println(file);

        System.out.println(file.getName());
        System.out.println(file.isFile());
        System.out.println(file.length());*/

        /*File parent=new File("files");
        System.out.println(parent.mkdir());
        File file1=new File(parent,"a.txt");
        System.out.println(file1.createNewFile());
        System.out.println(parent.getAbsoluteFile());
        System.out.println(file1);
        System.out.println(file1.getName());

        File file2=new File("files/file.txt");
        file2.createNewFile();
        System.out.println(file2.isDirectory());

        boolean flag=file1.isFile();
        System.out.println(flag);*/

        /*File file3=new File("files/a/b/c");
//        System.out.println(file3.mkdirs());
        File file4=new File(file3,"c.txt");*/
//        System.out.println(file4.createNewFile());
//        System.out.println(file3.delete());
        /*File file=new File("files/a/b/c/d");
        System.out.println(Arrays.toString(file.listFiles()));
        System.out.println(Arrays.toString(file3.list()));
        File[] files1= file3.listFiles();
        System.out.println(Arrays.toString(files1));
        MyFileFilter fileFilter=new MyFileFilter();
        File[] files= file3.listFiles(fileFilter);
        System.out.println(Arrays.toString(files));*/


        File file5=new File("files");
        deleteDir(file5);



    }
    public static void deleteDir(File f){
        File[] files=f.listFiles();
        if (files!=null){//f是目录且不为空
            //for循环在删除文件，for结束后，会变成空目录
            for (File file : files) {
                if (file.isDirectory()) {
                    deleteDir(file);
                } else {
                    file.delete();
                }
            }
            f.delete();
        }
    }
}
class MyFileFilter implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        return pathname.isFile()&&pathname.getName().endsWith(".txt");
    }
}
