package ru.tonkoshkurov.MySecondSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.tonkoshkurov.MySecondSpringBoot.model.Response;

@Service
public interface ModifyResponseService {
    Response modify(Response response);
}
