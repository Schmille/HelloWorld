package org.example.messages;

import java.util.Iterator;

public abstract class AbstractMessageCreator<T> {
    public abstract Message createMessage(Iterator<T> messages);
}
