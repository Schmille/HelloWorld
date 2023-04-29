package org.example.factories;

import org.example.characters.CharacterW;
import org.example.characters.ICharacterEsk;

public class CharacterWFactory extends AbstractCharacterFactory {
    @Override
    public ICharacterEsk getCharacter() {
        return new CharacterW();
    }
}
