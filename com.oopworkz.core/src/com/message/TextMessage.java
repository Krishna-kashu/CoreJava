package com.message;
    public class TextMessage extends Message {
        public TextMessage() {
            System.out.println("no-arg constructor of TextMessage");
        }

        @Override
        public void sendMessage() {
            System.out.println("Running overridden sendMessage() in TextMessage");
        }

        void addEmoji() {
            System.out.println("Running addEmoji() in TextMessage");
        }
    }

