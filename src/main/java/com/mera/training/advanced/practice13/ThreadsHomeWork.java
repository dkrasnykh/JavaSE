package com.mera.training.advanced.practice13;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadsHomeWork {
    static CopyOnWriteArrayList<URL> links = new CopyOnWriteArrayList();
    static AtomicInteger bytesCount = new AtomicInteger(0);

    static {
        try {
            links.add(new URL("https://www.ldoceonline.com/dictionary/noticeable"));
            links.add(new URL("https://www.macmillandictionary.com/dictionary/british/noticeable"));
            links.add(new URL("https://dictionary.cambridge.org/ru/%D1%81%D0%BB%D0%BE%D0%B2%D0%B0%D1%80%D1%8C/%D0%B0%D0%BD%D0%B3%D0%BB%D0%B8%D0%B9%D1%81%D0%BA%D0%B8%D0%B9/noticeable"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        List<Thread> threadList = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for (URL link : links) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        writeToFile(link, "sequential.txt");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
            threadList.add(thread);
            thread.start();
        }

        for (Thread thread : threadList) {
            thread.join();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Время при последовательной загрузке (в секундах):" + (endTime - startTime) / 1000);
        System.out.println("Количество загруженных байт: " + bytesCount.get());
        System.out.println();


        bytesCount.set(0);
        startTime = System.currentTimeMillis();

        ExecutorService service = Executors.newFixedThreadPool(3);
        for (URL link : links) {
            service.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        writeToFile(link, "parallel.txt");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        endTime = System.currentTimeMillis();
        //как вывести итоги для ExecutorService?
        System.out.println("Время при параллельной загрузке (в секундах):" + (endTime - startTime) / 1000);
        System.out.println("Количество загруженных байт: " + bytesCount.get());
    }


    public synchronized static void writeToFile(URL link, String fileName) throws IOException {
        InputStream inputStream = link.openStream();
        OutputStream outputStream = new FileOutputStream(fileName, true);

        String header = "===== НАЧАЛО САЙТА <" + link.toString() + "> ======\n";
        outputStream.write(header.getBytes());

        byte[] buffer = new byte[1000];
        while (inputStream.available() > 0) {
            int count = inputStream.read(buffer);
            bytesCount.addAndGet(count);
            outputStream.write(buffer, 0, count);
        }
        String footer = "\n===== КОНЕЦ САЙТА <" + link.toString() + "> ======\\n";
        outputStream.write(footer.getBytes());

        inputStream.close();
        outputStream.close();
    }
}
