//package sekolah.lms.controller;
//
//import jakarta.validation.ConstraintViolationException;
//import jakarta.validation.UnexpectedTypeException;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//import sekolah.lms.utils.Res;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@RestControllerAdvice
//public class ErrorController {
//    @ExceptionHandler(ConstraintViolationException.class)
//    public ResponseEntity<?> handleConstraintViolationException(ConstraintViolationException e) {
//        List<String> message = new ArrayList<>();
//        HttpStatus status = HttpStatus.BAD_REQUEST;
//
//        if (e.getMessage().contains("name")) message.add("Name cannot bet blank!");
//
//        return Res.renderJson(null, message, status);
//    }
//
//    @ExceptionHandler(UnexpectedTypeException.class)
//    public ResponseEntity<?> unexpectedType(UnexpectedTypeException e) {
//        String message = e.getMessage();
//        HttpStatus status = HttpStatus.BAD_REQUEST;
//
//        if (e.getMessage().contains("birthDate")) {
//            message = "Birthdate cannot be blank!";
//        }
//
//        return Res.renderJson(
//                null,
//                message,
//                status
//        );
//    }
//
//    @ExceptionHandler(RuntimeException.class)
//    public ResponseEntity<?> runtimeException(RuntimeException e) {
//        String message = e.getMessage();
//        HttpStatus status = HttpStatus.BAD_REQUEST;
//
//        if (e.getMessage().contains("STUDENT WITH ID")) {
//            message = "STUDENT NOT FOUND!";
//        }
//
//        return Res.renderJson(null, message, status);
//    }
//}
