package com.github.bodrul2112.javascratchpad.guicestuff.example_gettingstarted.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import com.google.inject.BindingAnnotation;

@BindingAnnotation @Target({ FIELD, PARAMETER, METHOD }) @Retention(RUNTIME) // these are all a courtesy to your users so that they dont end up accidently using this class
public @interface UglyB
{
}
