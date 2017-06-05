package com.grow.college.base.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by qomo on 17-2-21.
 */
public interface BaseService {



    /**
     * Logger
     */
     default  Logger LOGGER() {
        return LoggerFactory.getLogger(getClass());
    }
}
