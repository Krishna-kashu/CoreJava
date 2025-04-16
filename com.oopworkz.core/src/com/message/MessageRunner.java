package com.message;

public class MessageRunner {
        public static void main(String[] args) {
            Message msg = new Message();
            msg.sendMessage();

            Message msg1 = new TextMessage();
            msg1.sendMessage();

            System.out.println("**********");

            TextMessage text = new TextMessage();
            text.sendMessage();
            text.addEmoji();
            Message msg2 = new Message();
            msg2.setSender("Alice");
            msg2.setContent("Hello there!");

            Message msg3 = new Message(msg2);
            System.out.println(msg3);

        }
    }
