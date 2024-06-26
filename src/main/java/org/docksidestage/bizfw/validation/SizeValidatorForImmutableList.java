/*
 * Copyright 2015-2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.docksidestage.bizfw.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraints.Size;

import org.eclipse.collections.api.list.ImmutableList;

/**
 * @author jflute
 */
public class SizeValidatorForImmutableList implements ConstraintValidator<Size, ImmutableList<?>> {

    protected int min;
    protected int max;

    @Override
    public void initialize(Size constraintAnnotation) {
        min = constraintAnnotation.min();
        max = constraintAnnotation.max();
    }

    @Override
    public boolean isValid(ImmutableList<?> value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        int size = value.size();
        return size >= min && size <= max;
    }
}
