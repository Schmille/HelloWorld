package org.example.factories;

import org.example.characters.CharacterE;
import org.example.characters.ICharacterEsk;

public class CharacterEFactory extends AbstractCharacterFactory {
    @Override
    public ICharacterEsk getCharacter() {
        return new CharacterE();
    }
}
