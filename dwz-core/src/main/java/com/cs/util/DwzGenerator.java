package com.cs.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import me.ahoo.cosid.provider.IdGeneratorProvider;

/**
 * @author: baitan
 * @date: 2022/4/7 20:49
 */
@Component
public class DwzGenerator {
    private final IdGeneratorProvider idGeneratorProvider;

    @Autowired
    public DwzGenerator(IdGeneratorProvider idGeneratorProvider) {
        this.idGeneratorProvider = idGeneratorProvider;
    }


}
