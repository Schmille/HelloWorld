package org.example.messages;

import org.example.messages.AbstractMessageCreator;
import org.example.messages.Message;

import java.util.Iterator;

public class CharacterMessageCreator extends AbstractMessageCreator<Character> {
    @Override
    public Message createMessage(Iterator<Character> messages) {
        StringBuilder builder = new StringBuilder();
        messages.forEachRemaining(builder::append);
        return new Message(builder.toString());
    }
}
