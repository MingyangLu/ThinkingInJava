package com.cywri.leetcode;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class SingletonCPU {

     public static void main(String[] args){
         int[][] input = {{1,2},{2,4},{3,2},{4,1}};
         int[] result = new SingletonCPU().getOrder(input);
         System.out.println(result);
     }

    public int[] getOrder(int[][] tasks) {
        if(tasks.length == 0) return new int[]{};
        //CPU是否空闲
        boolean isFree = true;
        //CPU剩余执行时间
        int lestTime = 0;
        //CPU执行任务顺序
        List<Integer> result = new ArrayList<>();

        //等待队列（0=下标，1=所需执行时间）
        HashMap<Integer,Integer> enqueue = new HashMap<>();
        //调度集合（k=进入任务队列的时间，v=该时间下进入任务队列的若干任务（0=下标，1=执行时间））
        HashMap<Integer, List<int[]>> taskMap = sortTasks(tasks);
        int time = 1;
        while(!taskMap.isEmpty()){
            if (taskMap.containsKey(time)) {
                List<int[]> taskList = taskMap.get(time);
                taskList.forEach(task -> {
                    enqueue.put(task[0], task[1]);
                });
                taskMap.remove(time);
            }
            if (lestTime == 0){
                AtomicInteger leastProcessTime = new AtomicInteger(0);
                AtomicInteger leastIndex = new AtomicInteger(0);
                enqueue.forEach((index, processTime) -> {
                    if (processTime < leastProcessTime.get()){
                        leastIndex.set(index);
                        leastProcessTime.set(processTime);
                    } else if (processTime == leastProcessTime.get() && index < leastIndex.get()){
                        leastIndex.set(index);
                    }
                });
                result.add(leastIndex.get());
                enqueue.remove(leastIndex);
                lestTime = lestTime - 1;
            } else {
                lestTime--;
            }
            time++;
        }
        int[] resultArr = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArr[i] = result.get(i);
        }
        return resultArr;
    }


    public static HashMap<Integer, List<int[]>> sortTasks(int[][] tasks){
        HashMap<Integer, List<int[]>> map = new HashMap<>();
        for (int i = 0; i < tasks.length; i++) {
            int enqueueTime = tasks[i][0];
            int processTime = tasks[i][1];
            int[] task = {i, processTime};
            List<int[]> taskList = null;
            if(map.containsKey(enqueueTime)){
                 taskList = map.get(processTime);
            }else {
                 taskList = new ArrayList<>();
            }
            taskList.add(task);
            map.put(enqueueTime, taskList);
        }
        return map;
    }
}
