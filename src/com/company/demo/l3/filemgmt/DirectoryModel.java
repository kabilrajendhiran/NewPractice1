package com.company.demo.l3.filemgmt;

import java.util.HashMap;

public class DirectoryModel {
    private String directoryName;
    private boolean hidden;
    private HashMap<String,FileModel> files;
    private HashMap<String,DirectoryModel> subDirectories;
    private HashMap<String, Boolean> permissions;

    public DirectoryModel(String directoryName) {
        this.directoryName = directoryName;
        hidden = false;
        files = new HashMap<>();
        subDirectories = new HashMap<>();
        permissions = new HashMap<>();
    }

    public String getDirectoryName() {
        return directoryName;
    }

    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public HashMap<String, FileModel> getFiles() {
        return files;
    }

    public void setFiles(HashMap<String, FileModel> files) {
        this.files = files;
    }

    public HashMap<String, DirectoryModel> getSubDirectories() {
        return subDirectories;
    }

    public void setSubDirectories(HashMap<String, DirectoryModel> subDirectories) {
        this.subDirectories = subDirectories;
    }

    public HashMap<String, Boolean> getPermissions() {
        return permissions;
    }

    public void setPermissions(HashMap<String, Boolean> permissions) {
        this.permissions = permissions;
    }
}
