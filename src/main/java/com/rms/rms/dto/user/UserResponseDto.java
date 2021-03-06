package com.rms.rms.dto.user;


import com.rms.rms.dto.schedule.ScheduleResponseDto;
import com.rms.rms.entity.Schedule;
import com.rms.rms.enums.Role;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserResponseDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String telephoneNumber;
    private String address;
    private Role role;
    private List<ScheduleResponseDto> schedules;

}
