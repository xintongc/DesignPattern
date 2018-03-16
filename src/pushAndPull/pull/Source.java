package pushAndPull.pull;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class Source {
    private Scanner scanner;

    private void init(){
        try {
            scanner = new Scanner(new File("./data.txt"));

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    private LinkedList<String> itemInLine = new LinkedList<>();

    private void consumeLine(){
        String line = scanner.nextLine();
        String[] parts = line.split(",");
        for(String part : parts) {
            itemInLine.addLast(part.trim());
        }
    }

   public String nextItem(){
    if(scanner == null){ //延缓加载
        init();
    }

    if(itemInLine.isEmpty()){   //先看手里有没有东西
        if(!scanner.hasNextLine()){
            return null;
        }
        consumeLine();//如果itemInLine里没东西里，就再读一行
    }
    return itemInLine.removeFirst();//只返回第一个数，留下两个
   }
}
