package com.happybs.adapter;

import java.io.*;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class FileProperties implements FileIO{

    Map<String, String> properties;

    @Override
    public void readFromFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(new File(filename)));
        String line = reader.readLine();
        while(line != null) {
            System.out.println("read file by line : " + line);

            StringTokenizer st = new StringTokenizer(line,"=");
            if(st.countTokens() != 2)
                throw new RuntimeException("file input error : each line must be 'key = value' formed");

            this.setValue(st.nextToken(),st.nextToken());
            line = reader.readLine();
        }
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File(filename)));
        StringBuilder sb = new StringBuilder("");
        sb.append("#written by FileProperties\n");
        sb.append("#" + Calendar.getInstance().getTime().toString() + "\n");
        if(properties != null && !properties.isEmpty()) {
            properties.forEach((key,value) -> {
                sb.append(key + "=" + value + "\n");
            });
        }
        System.out.println(sb.toString());
        writer.write(sb.toString());
        writer.flush();
    }

    @Override
    public void setValue(String key, String value) {
        if(properties == null)
            properties = new HashMap<String, String>();

        properties.put(key,value);
    }

    @Override
    public String getValue(String key) {
        return properties.get(key);
    }
}
