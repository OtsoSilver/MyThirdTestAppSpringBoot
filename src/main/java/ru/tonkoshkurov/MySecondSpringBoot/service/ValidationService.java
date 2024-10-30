package ru.tonkoshkurov.MySecondSpringBoot.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.tonkoshkurov.MySecondSpringBoot.exception.UnsupportedCodeException;
import ru.tonkoshkurov.MySecondSpringBoot.exception.ValidationFailedException;

@Service
public interface ValidationService {
    void isValid(BindingResult bindingResult) throws ValidationFailedException;

    void isSupportedUid(String Uid) throws UnsupportedCodeException;
}
