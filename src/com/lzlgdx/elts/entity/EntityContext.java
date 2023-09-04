package com.lzlgdx.elts.entity;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/31 下午 05:18
 * @Description
 */
public class EntityContext {

    //<Integer,User>
    //账号    User对象,map键唯一，账号唯一，相对应
    private final Map<Integer,User> users=new HashMap<>();
    //无参构造
    public EntityContext(){
        loadUser();
        loadQuestion();
    }

    //读取user.txt文件中的内容
    private void loadUser() {
        File file=new File("elts\\user.txt");
        try {
            BufferedReader reader=new BufferedReader(new InputStreamReader
                    (new FileInputStream(file), StandardCharsets.UTF_8));
            String str;
            String[] attributes;
            //一次读一行
            while ((str=reader.readLine())!=null){
                str=str.trim();//去双端空格
                //读出文件中不以#开头的行和不含空行的行数据
                if (!str.startsWith("#")&&!str.equals("")){
                    //对读到的一行数据以:为记号，分割成一个字符串数组
                    attributes=str.split(":");
                    //使用分割出来的字符串数组创建一个用户，并以id为键，User为对象进行存储。
                    users.put(Integer.parseInt(attributes[0]),
                            new User(Integer.parseInt(attributes[0]),
                                    attributes[1], attributes[2],
                                    attributes[3], attributes[4]));
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public Map<Integer, Question> getQuestionMap() {
        return questionMap;
    }

    private final Map<Integer,Question> questionMap=new HashMap<>();
    private void loadQuestion(){
        try {
            BufferedReader reader=new BufferedReader(new InputStreamReader
                    (new FileInputStream("elts\\corejava.txt"),StandardCharsets.UTF_8));
            //暂存readLine()
            String str;

            //Question构造函数需要的属性
            String question = null;
            int[] answer = new int[4];
            int score = 0;
            int level = 0;
            //题目计数器
            int k=0;
            while ((str=reader.readLine())!=null){
                //提取出题的规则来
                //1、@answer=1/2/3,score=5,level=6(整体的一行)
                if (str.startsWith("@")){
                    String[] template=str.split(",");
                    //1、提取answer的值
                    String[] temp=template[0].split("=")[1].split("/");
                    for (int i=0;i<temp.length;i++){
                        //给answer赋值
                        answer[i]=Integer.parseInt(temp[i]);
                    }
                    //2、提取score的值
                    score=Integer.parseInt(template[1].split("=")[1]);
                    //3、提取level的值
                    level=Integer.parseInt(template[2].split("=")[1]);
                }
                //提取出题目来
                str=reader.readLine();
                if (str.endsWith(":")||str.endsWith("。")){
                    question=str;
                }
                //提取选项
                //这里我们让options成为局部变量，这样每次循环的options都是不同的，
                //下次循环上次的变量会被垃圾收集器收集掉，保证每次传参都不是同一个引用
                String[] options=new String[4];
                for (int i=0;i<4;i++){
                    options[i]=reader.readLine();
                }
                //创建对象并赋值
                //这里需要注意一下，数组的引用不能传入同一个，也就是options，因为每次
                //循环都在覆盖引用的实际的元素的值，然后不同map引用options就变成了同一个
                //所以会出现options全都一样这种问题。map内部应该会自己创建一个options数组，
                questionMap.put(k,new Question(question,options,answer,score,level));
                k++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private final HashSet<Question> questionHashSet=new HashSet<>();
    //根据题的序号得到问题，每次得到不同的问题，保证不是已经做过的问题
    //一次返回一个问题。
    public Question getRandomUniqueQuestion(){
        Random r=new Random();
        Question question=getQuestionMap().get(r.nextInt(61));
        while (!questionHashSet.add(question)){
            question=getQuestionMap().get(r.nextInt(61));
            if (questionHashSet.size()==getQuestionMap().size()){
                return null;
            }
        }
        return question;
    }

    //封装一个方法，根据id从集合User中获取User对象的方法
    public User findUserById(int id){
        return users.get(id);
    }
}
