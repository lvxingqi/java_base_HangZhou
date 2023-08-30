package com.lzlgdx.fish;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

/**
 * @author 吕星琪
 * @version 1.10 2023/8/29 上午 10:34
 * @Description 让Fish类继承Thread，继承以后，Fish类具有并发执行的特性
 */
public class Fish extends Thread {
    private static final long serialVersionUID = -5667371495326512686L;
    private final Random r=new Random();
    //鱼的动画数组
    private final BufferedImage[] animation=new BufferedImage[10];
    private BufferedImage type;
    private int width;
    private int height;
    private int x;
    private int y;
    //鱼的速度1~5随机
    private int step;
    //index为全局变量，也是成员变量，标识访问数组animation的下标
    private int index;
    //k负责记录是哪种鱼
    /*private int k;*/
    //是否被捕
    private boolean isCatch=false;
    //鱼被捕之后翻腾的图片
    private BufferedImage catch01;
    private BufferedImage catch02;

//    private String currentPathname;

    public Fish(String str) throws IOException {
        initFish(str);
        freshImages(str);
        catch01=ImageIO.read(new File("images\\"+str+"_catch_01.png"));
        catch02=ImageIO.read(new File("images\\"+str+"_catch_02.png"));

    }

    //初始化鱼
    public void initFish(String str){
        //设置要读的路径
        try {
            //读鱼的图片
            type= ImageIO.read(new File("images/"+str+"_00.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //给图片高度和宽度赋值
        width=type.getWidth();
        height=type.getHeight();
        //鱼的初始位置
        x=800;
        //假设鱼现在位于屏幕外，鱼的y坐标要减去自己的高度再减去上方面板的高度
        y=r.nextInt(600)-height-30;
        //y在屏幕上方，需要让鱼的位置下来一点,面板高度已经减过了
        if (y-height<0){
            y=y+height;
        }
        step=new Random().nextInt(5)+1;
    }

    @Override
    public void run() {
        //死循环,让鱼直线往前游，y坐标不变，x坐标减小
        while (true){
            //鱼正常游动
            move();
            //被抓了
            if (isCatch){
                //先扑腾几下，然后移到屏幕外边去
                goOut();
            }
            //鱼超出屏幕就重新进入池塘
            if (x<-width){
                goOut();
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void goOut(){
        x=800;
        y=r.nextInt(600-height-100);
        step=r.nextInt(5)+1;
        isCatch=false;
    }

    /*public void turnOver() throws InterruptedException {
        for (int i=0;i<=5;i++){
            type=catch01;
            Thread.sleep(100);
            type=catch02;
            Thread.sleep(100);
        }
    }*/

    private void move() {
        //x坐标减小，鱼从左往右游
        x-=step;
        //鱼的动画效果
        //从数组animation中依次取出10张图片
        type=animation[index];
        index++;
        if (index==10){
            index=0;
        }
    }
    //动画效果
    public void freshImages(String str){
        for (int i=0;i<animation.length;i++){
            try {
                animation[i]=ImageIO.read(new File("images\\"+str+"_0"+i+".png"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public BufferedImage getType() {
        return type;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //读取鱼的所有图片
    /*public ArrayList<String> readAllImagesName(){
        File file=new File("images/");
        ArrayList<String> imagesName= new ArrayList<>();
        if (file.isDirectory()){
            String[] list=file.list();
            if (list != null) {
                imagesName.addAll(Arrays.asList(list));
            }
        }
        return imagesName;
    }*/

    /*public ArrayList<String> getSpecialFileNamesByRegular(String reg){
        ArrayList<String> temp=readAllImagesName();
        ArrayList<String> fishFileName=new ArrayList<>();
        for (String s : temp) {
            if (s.matches(reg)||s.contains(reg)) {
                fishFileName.add(s);
            }
        }
        return fishFileName;
    }

    public static void main(String[] args) {
        System.out.println(new Fish().getCatchFishNames());
        System.out.println(new Fish().getCurrentPathname());
    }
    public ArrayList<String> getCatchFishNames(){
        String reg="catch";
        return getSpecialFileNamesByRegular(reg);
    }
*/
    public boolean isCatch() {
        return isCatch;
    }

    public void setCatch(boolean aCatch) {
        isCatch = aCatch;
    }

    /*public String getCurrentPathname() {
        return currentPathname;
    }*/
    /*public void setCurrentPathname(){
        String reg="^fish(\\d{2}|\\d{3})_\\d{2}.png$";
        k=r.nextInt(91)/10;
        currentPathname=getSpecialFileNamesByRegular(reg).get(k*10);
        System.out.println(getSpecialFileNamesByRegular(reg));
        if (k==0){
            k=10;
        }
    }*/
}
