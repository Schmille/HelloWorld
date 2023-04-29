package org.example.factories;

import org.example.characters.CharacterR;
import org.example.characters.ICharacterEsk;

public class CharacterRFactory extends AbstractCharacterFactory {
    @Override
    public ICharacterEsk getCharacter() {
        return new CharacterR();
    }
}
