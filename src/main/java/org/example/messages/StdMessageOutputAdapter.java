package org.example.messages;

public class StdMessageOutputAdapter extends MessageOutputAdapter {
    @Override
    public void output(Message msg) {
        System.out.println(msg.message());
    }
}
