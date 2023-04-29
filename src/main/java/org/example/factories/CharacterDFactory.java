package org.example.factories;

import org.example.characters.CharacterD;
import org.example.characters.ICharacterEsk;

public class CharacterDFactory extends AbstractCharacterFactory {
    @Override
    public ICharacterEsk getCharacter() {
        return new CharacterD();
    }
}
