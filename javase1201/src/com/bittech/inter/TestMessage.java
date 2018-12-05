package com.bittech.inter;

/**
 * Author: secondriver
 * Created: 2018/12/1
 */
public class TestMessage {
    
    public static void main(String[] args) {
        Message qq = new QQMessage();
        Message msn = new MSNMessage();
        
        qq.chat();
        qq.transportFile();
        
        msn.chat();
        msn.transportFile();
        
        
        MSNMessage msn1 = new MSNMessage();
        msn1.transportFile();
        
        Message.info();
    }
}
