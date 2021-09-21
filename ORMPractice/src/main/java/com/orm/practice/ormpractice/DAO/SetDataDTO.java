package com.orm.practice.ormpractice.DAO;

import com.orm.practice.ormpractice.entities.Teacher;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SetDataDTO {
    private Teacher teacher;
}
