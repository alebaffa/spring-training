package com.alebaffa.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {
    private Logger logger = Logger.getLogger(getClass().getName());

    @Before("execution(void com.alebaffa..*.set*(*))")
    public void callSetters(JoinPoint joinPoint) {
        logger.info("Setters called..." +
                joinPoint.getKind() + "|" +
                joinPoint.getSignature() + "|" +
                joinPoint.getSourceLocation() + "|" +
                joinPoint.getStaticPart() + "|" +
                joinPoint.getTarget());
    }
}
