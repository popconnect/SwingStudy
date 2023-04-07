package file;

import java.io.*;

public class Lotto {
    public static void main(String[] args) {
        String inputFilePath = "lotto(1~1059).csv";
        String outputFilePath = "result.txt";
        int[] counts = new int[45];

        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFilePath));
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                for (String value : values) {
                    try {
                        int num = Integer.parseInt(value.trim());
                        if (num >= 1 && num <= 45) {
                            counts[num - 1]++;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("[에러]" + e.getMessage());
                    }
                }
            }
            br.close();

            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilePath));
            for (int i = 0; i < counts.length; i++) {
                bw.write((i + 1) + ": " + counts[i] + "\n");
            }
            bw.close();
        } catch (IOException e) {
        	System.out.println("[에러]" + e.getMessage());
        }
    }
}