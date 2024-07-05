package sekolah.lms.utils;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WebResponse<T> {
    private String status;
    private T message;
    private T data;


}
