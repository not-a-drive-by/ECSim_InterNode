package edu.boun.edgecloudsim.utils;

public final class StaticfinalTags {
    /**penalty项系数**/
    public static final double alpha = 4;

    /**任务数量**/
    public static final int CloudletNum = 200;

    /**当前时间, 如果为负数，则无效*/
    public static int curTime=0;

    /**设备参数*/
    public static double lambda1 = 0.075; // 0.05job/slot
    public static double lambda2 = 0.075;
    public static double lambda3 = 0.075;

    public static double channelThres = 0.5;
    public static double disThres = 100;

    //分布的参数
}
