package org.example;

import org.example.characters.ICharacterEsk;
import org.example.factories.*;
import org.example.messages.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AbstractCharacterFactory dFactory = new CharacterDFactory();
        AbstractCharacterFactory eFactory = new CharacterEFactory();
        AbstractCharacterFactory excFactory = new CharacterExclamationFactory();
        AbstractCharacterFactory hFactory = new CharacterHFactory();
        AbstractCharacterFactory lFactory = new CharacterLFactory();
        AbstractCharacterFactory oFactory = new CharacterOFactory();
        AbstractCharacterFactory rFactory = new CharacterRFactory();
        AbstractCharacterFactory spaFactory = new CharacterSpaceFactory();
        AbstractCharacterFactory wFactory = new CharacterWFactory();

        ICharacterEsk d = dFactory.getCharacter();
        ICharacterEsk e = eFactory.getCharacter();
        ICharacterEsk exc = excFactory.getCharacter();
        ICharacterEsk h = hFactory.getCharacter();
        ICharacterEsk l = lFactory.getCharacter();
        ICharacterEsk o = oFactory.getCharacter();
        ICharacterEsk r = rFactory.getCharacter();
        ICharacterEsk spa = spaFactory.getCharacter();
        ICharacterEsk w = wFactory.getCharacter();

        List<Character> characters = new ArrayList<>();
        characters.add(h.getUpper());
        characters.add(e.getLower());
        characters.add(l.getLower());
        characters.add(l.getLower());
        characters.add(o.getLower());
        characters.add(spa.getLower());
        characters.add(w.getUpper());
        characters.add(o.getLower());
        characters.add(r.getLower());
        characters.add(l.getLower());
        characters.add(d.getLower());
        characters.add(exc.getLower());

        AbstractMessageCreator<Character> creator = new CharacterMessageCreator();
        Message message = creator.createMessage(characters.iterator());
        MessageOutputAdapter adapter = new StdMessageOutputAdapter();

        adapter.output(message);
    }
}