package com.company;

import java.io.*;
//Read strings from console. Write those strings in a file. Stop when input string is 'exit';

class Main {
    public static void main(String[] args) {

        BufferedReader br = null;
        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            String wholeText="";
            String input="";

            while (!(input.equalsIgnoreCase("exit"))){
                System.out.println(" Enter something: ");
                input = br.readLine();
                if (!(input.equalsIgnoreCase("exit")))
                wholeText += input+ " ";

                BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"));
                bw.write(wholeText);
                bw.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        } finally{
            if (br != null){
                try{
                    br.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
