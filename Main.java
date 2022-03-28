package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        QueueB<String> queue = new QueueB<>();

        Scanner input = new Scanner(System.in);

        int choose = 0;
        while(choose != 4){
            System.out.println("1. Masukan Data");
            System.out.println("2. Hapus Data");
            System.out.println("3. Cetak Data");
            System.out.println("4. Exit");
            choose = input.nextInt();
            if(choose == 1){
                System.out.println("Masukan list yang anda inginkan");
                String tDL = input.next(); /* Inputan To Do List*/
                queue.enqueue(tDL);
                System.out.println();
            }
            else if(choose == 2){
                queue.dequeue();
                System.out.println("berhasil dihapus");
                System.out.println();
            }
            else if(choose == 3){
                queue.printQueue();
                System.out.println();
            }
        }
    }
}