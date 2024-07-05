package sekolah.lms.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sekolah.lms.model.Student;
import sekolah.lms.service.StudentService;
import sekolah.lms.utils.PageResponseWrapper;
import sekolah.lms.utils.Res;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Student req) {
        return Res.renderJson(studentService.create(req), "STUDENT CREATED SUCCESSFULLY!", HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> getAll(
            @PageableDefault(size = 5) Pageable pageable,
            @RequestParam(required = false) String name
    ) {
        Page<Student> students = studentService.getAll(pageable, name);
        PageResponseWrapper<Student> result = new PageResponseWrapper<>(students);

        return Res.renderJson(
                result,
                "STUDENTS FETCHED SUCCESSFULLY!",
                HttpStatus.OK
        );
    }

    @GetMapping("{id}")
    public ResponseEntity<?> getOne(@PathVariable Integer id) {
        return Res.renderJson(
                studentService.getOne(id),
                "SUCCESS TO FETCH!",
                HttpStatus.OK
        );
    }

    @PutMapping("{id}")
    public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody Student req) {
        return Res.renderJson(
                studentService.update(id, req),
                "UPDATED SUCCESSFULLY!",
                HttpStatus.OK
        );
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id) {
        studentService.delete(id);

        return Res.renderJson(
                null,
                "DELETED SUCCESSFULLY!",
                HttpStatus.OK
        );
    }


}
