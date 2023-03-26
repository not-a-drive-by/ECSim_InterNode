package edu.boun.edgecloudsim.utils;

public final class StaticfinalTags {
    /**penalty项系数**/
    public static final double alpha = 4;

    /**当前时间, 如果为负数，则无效*/
    public static int curTime=0;

    /**设备参数*/
    public static double channelThres = 0.5;
    public static double disThres = 100;

    public static double lambda1 = 0.3; // 0.05job/slot
    public static double lambda2 = 0.3;
    public static double lambda3 = 0.3;

    /**移动用户速度*/
    public static double velocity = 1.5;

    /**信道速率更新间隔*/
    public static int ratioInterval = 15;

    /**Quota最大值*/
    public static int quota = 4;
}
