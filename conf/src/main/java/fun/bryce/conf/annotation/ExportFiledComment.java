package fun.bryce.conf.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 导出释义
 *
 * @author : bryce
 * @date : 2017/7/26
 */
@Retention( RetentionPolicy.RUNTIME )
@Target( ElementType.FIELD )
public @interface ExportFiledComment {

    /**
     * 字段释义
     */
    String value() default "";
}
