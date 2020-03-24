package ini5;

import java.io.*;

public class Ini5 {
    public void exec(){
        String fileNameInput = "rosalind_ini5.txt";
        String FolderNameInput = "C:\\Users\\lelis\\IdeaProjects\\Rosalind-Java\\Village\\src\\ini5\\files\\in\\";
        String fileInput = FolderNameInput + fileNameInput;

        String fileNameOutput = "rosalind_ini5_rep.txt";
        String folderNameOutput = "C:\\Users\\lelis\\IdeaProjects\\Rosalind-Java\\Village\\src\\ini5\\files\\out\\";
        String fileOutput = folderNameOutput + fileNameOutput;

        try {
            String contentProcessed = readLineFile(fileInput);
            createFile(fileOutput, contentProcessed);
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }

    private String readLineFile(String fileInput) throws IOException {
        String nextLine = null;
        String newFile = "";
        LineNumberReader lineCounter = new LineNumberReader(new InputStreamReader(new FileInputStream(fileInput)));

        while ((nextLine = lineCounter.readLine()) != null) {
            if (nextLine == null)
                break;
            newFile += lineCounter.readLine() + "\n";
        }
        return newFile;
    }

    private void createFile(String fileOutput, String contentProcessed) throws IOException {
        FileOutputStream arq = new FileOutputStream(fileOutput);
        DataOutputStream gravarArq = new DataOutputStream(arq);
        gravarArq.writeUTF(contentProcessed);
        arq.close();
    }
}
