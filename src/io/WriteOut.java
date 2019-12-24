package io;

import java.io.*;

public class WriteOut {
    public static void main(String[] args) throws IOException {
        LogWriter.log("log info...");
    }
}

class LogWriter {
    // 可以写作配置：true写文件; false输出控制台
    private static boolean fileLog = true;
    private static String logFileName = "E:\\jmeter\\log.txt";

    public static void log(String info) throws IOException {
        OutputStream out = getOutputStream();
        out.write(info.getBytes("utf-8"));
    }

    public static OutputStream getOutputStream() throws IOException {
        if (fileLog) {
            File file = new File(logFileName);
            if (!file.exists())
                file.createNewFile();
            return new FileOutputStream(file);
        } else {
            return System.out;
        }


    }
}