package org.ema.tp1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AurorePhoto implements IPhoto{
    private int width = 10;
    private int id ;

    @Override
    public int width() {
        return width;
    }




}
