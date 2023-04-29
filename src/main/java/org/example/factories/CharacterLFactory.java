package org.example.factories;

import org.example.characters.CharacterL;
import org.example.characters.ICharacterEsk;

public class CharacterLFactory extends AbstractCharacterFactory {
    @Override
    public ICharacterEsk getCharacter() {
        return new CharacterL();
    }
}
