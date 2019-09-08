package com.springCloud.provider.annotation;

import org.hibernate.validator.internal.engine.constraintvalidation.ConstraintValidatorContextImpl;
import org.hibernate.validator.internal.metadata.descriptor.ConstraintDescriptorImpl;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * 〈一句话功能简述〉<br>
 * 〈验证是否是合法的int或者integer字段〉
 *
 * @author 娜苏苏
 * @create 2019/8/31
 */
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(
        validatedBy = {PatternInt.PatternIntCheck.class}
)
public @interface PatternInt {
    String message() default "验证失败";

    int[] val() default {};

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    public static class PatternIntCheck implements ConstraintValidator<PatternInt, Integer> {
        public PatternIntCheck() {
        }

        @Override
        public void initialize(PatternInt constraintAnnotation) {
            System.out.println(constraintAnnotation);
        }

        @Override
        public boolean isValid(Integer value, ConstraintValidatorContext context) {
            if (value == null) {
                return true;
            } else {
                PatternInt patternInt = (PatternInt)((ConstraintDescriptorImpl)((ConstraintValidatorContextImpl)context).getConstraintDescriptor()).getAnnotation();

                for(int i = 0; i < patternInt.val().length; ++i) {
                    if (value == patternInt.val()[i]) {
                        return true;
                    }
                }

                return false;
            }
        }
    }
}
