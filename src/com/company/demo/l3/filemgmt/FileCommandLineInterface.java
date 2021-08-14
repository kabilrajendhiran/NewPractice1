package com.company.demo.l3.filemgmt;

import java.util.HashMap;

public class FileCommandLineInterface {

    public void doAction(String command, DirectoryModel currentDirectory)
    {
        String[] commandWords = command.split(" ");

        if(commandWords[0].equals("add"))
        {
            if (commandWords[1].equals("file"))
            {
                if(!commandWords[2].isEmpty())
                {
                    String filename = commandWords[2];
                    currentDirectory.getFiles().put(filename,new FileModel(filename));
                }
            }
            else if(commandWords[1].equals("dir"))
            {
                if(!commandWords[2].isEmpty())
                {
                    String dirname = commandWords[2];
                    currentDirectory.getSubDirectories().put(dirname, new DirectoryModel(dirname));
                }
            }
        }
        else if(commandWords[0].equals("cd"))
        {
            if (!commandWords[1].isEmpty())
            {
                HashMap<String,DirectoryModel> subDirectories= currentDirectory.getSubDirectories();
                String[] path = commandWords[1].split("/");
                for (String dirName:path) {
                    if(subDirectories.containsKey(dirName))
                    {
                        currentDirectory = subDirectories.get(dirName);
                    }
                    else
                    {
                        System.out.println("No such path exists");
                    }
                }
            }
        }
        else
        {
            System.out.println("404 not found");
        }

    }

}
