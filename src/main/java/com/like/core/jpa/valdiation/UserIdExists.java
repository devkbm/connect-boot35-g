package com.like.core.jpa.valdiation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy=UserIdExistsValidator.class)
public @interface UserIdExists {
	String message() default "SystemUser is not Exsists";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}
