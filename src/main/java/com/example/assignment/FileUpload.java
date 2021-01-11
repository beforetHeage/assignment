package com.example.assignment;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import java.io.File;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "FileUpload")
public class FileUpload extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletFileUpload sf = new ServletFileUpload(new DiskFileItemFactory()); // new Diskfile
        List<FileItem> multifiles = null; // create files for multiple file upload
        // some try/catch
        try {
            multifiles = sf.parseRequest(request);
        } catch (FileUploadException e) {
            e.printStackTrace();
        }
        assert multifiles != null;

        for( FileItem item : multifiles){
            try {
                /* Here you should write your own path
                go to Terminal
                write where you want to upload files using pwd command
                Change the name of your $PATH
                */
                item.write(new File("/Users/harmonyof/Desktop" + item.getName()));
                // above my path DONT FORGET TO CHANGE
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("File Uploaded");
    }
}
