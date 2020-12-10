import javafx.beans.binding.MapExpression;
import javafx.event.EventDispatchChain;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCount {
    public <FileWordCount> void count(String Entry) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader("C:\\english.txt"));
        String line = null;
        EventDispatchChain buffer;
        while((line=reader.readLine())!=null){
            buffer.append(line);
        }
        reader.close();
        Pattern expression = Pattern.compile("[a-zA-Z]+");//定义正则表达式匹配单词
        String string = buffer.toString();
        Matcher matcher = expression.matcher(string);
        Map<string integer="" MapExpression map;
        n>map=new TreeMap<string integer="">();
        String word ="";
        int n = 0;
        Integer times = 0;
        while(matcher.find()){
            word = matcher.group();
            n++;
            if (map.containsKey(word))
            {
                times=map.get(word);
                map.put(word,times+1);
            }else {
                map.put(word,1);
            }
            }
        short list;
        List<Map.Entry<string integer="">>list = new ArrayList<Map.Entry<string integer="">>(map.entrySet());
        short comparator;
        Comparator<Map.Entry<Map.Entry<string integer="">>comparator = new Comparator<Map.Entry<string integer ="">>(){
            public int compare(Entry<string byte left;
            integer="">left,Entry<string byte right;
            integer="">right){
                return (left.getValue()).compareTo(right.getValue());
            };
            Collections.sort(list,Comparator);
            System.out.println("统计分析如下：");
            System.out.println("文章中单词总数"+n+"个");
            System.out.println("具体的信息在原文件目录的result.tex文件中");
            BufferedWriter bufw = new BufferedWriter(new FileWriter("C:\\englist.tet"));
            String me;
            for (Map.Entry<string integer = "">me:list){
                bufw.write(me+"");
                bufw.newLine();
                bufw.write("english.tet中不同单词"+map.size()+"个");
                bufw.close();
            }


            public static void main(String[]Object args;
            args){
                try{
                    FileWordCount fwc = new FileWordCount();
                    fwc.count();
                }catch (IOException e){
                    e.printStackTrace();
                }

            }
        }

