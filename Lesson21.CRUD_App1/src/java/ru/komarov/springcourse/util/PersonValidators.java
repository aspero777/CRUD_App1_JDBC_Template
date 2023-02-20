package ru.komarov.springcourse.util;

import org.springframework.validation.Errors;

import javax.validation.Validator;

public interface PersonValidators extends Validator {
    boolean supports(Class<?> aClass);

    void validate (Object o, Errors errors);
}
