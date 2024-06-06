package baby.ey.diary.dto;


import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class SleepRequestsDto {
    private Long id;
    private String content;
    private LocalDateTime created;
    private LocalDateTime modified;
}
