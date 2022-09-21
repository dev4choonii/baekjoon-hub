import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        final String surfix = "??!";
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        
        System.out.println(name + surfix);
    }
}