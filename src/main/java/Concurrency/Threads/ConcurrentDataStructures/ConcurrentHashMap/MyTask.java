package Concurrency.Threads.ConcurrentDataStructures.ConcurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

public class MyTask extends Thread{
        ConcurrentHashMap<Integer, String> map;

        MyTask(ConcurrentHashMap<Integer, String> map) {
            this.map = map;
        }

        @Override
        public void run() {
            map.put((int)(Math.random() * 100), Thread.currentThread().getName());
        }
    }
