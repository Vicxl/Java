package com.bittech.inter;

/**
 * Author: secondriver
 * Created: 2018/12/1
 */
public class QQMessage implements Message {
    
    @Override
    public void chat() {
        System.out.println("QQ聊天功能");
    }
    
    @Override
    public void transportFile() {
        System.out.println("QQ传输文件");
    }
}
