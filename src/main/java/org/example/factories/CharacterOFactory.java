package org.example.factories;

import org.example.characters.CharacterO;
import org.example.characters.ICharacterEsk;

public class CharacterOFactory extends AbstractCharacterFactory {
    @Override
    public ICharacterEsk getCharacter() {
        return new CharacterO();
    }
}
