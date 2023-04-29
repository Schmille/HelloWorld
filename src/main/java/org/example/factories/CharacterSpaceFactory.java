package org.example.factories;

import org.example.characters.CharacterSpace;
import org.example.characters.ICharacterEsk;

public class CharacterSpaceFactory extends AbstractCharacterFactory {
    @Override
    public ICharacterEsk getCharacter() {
        return new CharacterSpace();
    }
}
