package com.company.demo.l3.filemgmt;

import java.util.HashMap;

public class FileModel {
    private String fileName;
    private String content;
    private boolean hide;
    private HashMap<String,FileModel> files;
    private HashMap<String,DirectoryModel> directories;
    private HashMap<String,Boolean> permissions;

    public FileModel(String fileName) {
        this.fileName = fileName;
        this.content="";
        hide = false;
        this.files = new HashMap<>();
        this.directories = new HashMap<>();
        this.permissions = new HashMap<>();
        this.permissions.put("read",true);
        this.permissions.put("write",true);
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isHide() {
        return hide;
    }

    public void setHide(boolean hide) {
        this.hide = hide;
    }

    public HashMap<String, FileModel> getFiles() {
        return files;
    }

    public void setFiles(HashMap<String, FileModel> files) {
        this.files = files;
    }

    public HashMap<String, DirectoryModel> getDirectories() {
        return directories;
    }

    public void setDirectories(HashMap<String, DirectoryModel> directories) {
        this.directories = directories;
    }

    public HashMap<String, Boolean> getPermissions() {
        return permissions;
    }

    public void setPermissions(HashMap<String, Boolean> permissions) {
        this.permissions = permissions;
    }
}
