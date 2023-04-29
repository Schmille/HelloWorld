package org.example.factories;

import org.example.characters.CharacterExclamation;
import org.example.characters.ICharacterEsk;

public class CharacterExclamationFactory extends AbstractCharacterFactory {
    @Override
    public ICharacterEsk getCharacter() {
        return new CharacterExclamation();
    }
}
