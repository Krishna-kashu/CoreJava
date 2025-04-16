package com.message;

public class Message {
    private String sender;
    private String content;
        public Message() {
            System.out.println("no-arg constructor of Message");
        }

        public void sendMessage() {
            System.out.println("Running sendMessage() in Message");
        }
    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Message(Message ref) {
        this.sender = ref.sender;
        this.content = ref.content;
    }

    @Override
    public String toString() {
        return "Sender: " + sender + ", Content: " + content;
    }
}

