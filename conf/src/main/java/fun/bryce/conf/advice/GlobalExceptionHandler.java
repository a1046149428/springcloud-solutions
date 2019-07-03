package fun.bryce.conf.advice;

import fun.bryce.exception.*;
import fun.bryce.global.RespEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataAccessException;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.multipart.MultipartException;

import java.sql.SQLException;
import java.util.Objects;

/**
 * @author bryce
 * 2019/7/1 13:58
 */

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler
{

    @ExceptionHandler(ServletRequestBindingException.class)
    public RespEntity servletRequestBindingExceptionHandler(ServletRequestBindingException e)
    {
        log.error("error", e);
        return RespEntity.unauthorized(e.getMessage() + ",请检查参数名称是否符合格式.");
    }

    @ExceptionHandler(ValidatedIllegalArgumentException.class)
    public RespEntity validatedIllegalArgumentExceptionHandler(ValidatedIllegalArgumentException e)
    {
        log.error("error", e);
        return RespEntity.unauthorized(Objects.requireNonNull(e.getBindingResult().getFieldError()).getDefaultMessage());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public RespEntity methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e)
    {
        log.error("error", e);
        return RespEntity.unauthorized(Objects.requireNonNull(e.getBindingResult().getFieldError()).getDefaultMessage());
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public RespEntity httpMessageNotReadableExceptionHandler(HttpMessageNotReadableException e)
    {
        log.error("error", e);
        return RespEntity.unauthorized("Required request body is missing,请求体无法解析,请检查请求体格式的有效性(或请求体内参数格式有误导致无法解析). ");
    }

    @ExceptionHandler(MultipartException.class)
    public RespEntity multipartExceptionHandler(MultipartException e)
    {
        log.error("error", e);
        return RespEntity.unauthorized(e.getMessage());
    }

    @ExceptionHandler(AuthenticationCredentialsNotFoundException.class)
    public RespEntity serviceErrorHandler(AuthenticationCredentialsNotFoundException e)
    {
        log.error("error", e);
        return RespEntity.unauthorized(e.getMessage());
    }

    @ExceptionHandler(UsernameNotFoundException.class)
    public RespEntity serviceErrorHandler(UsernameNotFoundException e)
    {
        log.error("error", e);
        return RespEntity.unauthorized(e.getMessage());
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public RespEntity serviceErrorHandler(ResourceNotFoundException e)
    {
        log.error("error", e);
        return RespEntity.badRequest(e.getMessage());
    }

    @ExceptionHandler(AuthenticationException.class)
    public RespEntity serviceErrorHandler(AuthenticationException e)
    {
        log.error("error", e);
        return RespEntity.unauthorized(e.getMessage());
    }

    @ExceptionHandler(ForbiddenException.class)
    public RespEntity forbiddenErrorHandler(ForbiddenException e)
    {
        log.error("error", e);
        return RespEntity.forbidden(e.getMessage());
    }

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public RespEntity forbiddenErrorHandler(HttpRequestMethodNotSupportedException e)
    {
        log.error("error", e);
        return RespEntity.forbidden(e.getMessage());
    }

    @ExceptionHandler(CaptchaException.class)
    public RespEntity captchaErrorHandler(CaptchaException e)
    {
        log.error("error", e);
        return RespEntity.badRequest(e.getMessage());
    }

    @ExceptionHandler(ServiceException.class)
    public RespEntity serviceErrorHandler(ServiceException e)
    {
        log.error("error", e);
        return RespEntity.badRequest(e.getMessage());
    }

    @ExceptionHandler(DaoException.class)
    public RespEntity daoErrorHandler(DaoException e)
    {
        log.error("error", e);
        return RespEntity.badRequest(e.getMessage());
    }

    @ExceptionHandler({SQLException.class, DataAccessException.class})
    public RespEntity sqlErrorHandler(Throwable e)
    {
        log.error("error", e);
        return RespEntity.internalServerError();
    }


    @ExceptionHandler(Throwable.class)
    public RespEntity globalErrorHandler(Throwable e)
    {
        log.error("internalServerError", e);
        return RespEntity.internalServerError("internalServerError : " + e.getMessage());
    }


}
