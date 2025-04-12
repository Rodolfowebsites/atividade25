package org.example.anotacao;

import java.lang.annotation.*;

public class TipoChave {
    @Documented
    @Target(ElementType.FIELD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface TipoChave {

        String value();
    }
}
