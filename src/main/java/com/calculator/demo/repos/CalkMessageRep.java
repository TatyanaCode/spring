package com.calculator.demo.repos;

import com.calculator.demo.dao.CalkMessage;
import org.springframework.data.repository.CrudRepository;

/**
 * author danilova.tatyana 27.11.2022
 * репозиторий
 */
public interface CalkMessageRep extends CrudRepository < CalkMessage, Integer> {
}
