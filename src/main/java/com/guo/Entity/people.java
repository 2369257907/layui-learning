package com.guo.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class people {
    private String id;
    private String username;
    private String sex;
    private String city;
    private String sign;
    private String experience;
    private String score;
    private String classify;
    private String wealth;
}
