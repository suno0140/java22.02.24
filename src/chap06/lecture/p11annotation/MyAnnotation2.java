package chap06.lecture.p11annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//6.15.3 어노테이션 유지정책 3가지 
//Source(소스파일),Class(바이트코드 / 기본값),Runtime
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation2 {
	
}