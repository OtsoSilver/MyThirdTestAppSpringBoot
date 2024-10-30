package ru.tonkoshkurov.MySecondSpringBoot.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.tonkoshkurov.MySecondSpringBoot.exception.ValidationFailedException;
import ru.tonkoshkurov.MySecondSpringBoot.exception.UnsupportedCodeException;
import java.util.Objects;


@Service
public class RequestValidationService implements ValidationService{

    @Override
    public void isValid (BindingResult bindingResult) throws ValidationFailedException {
        if (bindingResult.hasErrors()) {
            throw new
                    ValidationFailedException(bindingResult.getFieldError().toString());
        }
    }

    @Override
    public void isSupportedUid(String Uid) throws UnsupportedCodeException {
        if(Objects.equals(Uid, "123")) {
            throw new UnsupportedCodeException("Неподдерживаемый Uid");
        }
    }
}
