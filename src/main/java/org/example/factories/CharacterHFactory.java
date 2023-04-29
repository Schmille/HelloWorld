package org.example.factories;

import org.example.characters.CharacterH;
import org.example.characters.ICharacterEsk;

public class CharacterHFactory extends AbstractCharacterFactory {
    @Override
    public ICharacterEsk getCharacter() {
        return new CharacterH();
    }
}
